package com.hexaware.dao;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.hexaware.entities.Profile;

public class ProfileDaoImpl implements ProfileDao {

	@Override
	public int store(Profile profile) {
		// TODO Auto-generated method stub
		int genId = 0;
		SessionFactory sf = DBUtility.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		genId = (int) session.save(profile);
		tx.commit();
		session.close();
		sf.close();
		return genId;
	}

	@Override
	public Profile findProfile(int profileId) {
		Profile profile = null;
		SessionFactory sf = DBUtility.createSessionFactory();
		Session session = sf.openSession();
		profile = (Profile)session.load(Profile.class, profileId);
		/*session.close();
		sf.close();*/
		return profile;
		
	}

	@Override
	public List<Profile> findAllProfiles() {
		List<Profile> profiles = null;
		SessionFactory factory = DBUtility.createSessionFactory();
	    Session session = factory.openSession();
	    org.hibernate.Query qry = session.createQuery("from Profile p");
	    List<Profile> l =((org.hibernate.Query) qry).list(); 
	    Criteria crt = session.createCriteria(Profile.class);
	    profiles = crt.list();
	    System.out.println(profiles);
	    session.close();
	    factory.close();
	    return (List<Profile>) l;
	}

	@Override
	public Profile updateDOB(int profileId, LocalDate dob) {
		Profile profile1 = new Profile();
		SessionFactory factory = DBUtility.createSessionFactory();
		Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Profile profile =  (Profile)session.get(Profile.class, profileId); 
	        
	         profile.setDob(dob);
	         session.update(profile); 
	         profile1 =  (Profile)session.get(Profile.class, profileId); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
		return profile1;
	}

	@Override
	public Profile Login(int profileId, String password) {
		Profile profile = new Profile();
		SessionFactory sf = DBUtility.createSessionFactory();
		Session session = sf.openSession();
		profile = (Profile)session.get(Profile.class, profileId);
		/*session.close();
		sf.close();*/
		return profile;
	}

	@Override
	public List<Profile> findProfilesByName(String name) {
		List<Profile> profiles = null;
		SessionFactory factory = DBUtility.createSessionFactory();
	    Session session = factory.openSession();
	    Criteria crt = session.createCriteria(Profile.class);
	    crt.add(Restrictions.eq("name", name));
	    //crt.addOrder(Order.asc("profileId"));
	    profiles = crt.list();
	    session.close();
	    factory.close();
		return profiles;
	}

	@Override
	public List<Profile> orderProfilesByName() {
		List<Profile> profiles = null;
		SessionFactory factory = DBUtility.createSessionFactory();
	    Session session = factory.openSession();
	    Criteria crt = session.createCriteria(Profile.class);
	    //crt.add(Restrictions.eq("name", name));
	    crt.addOrder(Order.asc("name"));
	    profiles = crt.list();
	    session.close();
	    factory.close();
		return profiles;
	}

	@Override
	public List<Profile> orderProfilesByDob() {
		List<Profile> profiles = null;
		SessionFactory factory = DBUtility.createSessionFactory();
	    Session session = factory.openSession();
	    Criteria crt = session.createCriteria(Profile.class);
	    //crt.add(Restrictions.eq("dob", dob));
	    crt.addOrder(Order.asc("dob"));
	    profiles = crt.list();
	    session.close();
	    factory.close();
		return profiles;
	}

}
