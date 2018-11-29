package com.springboot.taotao.config;

import com.springboot.taotao.entity.SysUserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * @author liqiang
 * 时间 2018-11-29 17:28
 * 描述 redis自定义配置 指定保存实体类到redis中
 */
@Configuration
public class MyRedisConfig {

    @Bean
    public RedisTemplate<String, SysUserInfo> myRedisTemplate(RedisConnectionFactory connFactory) {
        RedisTemplate<String, SysUserInfo> template = new RedisTemplate<>();
        template.setConnectionFactory(connFactory);
        Jackson2JsonRedisSerializer<SysUserInfo> serializer = new Jackson2JsonRedisSerializer<>(SysUserInfo.class);
        template.setDefaultSerializer(serializer);
        return template;
    }
}
