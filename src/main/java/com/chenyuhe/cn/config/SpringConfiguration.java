package com.chenyuhe.cn.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {


	@Bean
	public Demo3Service demo3Service() {

		return new Demo3Service();
	}

}