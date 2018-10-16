import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[])
	{
		ApplicationContext c=new ClassPathXmlApplicationContext("app.xml");
		
		ClassA a=c.getBean("a", ClassA.class);
		a.display();
	}
}
