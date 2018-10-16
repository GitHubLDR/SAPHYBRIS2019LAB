package com.uhire.ci;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[])
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("app.xml");
		Student s=(Student)ac.getBean("std");
		s.display();
		
	}

}
