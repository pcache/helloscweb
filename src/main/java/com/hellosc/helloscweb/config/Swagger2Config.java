package com.hellosc.helloscweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
/**
 * 配置restful api 文档生成
 * @ApiOperation 注解API说明
 * @ApiImplicitParam 注释字段
 * 访问方式 http://{path}/swagger-ui.html
 * @author lx
 *
 */
public class Swagger2Config {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.hellosc.helloscweb.web.controller")).paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Hellosc 接口文档")
				.description("接口列表：：")
				.termsOfServiceUrl("").contact("").version("1.0").build();
	}

}
