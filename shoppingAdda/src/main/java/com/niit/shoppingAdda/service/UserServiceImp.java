package com.niit.shoppingAdda.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingAdda.DAO.UserDAO;
import com.niit.shoppingAdda.model.User;

@Service
public class UserServiceImp implements UserService {

	private UserDAO userDAO;
		@Transactional
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


   @Transactional
	public void addUser(User user) {
	   userDAO.addUser(user);
	}

}
