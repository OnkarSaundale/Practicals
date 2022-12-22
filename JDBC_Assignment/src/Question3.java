import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import com.mysql.jdbc.CallableStatement;
//Create procedure AddnewCustomers() and SearchById() in mysql database
//call above procedure by jdbc's Callable statement..
//i)
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
			System.out.println("Enter rollno, name, result");
			
			
			int rn=sc.nextInt();
			String nm=sc.next();
			int m =sc.nextInt();
			
			CallableStatement cs= (CallableStatement) con.prepareCall("{call procstud(?,?,?)}");
			
			cs.setInt(1, rn);
			cs.setString(2, nm);
			cs.setInt(3, m);
			cs.execute();
			System.out.println("Procedure Executed..");
			//ii) second part is remaining...
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

