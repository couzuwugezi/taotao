package com.springboot.taotao.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author liqiang
 * 时间 2018-08-15 22:29
 * 描述 aop输出日志
 */
@Aspect
@Configuration
public class MyLogError {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* com.springboot.taotao..*.*.*(..))")
    public void print() {
    }

    @AfterThrowing(pointcut = "print()", throwing = "e")
    public void handleThrowing(JoinPoint joinPoint, Exception e) {
        //类抛出的异常在这边捕获
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
        //开始打log
        logger.error("the method 【" + methodName + "】 in class 【" + className + "】 has an Exception:", e);
    }
}
