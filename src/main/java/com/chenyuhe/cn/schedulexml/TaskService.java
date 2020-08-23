package com.chenyuhe.cn.schedulexml;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskService {


	@Scheduled(fixedRate = 3000)
	public void reportCurrentTime() {

		System.out.println("current Time:" + new Date());
	}
}