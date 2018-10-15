package util22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("util.xml");
demo3 d3=(demo3) ctx.getBean("demo3");
	d3.show();
	}}