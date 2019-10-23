package com.hexaware.model;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class TestDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id");
		int employeeid = sc.nextInt();
		EntityManager manager = DBUtility.persistanceProvider();
		Employee emp = manager.find(Employee.class, employeeid);
		manager.getTransaction().begin();
		manager.remove(emp);
		
		manager.getTransaction().commit();
		DBUtility.closeall();
	}
	

}
