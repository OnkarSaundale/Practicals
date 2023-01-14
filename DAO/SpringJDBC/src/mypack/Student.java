package mypack;

public class Student
	{
		private int rollno,marks;
		private String name;
		
		
		//This getters and setters for accepting values from user..
		public int getRollno()
			{
				return rollno;
			}

		public void setRollno(int rollno)
			{
				this.rollno = rollno;
			}

		public int getMarks()
			{
				return marks;
			}

		public void setMarks(int marks)
			{
				this.marks = marks;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}
		//Generating parametrized constructor for calling afterwards in the StudentDAO methods by creating object
		public Student(int rollno, int marks, String name)
			{
				super();
				this.rollno = rollno;
				this.marks = marks;
				this.name = name;
			}
		
		
		public Student()
			{
				// TODO Auto-generated constructor stub
			}

		//Generating toString method for in case printing the object
		@Override
		public String toString()
			{
				return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
			}
		
		
		
	}
