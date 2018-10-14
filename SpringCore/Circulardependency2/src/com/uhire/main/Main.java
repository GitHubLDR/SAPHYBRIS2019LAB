package com.uhire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("anyname.xml");
		System.out.println("main");
	}

}
