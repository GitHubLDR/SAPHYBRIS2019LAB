package com.uhire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String args[])
	{
		System.out.println("Started");
		ApplicationContext cntx=new ClassPathXmlApplicationContext("demo.xml");
		Demo demo1=(Demo) cntx.getBean("demo");
		demo1.show();
		ClassA c=(ClassA) cntx.getBean("ClassA");
		c.display();
		
	}

}
