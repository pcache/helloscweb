package com.hellosc.helloscweb.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.hellosc.helloscweb.entity.User;

@MapperScan
public interface UserInfoMapper {

	public List<User> getUserList();
}
