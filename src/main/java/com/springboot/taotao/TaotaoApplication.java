package com.springboot.taotao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author liqiang
 * @EnableCaching 开启基于注解的缓存
 */
@SpringBootApplication
@MapperScan(value = "com.springboot.taotao.dao")
@EnableCaching
public class TaotaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaotaoApplication.class, args);
    }
}
