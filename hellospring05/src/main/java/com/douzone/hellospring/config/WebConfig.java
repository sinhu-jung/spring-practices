package com.douzone.hellospring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc //핸들러맵핑, 메시지 컨버터를 자동으로 해주는것
@ComponentScan({"com.douzone.hellospring.controller"})
public class WebConfig {
	
}
