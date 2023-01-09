package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// we have to create object of IoC container..
		//Two methods 1)using Beanfactory 2)using application context
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentBean s1= (StudentBean)ctx.getBean("s1");
		s1.display();
	}

}
