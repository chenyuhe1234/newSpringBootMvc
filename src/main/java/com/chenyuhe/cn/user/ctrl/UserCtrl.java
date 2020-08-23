package com.chenyuhe.cn.user.ctrl;


import com.chenyuhe.cn.user.domain.User;
import com.chenyuhe.cn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserCtrl {


	// 从application.properties中拿到想要的值  体现了约定优于配置
	@Value("${Hello}")
	private String name;


	// 依赖于Service
	@Autowired
	private UserService userService;

	@RequestMapping("/test")
	public String test() {

		return name + "User Ctrl Hello World.....";
	}


	/**
	 * 添加用户信息
	 */
	@RequestMapping("/addUser")
	public String addUser(@RequestBody List<User> listUser) {


		try {
			for (User user : listUser) {

				userService.insert(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (CollectionUtils.isEmpty(listUser)) {
			return "请求参数有误";
		}

		return "success";


	}


}