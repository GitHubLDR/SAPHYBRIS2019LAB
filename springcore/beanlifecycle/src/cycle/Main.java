package cycle;
import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext ctxx= new ClassPathXmlApplicationContext("anyname.xml");
  Beanlifecycle bc=(Beanlifecycle) ctxx.getBean("beanLifeCycle");
  bc.registershutdownhook();
  
		
		
	}

}
