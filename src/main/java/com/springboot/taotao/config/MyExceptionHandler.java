package com.springboot.taotao.config;

import com.springboot.taotao.exception.UserLoginException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liqiang
 * 时间 2018-11-04 19:59
 * 描述 异常处理器
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 自适应效果 : 浏览器请求返回页面,post访问返回json
     *
     * @return
     */
    @ExceptionHandler(UserLoginException.class)
    public String handleException(HttpServletRequest request) {
        request.setAttribute("javax.servlet.error.status_code", 500);

        return "forward:/error";
    }

}
