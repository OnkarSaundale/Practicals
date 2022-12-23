import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

import com.mysql.jdbc.DatabaseMetaData;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.*;

public class Question4 {
//write a java application to print the metadata above ResultSet as well as Database 
	//use ResultSetMetaData & DatabaseMetaData API
	
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Root@123");
			System.out.println("Connection established.");
			System.out.println("--------------------------------------------");
			//using DatabaseMetaData
			
			DatabaseMetaData db =(DatabaseMetaData) con.getMetaData();
			System.out.println("Driver name="+db.getDriverName());
			System.out.println("Diver Version="+ db.getDriverVersion());
			System.out.println("Username="+db.getUserName());
			System.out.println("Database product name="+db.getDatabaseProductName());
			System.out.println("Database prod version"+db.getDatabaseProductVersion());
			
			System.out.println("--------------------------------------------");
			
			
			//For writing the sql query
			PreparedStatement ps= (PreparedStatement) con.prepareStatement("select * from student");
			ResultSet rs= ps.executeQuery();
			
			ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
			
			System.out.println("Total no of coloumns:"+rsmd.getColumnCount());
			System.out.println("Name of 1st coloumn:"+rsmd.getColumnName(1));
			System.out.println("Datatype of 3rd coloumn:"+rsmd.getColumnType(3));
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
