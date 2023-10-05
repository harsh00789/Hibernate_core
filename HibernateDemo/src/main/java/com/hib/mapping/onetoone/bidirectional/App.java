package com.hib.mapping.onetoone.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg = new Configuration().configure("com/hib/mapping/onetoone/bidirectional/hibernate.cfg.xml");
SessionFactory factory = cfg.buildSessionFactory();

Question q = new Question();
q.setQuestion_id(1);
q.setQuestion("what is java ?");



Answer a = new Answer();
a.setAnswer_id(101);
a.setAnswer("java is a programming language");
a.setQuestion(q);

q.setAnswer(a);

Session session = factory.openSession();
session.beginTransaction();

session.save(q);
session.save(a);

session.getTransaction().commit();

//fatching data for print on console....

Question fq = session.get(Question.class,1);
System.out.println(fq.getQuestion());

session.close();

		
		
	}

}
