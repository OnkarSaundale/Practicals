package jdbc;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
//Write a java application to test Scrollable.
//first create Student in database with rollno, name and marks.
public class StudentForm extends Frame implements ActionListener
	{
	 Label l1,l2,l3;
	 TextField t1,t2,t3;
	 Button b1,b2,b3,b4;
	 java.sql.ResultSet rs;
	 
	 public StudentForm()
		 {
		 setLayout(new FlowLayout());
		 l1=new Label("Enter Rollno");
		 l2=new Label("Enter Name");
		 l3=new Label("Enter Marks");
		 t1=new TextField(30);
		 t2=new TextField(30);
		 t3=new TextField(30);
		 b1=new Button("First");
		 b2=new Button("Next");
		 b3=new Button("Previous");
		 b4=new Button("Last");
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 add(l1);
		 add(t1);
		 add(l2);
		 add(t2);
		 add(l3);
		 add(t3);
		 add(b1);add(b2);
		 add(b3);add(b4);
		 try
			 {
				 Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver loaded..");
					Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root");
					System.out.println("Connection established!!");
					Statement stat=(Statement) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			rs=stat.executeQuery("select * from Student");
			if(rs.next())
				display();
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
			 setSize(400,400);
			 setVisible(true);
			 
		}
		 public void display()
		 {
			 try
			 {
				 t1.setText(String.valueOf(rs.getInt(1)));
				 t2.setText(rs.getString(2));
				 t3.setText(String.valueOf(rs.getInt(3)));
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		 }
		 @Override
			public void actionPerformed(ActionEvent e)
			 {
					Object obj=e.getSource();
					try
					{
						if(obj==b1)
						{
							if(rs.isFirst());
							{
								rs.first();
								display();
							}
							
						}
						else if(obj==b2)
						{
							if(rs.next())

						display();
						}
						else if(obj==b3)
						{
							if(!rs.isFirst())
							{
								rs.previous();
								display();
							}
						}
						else if(obj==b4)
						{
							if(!rs.isLast())
							{
								rs.last();
								display();
							}
						}
						
					}
					catch(Exception ex)
					{
						System.out.println(ex);
					}
				}
		public static void main(String[] args)
			{
				StudentForm s=new StudentForm();
			}
	}
