package com.springboot.taotao.controller.sys;

import com.alibaba.fastjson.JSONObject;
import com.springboot.taotao.dao.SysUserInfoDao;
import com.springboot.taotao.entity.SysUserInfo;
import com.springboot.taotao.util.MD5Util;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Optional;

/**
 * @author liqiang
 * 时间 2018-10-31 22:24
 * 描述 登录controller
 */
@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SysUserInfoDao sysUserInfoDao;


    @PostMapping(value = "/checkInfo")
    public String login(HttpServletRequest request, ModelMap map, HttpServletResponse response, @RequestParam("loginname") String loginname, @RequestParam("password") String password) {

        try {
            SysUserInfo info = new SysUserInfo();
            info.setLoginName(loginname);
            info.setLoginPassword(MD5Util.encryptMD5(password));
            List<SysUserInfo> users = sysUserInfoDao.queryAll(info);
            if (CollectionUtils.isEmpty(users)) {
                map.put("error", "用户名密码错误");
                response.sendRedirect("/");
            } else {
                request.getSession().setAttribute("loginname", loginname);
                return "redirect:/";
            }
        } catch (Exception e) {
            map.put("error", "系统错误");
            logger.error(e.getMessage());
        }
        return "login";
    }

    @GetMapping(value = "/logout")
    public String loginOut(HttpServletRequest request) {
        // 清除session
        Enumeration em = request.getSession().getAttributeNames();
        while (em.hasMoreElements()) {
            request.getSession().removeAttribute(em.nextElement().toString());
        }
        request.getSession().removeAttribute("sessionId");
        request.getSession().invalidate();
        String path = request.getContextPath();
        // 拼接跳转页面路径
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/login.htm";
        return "redirect:" + basePath;
    }

    @PostMapping(value = "/register")
    @ResponseBody
    public JSONObject register(SysUserInfo info, ModelMap map) {
        JSONObject obj = new JSONObject();
        try {
            SysUserInfo check = new SysUserInfo();
            check.setLoginName(info.getLoginName());
            int size = sysUserInfoDao.queryAll(check).size();
            if (size > 0) {
                obj.put("msg", "该用户已存在");
                return obj;
            }
            info.setIsStart("1");
            info.setUpdateTime(new Date());
            info.setUserStatus("1");
            int insert = sysUserInfoDao.insert(info);
            if (insert == 1) {
                obj.put("msg", "注册成功");
            } else {
                obj.put("msg", "注册失败");
            }
        } catch (Exception e) {
            map.put("error", "系统错误");
            logger.error(e.getMessage());
        }
        return obj;
    }

    /**
     * @param username
     * @Cacheable 先查询对应缓存, 如果存在就不执行方法,直接返回缓存里的值,如果不存在就执行方法,将返回值缓存起来
     */
    @GetMapping(value = "/getUser/{username}")
    @ResponseBody
    @Cacheable(cacheNames = "user", key = "#root.args[0]")
    public SysUserInfo getUser(@PathVariable("username") String username) {
        SysUserInfo check = new SysUserInfo();
        check.setLoginName(username);
        return Optional.ofNullable(sysUserInfoDao.queryAll(check)).map(list -> list.get(0)).orElse(null);
    }

    /**
     * @param info
     * @CachePut 注解:先调用方法,再更新缓存
     */
    @PostMapping(value = "/updateUser")
    @ResponseBody
    @CachePut(cacheNames = "user", key = "#info.loginName")
    public SysUserInfo updateUser(SysUserInfo info) {
        info.setUpdateTime(new Date());
        sysUserInfoDao.update(info);
        SysUserInfo select = new SysUserInfo();
        select.setId(info.getId());
        return Optional.ofNullable(sysUserInfoDao.queryAll(select)).map(list -> list.get(0)).orElse(null);

    }

}
