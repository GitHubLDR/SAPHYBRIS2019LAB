package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("space.xml");
		
		Demo d=(Demo)apc.getBean("demo");
		
		d.getA();
	}

}
