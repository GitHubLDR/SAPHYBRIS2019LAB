package com.uhire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uhire.util.Demo;
import com.uhire.util.Demo1;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx= new ClassPathXmlApplicationContext("anyname.xml");
		Object object=ctx.getBean("demo");
		Demo demo=(Demo) object;
		demo.show();
		
		Object object1=ctx.getBean("demo1");
		Demo1 demo1=(Demo1) object1;
		demo1.show();
	
	}

}
