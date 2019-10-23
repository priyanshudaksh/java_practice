package com.hexaware.model;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class TestRetrieveById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id");
		int employeeid = sc.nextInt();
		EntityManager manager = DBUtility.persistanceProvider();
		
		Employee emp = manager.find(Employee.class, employeeid);
		if(emp != null) {
			System.out.println("Id = " + emp.getId());
			System.out.println("Name = " + emp.getName());
			System.out.println("Salary = " + emp.getSalary());
		}
		DBUtility.closeall();
	}

}
