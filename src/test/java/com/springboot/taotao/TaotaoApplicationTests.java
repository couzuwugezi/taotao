package com.springboot.taotao;

import com.springboot.taotao.dao.SysUserInfoDao;
import com.springboot.taotao.entity.SysUserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaotaoApplicationTests {

    @Autowired
    SysUserInfoDao sysUserInfoDao;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisTemplate<String, SysUserInfo> myRedisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public void test01() {
        myRedisTemplate.opsForValue().set("user", sysUserInfoDao.queryById(22));
    }

    @Test
    public void contextLoads() throws Exception {
        this.test01();
        SysUserInfo user = myRedisTemplate.opsForValue().get("user");
        System.out.println(user);
    }

}
