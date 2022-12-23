import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;
import com.mysql.jdbc.CallableStatement;
//Create procedure AddnewCustomers() and SearchById() in mysql database
//call above procedure by jdbc's Callable statement..

public class Question3 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Root@123");
			System.out.println("Connection established.");
			
			Scanner sc = new Scanner(System.in);
	//do one at a time
	//i)procedure AddnewCustomers()
			
		//	System.out.println("Enter rollno, name, result");
		//	int rn=sc.nextInt();
		//	String nm=sc.next();
		//	int m =sc.nextInt();
			
		//	CallableStatement cs= (CallableStatement) con.prepareCall("{call procstud(?,?,?)}");
			
	//		cs.setInt(1, rn);
	//		cs.setString(2, nm);
	//		cs.setInt(3, m);
	//		cs.execute();
	//		System.out.println("Procedure Executed..");
			
	//ii) procedure SearchById()
			
			System.out.println("Enter Roll no:");
			int rn =sc.nextInt(); 
			
			CallableStatement cs=(CallableStatement) con.prepareCall("{call SearchById(?,?)}");
			cs.setInt(1, rn);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.execute();
			System.out.println("Name of the student:"+" "+cs.getString(2));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

