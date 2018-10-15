package com.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
