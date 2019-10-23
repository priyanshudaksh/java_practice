package com.hexaware.business;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.hexaware.model.Customer;

import com.hexaware.model.db.DAOUtilityImpl;



public class CustomerService {
	public static String store(String fname, String lname, Double mobile, String email) {
		EntityManager manager = DAOUtilityImpl.persistanceProvider();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		Customer c = new Customer();
		c.setFirstname(fname);
		c.setLastname(lname);
		c.setPhonenumber(mobile);
		c.setEmailid(email);
		manager.persist(c);
		tx.commit();
		System.out.println("Done !");
		return "Done";
	}
	public static Customer findById(int id) {
		EntityManager manager = DAOUtilityImpl.persistanceProvider();
		Customer cus = manager.find(Customer.class, id);
		return cus;
	}
	public static String updatePhone(int id, Double phone) {
		EntityManager manager = DAOUtilityImpl.persistanceProvider();
		Customer cus = manager.find(Customer.class, id);
		manager.getTransaction().begin();
		cus.setPhonenumber(phone);
		manager.getTransaction().commit();
		return "Done !!!!!";
	}
	public static String updateEmail(int id, String email) {
		EntityManager manager = DAOUtilityImpl.persistanceProvider();
		Customer cus = manager.find(Customer.class, id);
		manager.getTransaction().begin();
		cus.setEmailid(email);
		manager.getTransaction().commit();
		return "Done !!!!!";
				
	}
	public static List<Customer> ListAll() {
		EntityManager manager = DAOUtilityImpl.persistanceProvider();
		TypedQuery<Customer> qry = manager.createNamedQuery("Customer.findAll", Customer.class);
		List<Customer> customer = qry.getResultList();
		return customer;
		
	}
	public static List<Customer> ListSorted() {
		EntityManager manager = DAOUtilityImpl.persistanceProvider();
		TypedQuery<Customer> qry2 = manager.createNamedQuery("Customer.findsort", Customer.class);
		List<Customer> customer = qry2.getResultList();
		return customer;
		
	}
	public static String deleteById(int id) {
		EntityManager manager = DAOUtilityImpl.persistanceProvider();
		Customer emp = manager.find(Customer.class, id);
		manager.getTransaction().begin();
		manager.remove(emp);
		
		manager.getTransaction().commit();
		return "Done";
		
	}
}
