package com.hexaware;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestTablePerHierarchy {

	public static void main(String[] args) {
		SessionFactory sf = DBUtility.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Programmer p1 = new Programmer();
		p1.setEid(100);
		p1.setName("Raj");
		p1.setTechnology("Java");
		
		session.save(p1);
		
		Manager m1 = new Manager();
		m1.setEid(200);
		m1.setName("Ram");
		m1.setEmployeecount(50);
		
		session.save(m1);
		
		tx.commit();
		session.close();
		sf.close();

	}

}
