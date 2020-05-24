package com.niuke.niukeservice.config;


import com.niuke.niukeservice.interceptor.AuthInterceptor;
import com.niuke.niukeservice.listener.RequestListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 添加拦截器
     */
    @Resource
    AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor).addPathPatterns("/**");

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("resources/**")  // resources是页面中引入静态资源的前缀
                .addResourceLocations("classpath:/static/") ; // 指定资源在项目中的具体路径
               /* .setCachePeriod(1); // 设置缓存周期单位为秒：7天*/
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public ServletListenerRegistrationBean listenerRegist() {
        ServletListenerRegistrationBean srb = new ServletListenerRegistrationBean();
        srb.setListener(new RequestListener());
        System.out.println("listener");
        return srb;
    }



}
