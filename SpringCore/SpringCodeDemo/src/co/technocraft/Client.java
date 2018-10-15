package co.technocraft;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		//Object Construction
		
		//Employee eRef=new Employee();
		//eRef.setEid(101);
		//eRef.setEname("John Watson");
		//eRef.setEaddres("America");
		
		//System.out.println("Employee Details: "+eRef);
		
		// Spring way | IOC (Inversion of Control)
		//Resource resource = new ClassPathResource("employeebean.xml");
		//@SuppressWarnings("deprecation")
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
//		Employee e1 = (Employee)factory.getBean("emp1");
//		Employee e2 = (Employee)factory.getBean("emp2");
		
		Employee e1 = (Employee)context.getBean("emp1");
		Employee e2 = context.getBean("emp2",Employee.class);
		
		System.out.println("Employee1 Details:   "+e1);
		System.out.println("Employee2 Details:   "+e2);
	}

}
