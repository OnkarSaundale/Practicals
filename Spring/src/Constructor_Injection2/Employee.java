package Spring;
//Employee has a address
public class Employee 
{
	private int empid,salary;
	private String empname;
	private Address addr;
	
	public Employee(int empid, int salary, String empname, Address addr) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.empname = empname;
		this.addr = addr;
	}
	
	public void display()
	{
		System.out.println("Empid= "+empid);
		System.out.println("Salary= "+salary);
		System.out.println("Name= "+empname);
		System.out.println("address= "+addr);
	}
	
}
