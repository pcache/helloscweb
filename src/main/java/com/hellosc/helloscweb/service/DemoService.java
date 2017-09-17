package com.hellosc.helloscweb.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.hellosc.helloscweb.entity.User;
import com.hellosc.helloscweb.mapper.UserInfoMapper;

@Service
public class DemoService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserInfoMapper userInfoMapper;

	public void test() {
		List<User> userList = userInfoMapper.getUserList();
		if (StringUtils.isEmpty(userList)) {
			userList = new ArrayList<User>();
		}
		logger.info("当前共有用户总计：：" + userList.size());
	}
}
