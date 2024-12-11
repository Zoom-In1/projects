package com.example.CoffeeShop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// react 연결시 필요
@Configuration
public class WebConfig implements WebMvcConfigurer {

	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")  // 모든 경로에 대해 CORS 설정
	                .allowedOrigins("http://localhost:3000")  // React 개발 서버 주소
	                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // 허용할 HTTP 메서드
	                .allowedHeaders("*")  // 모든 헤더 허용
	                .allowCredentials(true);  // 인증 정보 포함
	    }
	}

