package ConstructorInjection_InheritingBean;

public class Person 
{
	protected String name, address;
//using constructor injection method
	public Person(String name, String address) 
	{
		super();
		this.name = name;
		this.address = address;
	}
	

}
