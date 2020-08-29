package com.chenyuhe.cn.redisConfig;

import com.chenyuhe.cn.utils.SpringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonFactory {

	protected static final Logger logger = LogManager.getLogger(RedissonFactory.class);


	/**
	 * 向Spring的IOC容器中注入redisson
	 */
	@Bean
	public RedissonClient getRedisson() {


		String address = "redis://192.168.80.161:6379";
		Config config = new Config();
		config.useSingleServer().setAddress(address);
		return Redisson.create(config);
	}


	public static RedissonClient redisson() {
		return SpringUtils.getBean(RedissonClient.class);
	}

}