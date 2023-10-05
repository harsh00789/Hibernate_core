package com.hib.HibernateHQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlUpdateDelete {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("com/hib/HibernateHQL/Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session s = factory.openSession();

		s.beginTransaction();

		/*
		 * Query q = s.createQuery("delete from Student where sname=:x");
		 * q.setParameter("x","harsh");
		 * 
		 * int i = q.executeUpdate(); s.getTransaction().commit(); s.close();
		 * System.out.println(i);
		 */

		Query q = s.createQuery("update Student set sname=:y where scity=:w");
		q.setParameter("y", "ashok");
		q.setParameter("w", "gondal");

		int i = q.executeUpdate();
		s.getTransaction().commit();
		System.out.println("updated : " + i);
		s.close();
	}
}
