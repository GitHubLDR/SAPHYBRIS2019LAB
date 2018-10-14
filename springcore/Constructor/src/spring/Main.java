package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
;
		ApplicationContext act1= new ClassPathXmlApplicationContext("spring22.xml");
		Demo2 dem = (Demo2) act1.getBean("demo2");
		dem.show();
		dem.getSamp();
		
		
		
		
	}

}
