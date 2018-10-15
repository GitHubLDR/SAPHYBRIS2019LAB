package Constructordependency22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("anyname.xml");
demo2 d2=(demo2) ctx.getBean("demo2");
		d2.call();


	}

}
