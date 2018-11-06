package com.springboot.taotao.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author liqiang
 * 时间 2018-10-31 22:10
 * 描述 国际化组件
 */
@Configuration
public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        // 获取页面链接的国际化配置
        String l = request.getParameter("l");
        // 如果参数没带,就用系统默认的
        Locale locale = Locale.getDefault();
        if (StringUtils.isNotBlank(l)) {
            String[] s = l.split("_");
            locale = new Locale(s[0], s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
