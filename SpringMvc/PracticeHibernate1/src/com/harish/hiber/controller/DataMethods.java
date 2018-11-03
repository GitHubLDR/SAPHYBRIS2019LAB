package com.harish.hiber.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.harish.hiber.entity.Student;

public class DataMethods {

	
	public List<Student> read() {
		
		SessionFactory session = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	    Session s = session.getCurrentSession();
	    s.beginTransaction();
	    List<Student> list = s.createQuery("from Student").getResultList();
	    
	    
	    
	    session.close();
		return list;
		
	}
	public void insert(String firstname, String lastname, String email) {
		
		SessionFactory session = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	    Session s = session.getCurrentSession();
	    s.beginTransaction();
	    s.save(new Student(firstname,lastname,email));
	    s.getTransaction().commit();
	    session.close();
		
		
	}
	public void delete(int id) {
		SessionFactory session = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	    Session s = session.getCurrentSession();
	    s.beginTransaction();
	    Student stud = (Student)s.get(Student.class, id);
	    s.delete(stud);
	    s.getTransaction().commit();
	  
	   
	
	    session.close();
		
	}
	public List<Student> updateform(int parseInt) {
		// TODO Auto-generated method stub
		SessionFactory session = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	    Session s = session.getCurrentSession();
	    s.beginTransaction();
	    List<Student> list = s.createQuery("from Student where id="+parseInt).getResultList();
	    session.close();
		return list;
	}
	public void update(Student theStudent) {
		// TODO Auto-generated method stub
		SessionFactory session = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	    Session s = session.getCurrentSession();
	    s.beginTransaction();
	   s.saveOrUpdate(theStudent);
	    session.close();
		
	}

	
	

}
