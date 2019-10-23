package com.hexaware.components;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestComponentMapping {

	public static void main(String[] args) {
		SessionFactory factory = DBUtility.createSessionFactory();
		Session session = factory.openSession();
		
		Contact contact = new Contact();
		contact.setPhone(99663378);
		contact.setEmailId("A@g.com");
		
		Customer customer = new Customer();
		customer.setName("Alex");
		customer.setContacts(contact);
		
		Transaction tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
		System.out.println("Done!");
		session.close();
		factory.close();
	}

}
