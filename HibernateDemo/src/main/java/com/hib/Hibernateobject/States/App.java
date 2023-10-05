package com.hib.Hibernateobject.States;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg =new Configuration().configure("com/hib/Hibernateobject/States/Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//there are 4 states of hibernate object
		// 1.transient
		// 2.persistent
		// 3.detached
		// 4.remove
		
		Student s = new Student();
		s.setSid(1);
		s.setSname("rajkot");
		s.setScity("rajkot");
		// session : transient state
		
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(s);
		// session : persistent state
		s.setSname("rudra");
		
		session.getTransaction().commit();
		
		session.close();
		//session : detatched state
		
	}

}
