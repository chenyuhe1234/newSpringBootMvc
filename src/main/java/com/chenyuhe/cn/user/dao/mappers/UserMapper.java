package com.chenyuhe.cn.user.dao.mappers;


import com.chenyuhe.cn.user.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {



	int insert(User user);


}