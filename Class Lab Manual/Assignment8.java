package MyAssignments;

import java.util.Scanner;


class IncorrectAgeException extends Exception
{
	public IncorrectAgeException() {
		// TODO Auto-generated constructor stub
	}
}
class IncorrectNationalityException extends Exception
{
	public IncorrectNationalityException() {
		// TODO Auto-generated constructor stub
	}
}
class voter
{
	int age;
	String name;
	String nationality;
	Scanner sc = new Scanner(System.in);
	void check()
	{
		
		System.out.println("Enter your name: ");  //name
		name=sc.next();
		
		System.out.println("Enter age: ");
		age= sc.nextInt();							//age
		
		try
		{
			if(age<18)
			{
				throw new IncorrectAgeException();
				
			}
		}
		catch(IncorrectAgeException iae)
		{
			System.out.println("age must be greater than 18 !!");
			return;
			
		}
		
		
		System.out.println("Enter your nationality e.g India, America: ");			//nationality
		nationality=sc.next();
		String s1="India";
		
		try {
			if(nationality.equals(s1))
			{
				System.out.println("Your vote is considerd");
				
			}
			else 
			{
				throw new IncorrectNationalityException();
				
			}
		}
		catch(IncorrectNationalityException ine)
		{
			System.out.println("Only indians are allowed to vote in india!!");
		}
		
	}
}
public class Assignment8 {

	public static void main(String[] args) 
	{
		voter v= new voter();
		v.check();
	}

}

/**
 //Q.5) 
class InsuficientFundsException extends Exception
{
	public InsuficientFundsException() 
	{
		
	}
}
class Account
{
	int balance;
	Scanner sc = new Scanner(System.in);
	void EnterBal()
	{
		
		System.out.println("Enter balance:");
		balance= sc.nextInt();
		System.out.println("Your Balance is :"+ balance);
	}
	void withdrawAmt()
	{
		System.out.println("Enter amt to withdraw:");
		int amount= sc.nextInt();
		try 
		{
			if(amount>balance)
			{
				throw new InsuficientFundsException();
			}
			else
			{
				System.out.println("Amt is Withdrawn..");
			}
				
		}
		catch(InsuficientFundsException ie)
		{
			System.out.println("Your balance is insufficient to withdraw"+ ie);
		}
		
	}
}
public class Assignment8 {

	public static void main(String[] args) 
	{
		Account a = new Account();
		a.EnterBal();
		a.withdrawAmt();

	}

}
 */
