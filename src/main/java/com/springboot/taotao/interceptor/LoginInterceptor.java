package com.springboot.taotao.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liqiang
 * 时间 2018-10-31 22:54
 * 描述 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
//        String urlString = request.getRequestURI();
//        if (urlString.endsWith("checkInfo")) {
//            return true;
//        }
//        Object loginName = request.getSession().getAttribute("loginname");
//        // 请求的路径
//        String contextPath = request.getContextPath();
//        if (loginName == null) {
//            request.getSession().setAttribute("error", "您没有权限访问该页面,请先登录");
//            response.sendRedirect(contextPath + "/");
//            return false;
//        } else {
//            return true;
//        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }

}
