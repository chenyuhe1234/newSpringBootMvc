package com.chenyuhe.cn.user.ctrl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisCtrl {


	/**
	 * 从IOC容器中 拿到redisTemplate来直接使用
	 */
	@Autowired
	private RedisTemplate<String, String> redisTemplate;


	@GetMapping("/say")
	public String say() {

		System.out.println("正在进行日志的打印.............");
		return redisTemplate.opsForValue().get("name");

	}


}