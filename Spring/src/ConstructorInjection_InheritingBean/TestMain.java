package ConstructorInjection_InheritingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) 
	{
		//Creating object of IoC container by application Context
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContextIB.xml");
		Employee e1 =(Employee) ctx.getBean("e1");
		System.out.println(e1);
	}

}
