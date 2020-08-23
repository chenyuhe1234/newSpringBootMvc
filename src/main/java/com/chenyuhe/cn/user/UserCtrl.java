package com.chenyuhe.cn.user;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserCtrl {


	// 从application.properties中拿到想要的值  体现了约定优于配置
	@Value("${Hello}")
	private String name;

	@RequestMapping("/test")
	public String test() {

		return name + "User Ctrl Hello World.....";
	}


}