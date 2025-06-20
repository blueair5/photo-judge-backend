package com.photo.judge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // 匹配所有路径
					.allowedOrigins("http://localhost:3000") // 允许的前端地址
					.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 允许的请求方法
					.allowedHeaders("*") // 允许的请求头
					.allowCredentials(true); // 是否允许携带凭证
			}
		};
	}
}
