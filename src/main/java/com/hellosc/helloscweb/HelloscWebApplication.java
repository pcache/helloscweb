package com.hellosc.helloscweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 容器初始化类
 * @author lx
 *
 */
@SpringBootApplication
@MapperScan("com.hellosc.helloscweb.mapper")
public class HelloscWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloscWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloscWebApplication.class, args);
	}
}
