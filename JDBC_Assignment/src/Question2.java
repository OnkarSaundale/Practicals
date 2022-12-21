import java.sql.*;
import com.mysql.jdbc.PreparedStatement;

public class Question2 {
//WAP perform CRUD operation on Book(id,name,marks,address)table
// using JDBC APIs.(use PreparedStatement)
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
			
			//for writing the Sql Querys
			
			//--Create
			java.sql.PreparedStatement st=(PreparedStatement) con.prepareStatement("Create Table Book(id int,name varchar(20), marks int, address varchar(20))");
		//	st.executeUpdate();
		//	System.out.println("Record Updated");
			
			//--Read 
		//	st=con.prepareStatement("Select * from Book");
			
			//--Insert
		//	st=con.prepareStatement("Insert into Book values(1,'Agnipankh',87,'library')");
		//	st.executeUpdate();
			
			//--Delete
		//	st=con.prepareStatement("delete from Book where id=1");
		//	st.executeUpdate();
		
			//--update
			st=con.prepareStatement("update Book set marks=100, address='Great lib' where id=1");
			st.executeUpdate();
			
		/**	
			
		//	ResultSet rs=  st.executeUpdate();
		//	ResultSetMetaData rsmd= rs.getMetaData();
		//	System.out.println(rsmd.getColumnName(1)+" "+rsmd.getColumnName(2)+" "+rsmd.getColumnName(3)+" "+rsmd.getColumnName(4));
		//	while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getInt(3)+" "+rs.getString(4));
			}
		*/	
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
