package com.uhire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uhire.util.Demo;

public class Main 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		ApplicationContext ctx =  new ClassPathXmlApplicationContext("anyname.xml");
		
		Object object = ctx.getBean("demo");
		Demo demo = (Demo) object;
		
		demo.show();
	}}
