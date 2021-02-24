package com.chenyuhe.cn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 3)
public class SubApplication2 implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {

		System.out.println(">>>>>>>>> 服务器启动 order -------- > 3");
	}
}