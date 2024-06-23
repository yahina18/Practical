package user.registration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import user.registration.model.User;


@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public int insertUserData(User user)
	{
		int i =(Integer)hibernateTemplate.save(user);
		return i;
	}
	
}
