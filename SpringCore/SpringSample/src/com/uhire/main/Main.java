package com.uhire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uhire.demo.Demo;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		System.out.println("Started");
		//creating Spring Container
		ApplicationContext cntx=new ClassPathXmlApplicationContext("spring.xml");
		Demo demo1=(Demo) cntx.getBean("demo");
		demo1.show();
	    
	    
	}

}
