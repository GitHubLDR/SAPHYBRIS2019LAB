package com.uniquehire.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaurant restaurantobj = (Restaurant) context.getBean("restaurantBean");
		restaurantobj.greetCustomer();

	}

}
