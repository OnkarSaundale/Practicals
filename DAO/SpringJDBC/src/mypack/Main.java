package mypack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
	{

		public static void main(String[] args)
			{
				//Creating object of IoC Container
				ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
				
				StudentDAO dao= (StudentDAO) ctx.getBean("bdao");
				
				Scanner sc = new Scanner(System.in);
				int ch;
			    do
			    {
			System.out.println("\n1]Insert record\n2]Update Record\n3]Delete record\n4]Show All Record\n5]Exit");
			    	System.out.println("Enter Choice");
			    	ch=sc.nextInt();
			    	switch(ch)
			    	{
			    	case 1://Insert record
			    		System.out.println("Enter rollno");
			    		int id=sc.nextInt();
			    		System.out.println("Enter Name");
			    		sc.nextLine();
			    		String nm=sc.nextLine();
			    		System.out.println("Enter marks");
			    		int m=sc.nextInt();
			    		dao.saveRec(new Student(id,m,nm));  
			    System.out.println("Record Inserted");
			    break;
			    
			    	case 2://Update Record
			    		System.out.println("Enter Rollno");
			    		 id=sc.nextInt();
			    		System.out.println("Enter Name");
			    		 nm=sc.next();
			    		System.out.println("Enter Marks");
			    		 m=sc.nextInt();
			    		 dao.updateRec(new Student(id,m,nm)); 
			    System.out.println("Record Updated");
			    break;
			    
			    	case 3://Delete record
			    		System.out.println("Enter Rollno");
			   		 id=sc.nextInt();	
			    dao.deleteRec(new Student(id,0,"aa"));
			    System.out.println("record deleted");
			    break;
			    
			    	case 4://Show All Record
			    dao.showAllRecords();
			    
			    	}
			}while(ch!=5);
			}
				
			}

	
