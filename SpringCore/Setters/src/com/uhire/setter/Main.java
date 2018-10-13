package com.uhire.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.setter.Demo;

public class Main {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ApplicationContext ctx =  new ClassPathXmlApplicationContext("spring.xml");
	Demo demo=(Demo) ctx.getBean("demo");
	demo.test();

	}

}
