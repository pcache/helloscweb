package com.hellosc.helloscweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.hellosc.helloscweb.web.interceptor.DemoInterceptor;

/**
 * 用于注册各类拦截器
 * @author lx
 *
 */
@Configuration
public class MvcConfigurerAdapter extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new DemoInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
		super.addInterceptors(registry);
	}
	
}
