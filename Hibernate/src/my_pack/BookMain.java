package my_pack;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookMain {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
        cfg.configure("hibernate2.cfg.xml");//Configuration done by this file
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Transaction tr=session.beginTransaction();

        Scanner sc = new Scanner(System.in);
        
        String ch;
        
        do
        {
        	Book b1= new Book();//Persistance class object
        	
        	System.out.println("enter book id:");
        	int id= sc.nextInt();
        	System.out.println("enter title");
        	String tit=sc.next();
        	System.out.println("Enter price");
        	int pr= sc.nextInt();
        	
        	b1.setBid(id);
        	b1.setTitle(tit);
        	b1.setPrice(pr);
        	
        	session.save(b1);
        	System.out.println("Anymore?yes/no");
        	ch=sc.next();
   
        }while(ch.equals("yes"));
        
        tr.commit();
        session.close();
        
	}

}
