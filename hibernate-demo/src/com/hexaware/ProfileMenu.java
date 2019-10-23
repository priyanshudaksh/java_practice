package com.hexaware;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.ProfileDao;
import com.hexaware.dao.ProfileDaoImpl;
import com.hexaware.entities.Profile;

public class ProfileMenu {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int option = 0;
	ProfileDao dao = new ProfileDaoImpl();
	do {
		System.out.println("1: Register, 2: Find Profile, 3: Find All");
		System.out.println("4: Update DOB, 5: Login 6: Find By Name, 7: Exit");
		option = sc.nextInt();
		switch(option) {
		case 1: 
			Profile profile = new Profile();
			System.out.println("Enter Name");
			profile.setName(sc.next());
			System.out.println("Enter password");
			profile.setPassword(sc.next());
			System.out.println("Enter Dob yyyy/MM/dd");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			profile.setDob(LocalDate.parse(sc.next(),dtf));
			int generatedId = dao.store(profile);
			System.out.println("Generated Id: "+ generatedId);
			break;
		case 2: 
			Profile profile1 = new Profile();
			System.out.println("Enter Id");
			int id = sc.nextInt();
			profile1 = dao.findProfile(id);
			System.out.println("Welcome " + profile1.getName() + " " +profile1.getDob());
			break;
		case 3: 
			List<Profile> p = dao.findAllProfiles();
			//System.out.println(p);
			Iterator<Profile> it = p.iterator();
			while(it.hasNext())
		    {
		        Object o = (Object)it.next();
		        Profile p1 = (Profile) o;
		        System.out.println("Profile Name : "+p1.getName());
		        System.out.println("Dob: " + p1.getDob());
		        System.out.println("----------------------");
		    }  
			break;
		case 4: 
			Profile profile2 = new Profile();
			System.out.println("Enter Id");
			int id1 = sc.nextInt();
			System.out.println("Enter Dob in formate yyyy/MM/dd");
			DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDate dt = LocalDate.parse(sc.next(),dtf1);
			profile2 = dao.updateDOB(id1, dt);
			System.out.println(profile2.getDob());
			break;
		case 5:
			System.out.println("Enter Id");
			int id2 = sc.nextInt();
			System.out.println("Enter passwd");
			String pass = sc.next();
			Profile p2 = null;
			p2 = dao.Login(id2, pass);
			if(p2.getPassword().equals(pass) && (p2.getProfileId() == id2)) {
				System.out.println("welcome");
			}
			else {
			System.out.println("Not correct");
			}
			break;
		case 6:
			System.out.println("Enter name");
			String name1 = sc.next();
			List<Profile> pro =  dao.findProfilesByName(name1);
			System.out.println(pro);
		
	case 7:
		
		List<Profile> profilen =  dao.orderProfilesByName();
		System.out.println(profilen);
		break;
	case 8:
		
		List<Profile> profiled =  dao.orderProfilesByDob();
		System.out.println(profiled);
	}
		
	}while(option != 6);
}
}
