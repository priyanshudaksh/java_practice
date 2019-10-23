package com.hexaware.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class TestNamedQuery {

	public static void main(String[] args) {
		EntityManager manager = DBUtility.persistanceProvider();
		TypedQuery<Employee> qry = manager.createNamedQuery("Employee.findAll", Employee.class);
		List<Employee> employees = qry.getResultList();
		for(Employee emp : employees) {
			System.out.println("Id: " + emp.getId());
			System.out.println("Name: " + emp.getName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("___________________________________");
		}
			TypedQuery<Object> qry2 = manager.createNamedQuery("Employee.findIdName", Object.class);
			List<Object> list2 = qry2.getResultList();
			for(Object e : list2) {
				Object[] obj = (Object[])e;
				System.out.println("Id: " + obj[0]);
				System.out.println("Name: " + obj[1]);
				//System.out.println("Salary: " + emp.getSalary());
				System.out.println("___________________________________");
		}
		DBUtility.closeall();
	}
	}



