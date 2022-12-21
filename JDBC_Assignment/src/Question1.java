import java.sql.DriverManager;
import java.sql.*;
public class Question1 {
//Write a program Perform CRUD (Create, Read, Update, and Delete) operation on
//	Student (Rollno,name,marks,address) table using 
//	JDBC APIs.(use Statement interface)
	public static void main(String[] args) 
	{
		try
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded.");
			//obtain the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Root@123");
			System.out.println("Connection established.");
			
			//for writing the sql Query
			Statement stat= con.createStatement();
			//--Create 
		//	stat.executeUpdate("create table Teachers(id int, name varchar(20))");
		//	stat.executeUpdate("Insert into Teachers values(1, 'teacher1')");
		//	stat.executeUpdate("Insert into Teachers values(2, 'teacher2')");
		//	stat.executeUpdate("Insert into Teachers values(3, 'teacher3')");
			//--Update
		//	stat.executeUpdate("Update Teachers set name='teacher_sec' where id=2");
			stat.executeUpdate("delete from Teachers where id=2");
			System.out.println("Task complete.");
			//--Read 
			ResultSet rs=  stat.executeQuery("Select * from Teachers");
			ResultSetMetaData rsmd= rs.getMetaData();
			System.out.println(rsmd.getColumnName(1)+" "+rsmd.getColumnName(2));
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
