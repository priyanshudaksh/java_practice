package com.hexaware.model.db;

import javax.persistence.EntityManager;

public interface DAOUtility {
	public EntityManager persistanceProvider();
	public void closeall();
}
