package com.chenyuhe.cn.user.service.impl;

import com.chenyuhe.cn.user.dao.mappers.UserMapper;
import com.chenyuhe.cn.user.domain.User;
import com.chenyuhe.cn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


	/**
	 * 代理对象
	 * 这个是Spring的包扫描 扫描不到的
	 *
	 * @param user
	 * @return
	 */
	@Autowired
	private UserMapper userMapper;


	@Override
	public int insert(User user) {


		// TODO 业务逻辑的处理
		return userMapper.insert(user);
	}
}