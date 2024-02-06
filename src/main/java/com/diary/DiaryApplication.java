package com.diary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication // 스프링 부트 실행 애노테이션
@ServletComponentScan // 서블릿 기능 실행 애노테이션
public class DiaryApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(DiaryApplication.class, args);
	}

}
