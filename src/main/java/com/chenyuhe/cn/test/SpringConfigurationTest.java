package com.chenyuhe.cn.test;

import com.chenyuhe.cn.config.Demo3Service;
import com.chenyuhe.cn.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigurationTest {

	/**
	 * 通过注解的方式去加载Bean
	 * @param args
	 */
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		System.out.println(context.getBean(Demo3Service.class).sayHello());
	}
}