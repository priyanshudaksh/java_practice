package com.hexaware.model.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAOUtilityImpl{
	static EntityManagerFactory emf;
	static EntityManager em;
	public static EntityManager persistanceProvider() {
			
			emf = Persistence.createEntityManagerFactory("Customer-jpa");
			em = emf.createEntityManager();
			return em;
		
		
	}
public void closeall() {
	if (emf != null && em != null) {
		em.close();
		emf.close();
	}
}
}
