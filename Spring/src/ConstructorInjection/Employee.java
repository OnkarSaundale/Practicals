package ConstructorInjection;
//This is Bean class
public class Employee 
{
	private int empid,salary;
	private String empname;
	
	public Employee(int empid, int salary, String empname) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.empname = empname;
	}
	
	public void display()
	{
		System.out.println("EmpId= "+empid);
		System.out.println("Salary= "+salary);
		System.out.println("Name= "+empname);
	}
	
}
