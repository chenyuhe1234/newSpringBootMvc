package com.chenyuhe.cn.scheduleannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskMain02 {
	
	
	
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(TaskConfiguration.class);
	}
}