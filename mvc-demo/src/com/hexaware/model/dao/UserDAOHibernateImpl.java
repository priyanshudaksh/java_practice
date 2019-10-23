package com.hexaware.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.DBUtility;
import com.hexaware.model.bean.User;

public class UserDAOHibernateImpl implements UserDAO {

	@Override
	public int store(User user) {
		int generatedKey = 0;
		SessionFactory sf = DBUtility.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		generatedKey = (int)session.save(user);
		tx.commit();
		session.close();
		sf.close();
		return generatedKey;
	}

	@Override
	public User findById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(int userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
