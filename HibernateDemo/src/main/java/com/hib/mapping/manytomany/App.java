package com.hib.mapping.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
public static void main(String[] args) {
	Configuration cfg = new Configuration().configure("com/hib/mapping/manytomany/hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	Employee e1 = new Employee();
	e1.setEmpid(1);
	e1.setEmpName("harsh");
    
	Employee e2 = new Employee();
	e2.setEmpid(2);
	e2.setEmpName("ashok");
	
	Project p1 = new Project();
	p1.setProjectid(101);
	p1.setProjectName("chatboot");
	
	Project p2 = new Project();
	p2.setProjectid(102);
	p2.setProjectName("online banking");
	
	List<Employee> list1 = new ArrayList<Employee>();
	List<Project> list2 = new ArrayList<Project>();
	
	list1.add(e1);
	list1.add(e2);
	
	list2.add(p1);
	list2.add(p2);
	
	e2.setProject(list2);
	p1.setEmployee(list1);
	
	Session session = factory.openSession();
	session.beginTransaction();

	
	session.save(e2);
	session.save(p1);
	
	session.getTransaction().commit();
	
	
	session.close();

}
}
