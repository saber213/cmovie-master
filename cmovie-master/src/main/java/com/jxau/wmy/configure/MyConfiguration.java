package com.jxau.wmy.configure;

import com.jxau.wmy.advice.UserInterceptor;
import com.jxau.wmy.utils.Myproperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class MyConfiguration implements WebMvcConfigurer {
    @Autowired
    private Myproperties myproperties;

    @Autowired
    private UserInterceptor userInterceptor;


    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor)
                .addPathPatterns("/book*")
                .addPathPatterns("/watch*")
                .addPathPatterns("/ticket")
                .addPathPatterns("/order");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations(
                "file:" + myproperties.getFilepath() + File.separator);
    }

}
