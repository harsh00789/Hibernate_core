package com.hib.Hibernatesave.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	
	Configuration cfg = new Configuration().configure("com/hib/Hibernatesave/annotation/hibernate.cfg.xml");
	
	SessionFactory factory = cfg.buildSessionFactory();
	
	Employee e = new Employee();
	
	e.setName("harsh");
	e.setPassword("dfa");
	e.setEmail("annotation");
	e.setCountry("netherland");
	
   Session session =factory.openSession();
	session.beginTransaction();
	
	session.save(e);
	
	session.getTransaction().commit();
	
	session.close();
	
	
}
}
