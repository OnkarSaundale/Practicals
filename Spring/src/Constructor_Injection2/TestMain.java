package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) 
	{
		//Creating object of IoC container
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");	
	}

}
