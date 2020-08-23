package com.chenyuhe.cn.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration1 {


	/**
	 * 有这样的需求 我们需要我们的Bean在某个环境下不装载 已经装载过的不装载
	 * @return
	 */
	@Conditional(GpCondition.class)
	@Bean
	public DemoService1 demoService1(){
		return new DemoService1();
	}




}