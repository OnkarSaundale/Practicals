package ConstructorInjection_InheritingBean;

public class Employee extends Person
{
	private int empid,salary;
	private String cname;
	
	public Employee(String name, String address, int empid, int salary, String cname) {
		super(name, address);
		this.empid = empid;
		this.salary = salary;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", cname=" + cname + ", name=" + name + ", address="
				+ address + "]";
	}
	
	
	
}
