package mypack;
//This is Bean class where restrictions are there..
public class StudentBean 
{
	private int rollno,marks;
	private String stdname;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	
	public void display()
	{
		System.out.println("Roll no= "+rollno);
		System.out.println("Name= "+stdname);
		System.out.println("Marks= "+marks);
	}
	
}
