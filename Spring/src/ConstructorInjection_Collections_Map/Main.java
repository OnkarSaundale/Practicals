package ConstructorInjection_Collections_Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ConstructorInjection_Collections_List.Question;

public class Main {

	public static void main(String[] args) 
	{
		//Creating object of IoC container by application Context
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContextCM.xml");
		Question q1= (Question) ctx.getBean("q1");
		q1.display();
	}

}
