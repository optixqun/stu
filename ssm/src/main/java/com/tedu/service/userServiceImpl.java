package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;

@Service
public class userServiceImpl implements userService {
@Autowired
private UserMapper userMapper;
	@Override
	public List<User> findObjects() {
		// TODO Auto-generated method stub
		return userMapper.findObjects();
	}
	
	@Override
	public void insertObjects(User user) {
		// TODO Auto-generated method stub
		userMapper.insertObjects(user);
	}

	@Override
	public void updateObject(User user) {
		// TODO Auto-generated method stub
		userMapper.updateObject(user);
	}

	@Override
	public void deleteObject(Integer id) {
		// TODO Auto-generated method stub
		userMapper.deleteObject(id);
	}

}
