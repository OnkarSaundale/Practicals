package ConstructorInjection_Collections_List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		//Creating object of IoC container by application Context
				ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContextCL.xml");
				Question q1= (Question) ctx.getBean("q1");
				System.out.println(q1);
	}

}
