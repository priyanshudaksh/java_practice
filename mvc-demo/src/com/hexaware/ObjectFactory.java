package com.hexaware;

import com.hexaware.model.business.UserServiceImpl;
import com.hexaware.model.dao.UserDAOHibernateImpl;
import com.hexaware.model.dao.UserDAOJdbcImpl;

public class ObjectFactory {
	public Object createObject(String str) {
		Object obj = null;
		if(str.equalsIgnoreCase("service")) {
			obj = new UserServiceImpl();
		}
		if(str.equalsIgnoreCase("dao")) {
			obj = new UserDAOHibernateImpl();
		}
		return obj;
	}
}
