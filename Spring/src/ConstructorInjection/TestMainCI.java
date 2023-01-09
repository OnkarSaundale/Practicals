package ConstructorInjection;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMainCI {

	public static void main(String[] args) {
		//Using BeanFactory To create object of IoC container

	
	Resource resource=new ClassPathResource("applicationContextCI.xml");
	BeanFactory factory=new XmlBeanFactory(resource);

	Employee e1= (Employee)factory.getBean("e1");
	e1.display();
	}

}
