package com.hexaware.association;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.components.DBUtility;

public class TestManyToMany {

	public static void main(String[] args) {
		SessionFactory sf = DBUtility.createSessionFactory();
		Session session = sf.openSession();
		
		Student student = session.get(Student.class, 1);
		System.out.println("Name: " + student.getSname());
		
		List<Course> courses = student.getCourses();
		for(Course c: courses) {
			System.out.println(c.getCid()+" "+c.getCname());
			System.out.println("-----------------------------");
		}
		
		Course c = session.get(Course.class, 99);
		System.out.println("Course Name "+ c.getCname());
		
		List<Student> students1 = c.getStudent();
		//System.out.println(students1);
		for(Student student2: students1) {
			System.out.println(student2.getSname());
			System.out.println("-----------------------------");
		}
		session.close();
		sf.close();

	}

}
