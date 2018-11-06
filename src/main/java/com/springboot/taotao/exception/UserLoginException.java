package com.springboot.taotao.exception;

/**
 * @author liqiang
 * 时间 2018-11-04 20:02
 * 描述 用户登录异常
 */
public class UserLoginException extends RuntimeException {

    public UserLoginException(String msg) {
        super(msg);
    }
}
