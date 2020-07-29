package com.ypf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ypf.beans.User;
import com.ypf.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper mapper;
	
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return mapper.queryAll();
	}

}
