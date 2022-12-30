package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");//Configuration done by this file
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Transaction tr=session.beginTransaction();

        
        Employee e1 = new Employee();//object of persistance class
        e1.setName("John");

        Regular_Employee e2 =new Regular_Employee();
        e2.setName("mosh");
        e2.setSalary(500000);
        e2.setBonus(10000);
       
        Contract_Employee e3 = new Contract_Employee();
        e3.setName("Jon");
        e3.setPay_per_hour(20);
        e3.setContract_period("Two years");
        
      //inserting all the values in database;
        session.save(e1); 
        session.save(e2);
        session.save(e3);
        
        tr.commit();
        session.close();
        
        

	}

}
