package com.chenyuhe.cn.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {




	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration1.class);


		System.out.println(context.getBean(DemoService1.class).sayHello());
	}
}