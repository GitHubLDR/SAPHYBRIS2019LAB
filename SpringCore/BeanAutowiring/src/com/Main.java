package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx =  new ClassPathXmlApplicationContext("spring.xml");
		Travel travel=(Travel) ctx.getBean("travel");
		travel.test();

		}

	}
