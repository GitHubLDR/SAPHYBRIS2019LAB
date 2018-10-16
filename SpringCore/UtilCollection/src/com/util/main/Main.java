package com.util.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.util.pkg.UtilCollection;

public class Main {
	
	public static void main(String args[])
	{
	ApplicationContext c=new ClassPathXmlApplicationContext("anyutil.xml");
	
	UtilCollection uc=(UtilCollection)c.getBean("utilc");
	
	uc.show();
	
	}

}
