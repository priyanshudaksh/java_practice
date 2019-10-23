package com.hexaware.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestStoring {

	public static void main(String[] args) {
		DBUtility db = new DBUtility();
		/*EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-demo");*/
		//EntityManager manager = factory.createEntityManager();
		EntityManager manager = DBUtility.persistanceProvider();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		Employee e = new Employee();
		e.setName("Bruce");
		e.setSalary(35800);
		
		manager.persist(e);
		tx.commit();
		System.out.println("Done !");
		db.closeall();
		

	}

}
