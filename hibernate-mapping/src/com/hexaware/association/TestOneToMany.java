package com.hexaware.association;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.components.DBUtility;

public class TestOneToMany {

	public static void main(String[] args) {
		SessionFactory sf = DBUtility.createSessionFactory();
		Session session = sf.openSession();
		State s = session.get(State.class, 2);
		
		System.out.println(s.getSname());
		List<City> city1 = s.getCity();
		System.out.println("One to many");
		for (City c:city1) {
			System.out.println(c.getCname());
		}
		//System.out.println(city1);
		/*City c1 = session.get(City.class, 500025);*/
		City c1 = session.get(City.class, 500026);
		State s1 = c1.getState(); 
		System.out.println("Many to one");
		System.out.println(s1.getSname());
		
		session.close();
		sf.close();
	}

}
