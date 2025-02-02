package com.springmvc.config.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.config.model.User;

@Repository
public class UserDao {

	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Long insertUserData(User user)
	{
		 return (Long)hibernateTemplate.save(user);
		
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
