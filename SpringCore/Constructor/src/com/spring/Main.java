package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "deprecation" })
public class Main {

	public static void main(String[] args) 
	{
		
		Resource resource = new ClassPathResource("sample.xml");
		BeanFactory beanFactory= new XmlBeanFactory(resource);
		Object object = beanFactory.getBean("demo");
		Demo demoobj=  (Demo) object;
		demoobj.show();
		
} 

}
