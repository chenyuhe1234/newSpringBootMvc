package com.chenyuhe.cn.schedulexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TaskMain {



	public static void main(String[] args) {


		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
	}
}