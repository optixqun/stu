package com.tedu.service;

import java.util.List;

import com.tedu.pojo.User;

public interface userService {
	
	public List<User> findObjects();
	
	public void insertObjects(User user);
	
	public void updateObject(User user);
	
	public void deleteObject(Integer id);
}
