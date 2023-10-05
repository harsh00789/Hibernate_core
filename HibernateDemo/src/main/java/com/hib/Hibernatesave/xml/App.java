package com.hib.Hibernatesave.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg =(Configuration) new Configuration().configure("com/hib/HibernateDemo/hibernate.cfg.xml");
    	
        SessionFactory factory =cfg.buildSessionFactory();
        
       // System.out.println(factory);
        
        Employee e = new Employee();
        e.setName("harsh");
        e.setEmail("hibernate");
        e.setPassword("456");
        e.setCountry("australia");
        
        
       Session session = factory.openSession();
       session.beginTransaction();
        session.save(e);
        
        session.getTransaction().commit();
      
        session.close();
        
    }

}
