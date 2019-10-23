package com.hexaware;

import java.util.List;
import java.util.Scanner;

import com.hexaware.business.CustomerService;
import com.hexaware.model.Customer;


public class TestCustomer {

	public static void main(String[] args) {
		CustomerService cs = new CustomerService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice");
		System.out.println("1. Store, 2. Find By Id, 3. Update Phone, 4. Update Mail, 5. List All, 6. List sorted, 7. Delete 8. Exit");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("First Name");
		String fname = sc.next();
		System.out.println("Last Name");
		String lname = sc.next();
		System.out.println("Phone Name");
		Double phone = sc.nextDouble();
		System.out.println("Email");
		String email = sc.next();
		String res = cs.store(fname, lname, phone, email);
		System.out.println(res);
		}
		if (choice == 2) {
			System.out.println("Id");
			int id = sc.nextInt();
			Customer cus = cs.findById(id);
			if(cus != null) {
				System.out.println("Id = " + cus.getCustomerid());
				System.out.println("F Name = " + cus.getFirstname());
				System.out.println("L Name = " + cus.getLastname());
				System.out.println("Phone = " + cus.getPhonenumber());
				System.out.println("Email = " + cus.getEmailid());
			}
			}
			if(choice == 3) {
				System.out.println("Id");
				int id = sc.nextInt();
				System.out.println("Phone");
				Double phone = sc.nextDouble();
				String res1 = cs.updatePhone(id, phone);
				System.out.println(res1);
			}
			if(choice == 4) {
				System.out.println("Id");
				int id = sc.nextInt();
				System.out.println("Email");
				String email = sc.next();
				String res1 = cs.updateEmail(id, email);
				System.out.println(res1);
			}
			
			if(choice == 5) {
				List<Customer> customer =  (List<Customer>) cs.ListAll();
				//System.out.println(customer);
				for(Customer cus : customer) {
					System.out.println("Id: " + cus.getCustomerid());
					System.out.println("FName: " + cus.getFirstname());
					System.out.println("LName: " + cus.getLastname());
					System.out.println("Mob: " + cus.getPhonenumber());
					System.out.println("mail: " + cus.getEmailid());
					System.out.println("___________________________________");
				}
			}
			if(choice == 6) {
				List<Customer> customer =  (List<Customer>) cs.ListSorted();
				//System.out.println(customer);
				for(Customer cus : customer) {
					System.out.println("Id: " + cus.getCustomerid());
					System.out.println("FName: " + cus.getFirstname());
					System.out.println("LName: " + cus.getLastname());
					System.out.println("Mob: " + cus.getPhonenumber());
					System.out.println("mail: " + cus.getEmailid());
					System.out.println("___________________________________");
				}
			}
			if(choice == 7) {
				System.out.println("Id");
				int id = sc.nextInt();
				String res = cs.deleteById(id);
				System.out.println(res);
			}
			if(choice == 8) {
				System.exit(0);
			}
			else {
				System.exit(0);
			}
		}
		
		
		


}
