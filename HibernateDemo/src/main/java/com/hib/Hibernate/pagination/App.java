package com.hib.Hibernate.pagination;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hib.Hibernateobject.States.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Configuration cfg = new Configuration().configure("com/hib/Hibernate/pagination/Hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    Session session = factory.openSession();
    
    //this is called pagination to used for showing  data in front end using angular
    
  Query q =  session.createQuery("from Student");
  q.setFirstResult(0);
  q.setMaxResults(2);
  
    List<Student> list= q.list();
    
    for(Student s : list) {
    	System.out.println(s.getSid()+" "+s.getSname());
    }
    
	}

} 