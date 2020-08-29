package com.chenyuhe.cn.user.ctrl;


import com.chenyuhe.cn.redisConfig.RedissonFactory;
import com.chenyuhe.cn.utils.SpringUtils;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
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
//	@Autowired
//	private RedisTemplate<String, String> redisTemplate;


//	@Autowired
//	private RedissonClient redissonClient;


//	@GetMapping("/say")
//	public String say() {
//
//		System.out.println("正在进行日志的打印.............");
//		return redisTemplate.opsForValue().get("name");
//
//	}


	/**
	 * redisson的对象桶的使用方式
	 *
	 * @return
	 */
	@GetMapping("/redissonTest")
	public String redissonTest() {


//		RBucket bucket = redissonClient.getBucket("user");
		RBucket bucket = RedissonFactory.redisson().getBucket("user");

		if (bucket.get() == null) {
			bucket.set(" {\n" +
					"\t\"username\":\"zhangsan\",\n" +
					"\t\"age\":18\n" +
					" }");
		}
		return bucket.get().toString();
	}


}