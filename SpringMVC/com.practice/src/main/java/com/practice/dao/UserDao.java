package com.practice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.practice.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public int saveUser(User user) {
	
	    	int id = (Integer)this.hibernateTemplate.save(user);
	        return id;
	}

}
