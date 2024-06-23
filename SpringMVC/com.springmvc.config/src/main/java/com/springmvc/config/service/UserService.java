package com.springmvc.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.config.dao.UserDao;
import com.springmvc.config.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(User user)
	{
		this.userDao.insertUserData(user);
		
	}

}
