package com.hib.HibernateHQL;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hib.Hibernateobject.States.Student;

public class HqlExampleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg = new Configuration().configure("com/hib/HibernateHQL/Hibernate.cfg.xml");
SessionFactory factory = cfg.buildSessionFactory();

Session s = factory.openSession();
String query = "from Student as s where s.scity=:y";

	Query q =	s.createQuery(query);
	q.setParameter("y", "gondal");
	List<Student> list =	q.list();
		
	for(Student x : list) {
		System.out.println(x.getSname());
	}
	
	}

}
