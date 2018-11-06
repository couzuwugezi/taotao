package com.springboot.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author liqiang
 * 时间 2018-10-28 21:36
 * 描述 跳转页面controller
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/", "/login*"})
    public String login(HttpSession session) {
        Object loginName = session.getAttribute("loginname");
        if (loginName != null) {
            return "sys/home";
        } else {
            return "login";
        }
    }
}
