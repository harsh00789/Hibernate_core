package com.hib.mapping.onetomany_manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg = new Configuration().configure("com/hib/mapping/onetomany_manytoone/hibernate.cfg.xml");
SessionFactory factory = cfg.buildSessionFactory();


Question q = new Question();
q.setQuestion("what is java ?");
q.setQuestion_id(1);


Answer a = new Answer();
a.setAnswer_id(100);
a.setAnswer("java is a programming language");
a.setQuestion(q);

Answer a1 = new Answer();
a1.setAnswer_id(102);
a1.setAnswer("java is independant");
a1.setQuestion(q);



List<Answer> list = new ArrayList<Answer>();
list.add(a);
list.add(a1);


q.setAnswer(list);                                                                                                            

Session session = factory.openSession();
session.beginTransaction();

session.save(q);
session.save(a);
session.save(a1);
//session.save(list);

session.getTransaction().commit();

//lazy loading or eager loading....

Answer fa = session.get(Answer.class, 100);

Question fq = session.get(Question.class, 1);
System.out.println(fq.getQuestion());

System.out.println(fq.getAnswer().size());

 
//System.out.println(fa.getAnswer());
session.close();

 

	}

}
