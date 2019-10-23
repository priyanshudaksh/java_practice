package com.hexaware.model.dao;

import java.util.List;

import com.hexaware.model.bean.User;

public interface UserDAO {
	public int store(User user);
	public User findById(int userId);
	public List<User> findAll();
	public User login(int userId, String password);
	public int deleteById(int userId);
}
