package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.pojo.User;
import com.tedu.service.userService;
@RestController
@RequestMapping("/user")
public class userController {
	@Autowired
	private userService userService;
	@RequestMapping("/findObjects")
	public List<User> findObjects(){
		
		return userService.findObjects();
	}
	@RequestMapping("/insertObjects/{name}/{birthday}/{address}")
	public String insertObjects(User user){
		try{
			userService.insertObjects(user);
			return "insert success.";
		}catch(Exception e){
			e.printStackTrace();
			return "insert error.";
		}
	}
	@RequestMapping("/updateObject/{name}/{birthday}/{address}/{id}")
	public String updateObject(User user){
		try{
			userService.updateObject(user);
			return "update success.";
		}catch(Exception e){
			e.printStackTrace();
			return "update error.";
		}
	}
	
	@RequestMapping("/deleteObject/{id}")
	public String deleteObject(@PathVariable Integer id){
		try {
			userService.deleteObject(id);
			return "delete success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "delete error";
		}
	}
}
