package com.uhire.cycle.main;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uhire.cycle.BeanLifeCycle;

public class Main {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args)
	{
		AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("anyname.xml");
		Object obj=context.getBean("beanlifecycle");
		BeanLifeCycle beanlifecycle= (BeanLifeCycle) obj;
		context.registerShutdownHook();
		
	}

}
