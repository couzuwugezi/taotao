package com.springboot.taotao.config;

import com.springboot.taotao.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.Arrays;
import java.util.List;

/**
 * @author liqiang
 * 时间 2018-10-28 22:47
 * 描述 自动配置扩展
 */
@Configuration
public class MyExtraConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/error").setViewName("/main/resources/templates/error/404.html");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/META-INF/resources/")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        List<String> pattens = Arrays.asList("/register", "/druid/*", "/checkInfo*", "/login*", "/**/*.js", "/**/*.css", "/**/fonts/*", "/error", "/", "/favicon.ico");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(pattens);
    }

    /**
     * 返回我们配置的locale,作为国际化处理
     *
     * @return
     */
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
