package com.cd.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cd.util.ClassA;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ApplicationContext ac=new ClassPathXmlApplicationContext("any.xml");
			
			Object ob=ac.getBean("a");
			ClassA a=(ClassA) ob;
				
			System.out.println(a);
			
			
			System.out.println("main");
			
	}

	
	}


