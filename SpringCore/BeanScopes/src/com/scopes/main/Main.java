package com.scopes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scopes.util.Demo1;
import com.scopes.util.Demo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("any.xml");
		
		Object ob1=ac.getBean("demo1");
		Demo1 demo1=(Demo1)ob1;
		
		Object ob2=ac.getBean("demo1");
		Demo1 demo2=(Demo1)ob2;
		System.out.println("Demo1 Value:"+demo1);
		System.out.println("Demo2 value:"+demo2);
		System.out.println("singleton : demo1 and demo2 are equal");
		System.out.println(demo1==demo2);
		System.out.println();
		System.out.println();
		
		Demo2 d1=(Demo2)ac.getBean("demo2");
		Demo2 d2=(Demo2)ac.getBean("demo2");
		
		System.out.println("Demo1 Value:"+d1);
		System.out.println("Demo2 Value:"+d2);
		System.out.println("is demo1 and demo2 are equal");
		System.out.println(d1==d2);
	}

}
