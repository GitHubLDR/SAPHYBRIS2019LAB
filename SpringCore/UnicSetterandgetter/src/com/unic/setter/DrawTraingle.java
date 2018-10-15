package com.unic.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawTraingle {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		  Traingle triangle = (Traingle) context.getBean("triangle", Traingle.class);
		  triangle.draw();
		  context.close();


	}

}
