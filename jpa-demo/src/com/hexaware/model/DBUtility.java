package com.hexaware.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtility {
	static EntityManagerFactory emf;
	static EntityManager em;
	public static EntityManager persistanceProvider() {
			
			emf = Persistence.createEntityManagerFactory("jpa-demo");
			em = emf.createEntityManager();
			return em;
		
		
	}
public static void closeall() {
	if (emf != null && em != null) {
		em.close();
		emf.close();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
