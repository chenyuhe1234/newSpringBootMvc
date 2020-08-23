package com.chenyuhe.cn.scheduleannotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class TaskService02 {


	@Scheduled(fixedRate = 3000)
	public void reportCurrentTime() {

		System.out.println("current time002:" + new Date());
	}
}