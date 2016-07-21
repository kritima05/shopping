package com.niit.shoppingAdda.DAO;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.shoppingAdda.model.User;

@Repository
public class UserDAOImp implements UserDAO {

	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

}
