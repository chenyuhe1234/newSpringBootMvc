package com.chenyuhe.cn.scheduleannotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("com.chenyuhe.cn.scheduleannotation")
@EnableScheduling
@Configuration
public class TaskConfiguration {
}