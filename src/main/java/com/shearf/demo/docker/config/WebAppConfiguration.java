package com.shearf.demo.docker.config;

import com.shearf.demo.docker.web.interceptor.AccessLogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by xiahaihu on 17/5/25.
 */
@Configuration
public class WebAppConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private AccessLogInterceptor accessLogInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessLogInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
