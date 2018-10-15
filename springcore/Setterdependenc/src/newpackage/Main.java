package newpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
	Demo dem= (Demo) ctx.getBean("demo");
	dem.call();
	
	
	}

	
	
}
