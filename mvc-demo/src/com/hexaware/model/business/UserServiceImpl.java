package com.hexaware.model.business;

import java.util.List;

import com.hexaware.ObjectFactory;
import com.hexaware.model.bean.User;
import com.hexaware.model.dao.UserDAO;
import com.hexaware.model.dao.UserDAOJdbcImpl;

public class UserServiceImpl implements UserService {

		private UserDAO dao;
		public  UserServiceImpl() {
			//dao = new UserDAOJdbcImpl();
			ObjectFactory factory = new ObjectFactory();
			dao = (UserDAO) factory.createObject("dao");
		}
	@Override
	public int store(User user) {
		
		return dao.store(user);
	}

	@Override
	public User findById(int userId) {
		return dao.findById(userId);
	}

	@Override
	public List<User> findAll() {
		return dao.findAll();
	}

	@Override
	public User login(int userId, String password) {
		return dao.login(userId, password);
	}

	@Override
	public int deleteById(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
