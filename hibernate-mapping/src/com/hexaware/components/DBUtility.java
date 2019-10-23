package com.hexaware.components;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtility {
	public static SessionFactory createSessionFactory() {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		return sf;
	}
}

