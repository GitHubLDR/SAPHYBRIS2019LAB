package com.uhire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uhire.util.Demo;
import com.uhire.util.Demo2;

public class Main {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("anyname.xml");
		
		Object object1=ctx.getBean("demo");
		Demo demo1=(Demo) object1;
		
		Object object2=ctx.getBean("demo");
		Demo demo2=(Demo) object2;
		
		System.out.println("DEMO1"+demo1);
		System.out.println("DEMO2"+demo2);
		System.out.println("Single Tone::: Is demo1 and demo2 are equal:");
		System.out.println(demo1==demo2);
		
		System.out.println();
		System.out.println();
		
		Object obj1=ctx.getBean("demo2");
		Demo2 d1=(Demo2) obj1;
		
		Object obj2=ctx.getBean("demo2");
		Demo2 d2=(Demo2) obj2;
		
		
		System.out.println("DEMO1"+ d1);
		System.out.println("DEMO2"+ d2);
		System.out.print("Is demo1 and demo2 are equal :");
		System.out.println(d1==d2);
		
		
		
		
	}
}
