package com.springboot.taotao;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayMarketingCardFormtemplateSetRequest;
import com.alipay.api.request.AlipayMarketingCardOpenRequest;
import com.alipay.api.request.AlipayMarketingCardTemplateCreateRequest;
import com.alipay.api.response.AlipayMarketingCardFormtemplateSetResponse;
import com.alipay.api.response.AlipayMarketingCardOpenResponse;
import com.alipay.api.response.AlipayMarketingCardTemplateCreateResponse;
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

    private static AlipayClient alipayClient = new DefaultAlipayClient(
            "https://openapi.alipay.com/gateway.do",
            "2018011201806350",
            "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCp+hQJfRGO0cvuGI5PhuFoyvWDGH7NxuoInyPGxT9KiiZ+WbqUeyM3UDWm+/j6JKX5sNaVMDj5PZsWmYNEKRarS9vdSK83JjLhFaSytt7ltI9gASBk0P3bi2MxquTUsExrlwjm6/O83qhADrO5YkxeEGT5Zxz7HCSqXgkI1EJEZqJj+rgoDTpVVYLaZyntOcITC8uyn7TRPE5D03MEtNHaCtr8zvOiyFXkx4oO7v4678mfYY1p8TK+YHTAstRUYhVbs0aJCVQ6fr/UKfSZ3aoVDDE39R4B32nrsDyseFi0u7NxqIK8+y2JEvSBb7Hq/x6c31Qu0/6oxEodXFHIuSY3AgMBAAECggEAcqUc3KWBsS2p+YaQfe1Anbi+zVQ5OrveYEBOFiQ2IyV4/yGwKbPANe+gsGclMDqFxBrVMLzcwKcfsqeKFPANvS2mNuNuYqkeChjaBDw5rP8S8TLxUW5wuqKSHg7g1t+uO6ccNvyQYiRfoQ0JhZFaZttx75HvxyLdTBeuyki4BX+CqYS3zhNTAvZ9c28ifAlgDcbndsl4EaYrA/N1AFyFVMfPLHBggu0pHBTGXMltm1R8XDoeiPlWIY6vPfhSmdICJBr0uWmHqCqMfFaOiYXSGQyAdvxlTMpM3bh+AfnqShvLaPcB8Ur5DJY/BLxBmLgPLCYgz3BvND8YlrugX9hqEQKBgQD3alMJt9KmoDGcKtD0nsr7r6shHPlT0zIzpgIseKdIv5mejjD1JyEAQjYsgyBBFZJqT8f3m6dx9UwE+XfgCmL1Flw2nrrgYTFkomBVP+ha74wDhCIUPCZAQSji0aN5W3Xsjn9NrpxpUmqdLul7pLZvlcQHInkVUGqcLIMzEKLOnwKBgQCv3+dqIRltGCAAReOhA9bpJFIGLacsUvhKl54tgvr8vtaEdYXvxtiaLm6sB10kkMRRPUXh7x1mxPaSO9CgIG77im6BymfWC3pr7rXrrrJkGcrtCzH24SjmQN4BIffwLzJ1mYsT5Hmo95wp+DLzuB36ZA7Ql51+AgzMeu1KgW85aQKBgDs4uQ2fcY2u1JEj8oZLKB0cjGLNs6Rr7h1MxEJu0uPn8NZyBKf5qL2OG7eF34eUqUpHNH9BQ9BUPdEHAbmf4tX1dzcfwW2J9i+3akWdmXmC00nYK+waBbHlpuq78VxQFyb7aN9oR0oyjxB2tS6CW6TT/WsTxlXivNILGZB0j/PTAoGAcVzuai8pl3M8dVCXN9sktKRvpoHYxq44UsRF9en+Y9mSplCmY3aVeVRCi+o3NHGHySGooMgi+HIuyPV7NSuSvdpt/oT7xzEg2N9GLcMuQ22IqqBTtWFOnpPjRXGiwhN5/+lXhxv2+12XMEpGdWgREqtaDUQdBPLHUypNN4AUtDkCgYBR9GY4WLjGdLO89MfwFRVzJn7ukuWRW3kyXI1CRz//qLq+SqUmExzJ18OZuLkaZYnyuKhjKdqNcujqQc8qUiiERcuPfQ1AhpH8PL32m1mKvA9XT7IwddPkWZknj7G656lfU9fUhvX4A1rPn6o9tu126bayQhlhenjq0pd9zJ+5RA==",
            "json",
            "UTF-8",
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi6ebbPH0lJ99jzNnMvJT7HVCLAiit7oRk0Ri1W3kByxknLRD34/wdJxKUcBrAtS0mZpj2y/l4Gh3lW6pzP5/Mglv1gypmX3ckYVmJ5qjyz0iBZQJZUVpqF8fGK2hj7A6ZbVE2atp8ihzUUhXPbT2SaJlDdWSh3kuakAiji7RYOvkr6DZckedXa5ismJQkfK31x5dBQ/e9MRd77DY5yb9BPdMD6OUfSOEe35YBpfmbyjHSm1P0EokC+SkBhH7CPzxi+NVP2PwA2o2ht6Wsd3F+7wCGM+Lln3tMEJbkqg5EsnDQEG+VFUu8M8gf3Uoj7H4zvba22qOhBa2Z5S5kfuMPwIDAQAB",
            "RSA2");

    /**
     * 创建卡模板
     */
    @Test
    public void createCardTemplate() {
        AlipayMarketingCardTemplateCreateRequest request = new AlipayMarketingCardTemplateCreateRequest();
        request.putOtherTextParam("app_auth_token", null);
        request.setBizContent("{"
                + "\"request_id\":\"" + System.currentTimeMillis() + "\","
                + "\"card_type\":\"OUT_MEMBER_CARD\","
                + "\"biz_no_prefix\":\"prexupdate\","
                + "\"biz_no_suffix_len\":\"10\","
                + "\"write_off_type\":\"qrcode\","
                + "\"template_style_info\":{"
                + "\"card_show_name\":\"个人卡包测试\","
                + "\"logo_id\":\"OKWBUiWCQ761MdRzP4PvUwAAACM****\","
                + "\"color\":\"rgb(55,112,179)\","
                + "\"background_id\":\"OKWBUiWCQ761MdRzP4PvUwAAACMA****\","
                + "\"bg_color\":\"rgb(55,112,179)\"},"
                + "\"template_benefit_info\":[{\"title\":\"消费即折扣\","
                + "\"benefit_desc\":[\"消费即折扣\",\"会员日7折扣\"],"
                + "\"start_date\":\"2016-08-18 15:17:23\","
                + "\"end_date\":\"2016-09-14 12:12:12\"}],"
                + "\"column_info_list\":[{\"code\":\"BENEFIT_INFO\",\"more_info\":{\"title\":\"扩展信息\",\"url\":\"http://www.baidu.com\","
                + "\"params\":\"{}\"},"
                + "\"title\":\"专属权益修改\",\"operate_type\":\"openWeb\",\"value\":\"会员权益\"},"
                + "{\"code\":\"BALANCE\",\"title\":\"余额\",\"value\":\"\"},"
                + "{\"code\":\"TELEPHOME\",\"title\":\"手机号码\",\"value\":\"15000784967\"},"
                + "{\"code\":\"Point\",\"title\":\"积分\",\"value\":\"100\"}"
                + "],"
                + "\"field_rule_list\":[{\"field_name\":\"Balance\",\"rule_name\":\"ASSIGN_FROM_REQUEST\",\"rule_value\":\"Balance\"},"
                + "{\"field_name\":\"Point\",\"rule_name\":\"CONST\",\"rule_value\":\"100\"}]}");
        AlipayMarketingCardTemplateCreateResponse response;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 卡模板配置
     *
     * @throws Exception
     */
    @Test
    public void configCard() throws Exception {
        AlipayMarketingCardFormtemplateSetRequest request = new AlipayMarketingCardFormtemplateSetRequest();
        request.setBizContent("{\n" +
                "  \"template_id\": \"20190402000000001507165000300962\",\n" +
                "  \"fields\": {\n" +
                "    \"required\": {\n" +
                "      \"common_fields\": [\n" +
                "        \"OPEN_FORM_FIELD_MOBILE\"\n" +
                "      ]\n" +
                "    },\n" +
                "    \"optional\": {\n" +
                "      \"common_fields\": [\n" +
                "        \"OPEN_FORM_FIELD_GENDER\"\n" +
                "      ]\n" +
                "    }\n" +
                "  }\n" +
                "}");
        AlipayMarketingCardFormtemplateSetResponse response = alipayClient.execute(request);
        System.out.println(response.getBody());
    }


    /**
     * 会员卡开卡
     *
     * @throws Exception
     */
    @Test
    public void openCard() throws Exception {
        AlipayMarketingCardOpenRequest request = new AlipayMarketingCardOpenRequest();
        request.putOtherTextParam("app_auth_token", null);
        request.setBizContent("{"
                + "\"out_serial_no\":\"" + System.currentTimeMillis() + "\","//唯一标识
                + "\"card_template_id\":\"20190402000000001507165000300962\","//会员卡模板id，通过模板创建接口返回得到
                + "\"card_user_info\":{"
                + "\"user_uni_id\":\"2088602312044688\"," //支付宝userid(一般2088开头)
                + "\"user_uni_id_type\":\"UID\"},"
                + "\"card_ext_info\":{\"external_card_no\":\"EXT0003\","//商户会员卡卡号
                + "\"open_date\":\"2019-04-02 14:20:00\",\"valid_date\":\"2020-02-20 21:20:46\",\"level\":\"VIP1\",\"point\":\"88\",\"balance\":\"124.89\"},"
                + "\"member_ext_info\":{\"name\":\"萧沫\",\"gende\":\"FEMALE\",\"birth\":\"2016-06-27\",\"cell\":\"13000000000\"}}");
        AlipayMarketingCardOpenResponse response = alipayClient.execute(request, null);
        System.out.println(response.getBody());
    }

}
