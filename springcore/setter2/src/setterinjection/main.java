package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
	demo d	=(demo) ctx.getBean("demo");
	d.show();
		
		
	}

}
