package com.hexaware.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.components.DBUtility;

public class TestOneToOne {

	public static void main(String[] args) {
		SessionFactory sf = DBUtility.createSessionFactory();
		Session session = sf.openSession();
		
		Address address1 = new Address();
		address1.setAddressId(300);
		address1.setState("KA");
		address1.setCity("BLR");
		address1.setPin("560001");
		
		Address address2 = new Address();
		address2.setAddressId(400);
		address2.setState("TN");
		address2.setCity("CHN");
		address2.setPin("660001");
		
		Employee emp1 = new Employee();
		emp1.setEid(3);
		emp1.setName("Alex");
		emp1.setAddress(address1);
		
		Employee emp2 = new Employee();
		emp2.setEid(4);
		emp2.setName("Bruce");
		emp2.setAddress(address2);
		
		Transaction tx = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		tx.commit();
		session.close();
		sf.close();

	}

}
