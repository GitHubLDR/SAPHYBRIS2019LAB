package newutil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext ctx= new ClassPathXmlApplicationContext("anyvalue.xml");
	Demo dem1=(Demo) ctx.getBean("demo");
	dem1.show();
}
	
	
	
}
