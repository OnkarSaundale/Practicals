package mypack;

import java.util.ArrayList;

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
        
        Employee e1= new Employee();
        e1.setEmpname("Amit");
        e1.setSalary(50000);
        
        Employee e2= new Employee();
        e2.setEmpname("mosh");
        e2.setSalary(60000);
        
        Employee e3= new Employee();
        e3.setEmpname("Amit");
        e3.setSalary(50000);

        Employee e4= new Employee();
        e4.setEmpname("josh");
        e4.setSalary(70000);
        
        ArrayList<Employee>list1=new ArrayList<Employee>();
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        
        ArrayList<Employee>list2= new ArrayList<Employee>();
        list2.add(e4);
        
        Department d1= new Department();
        d1.setDeptname("IT");
        d1.setEmp(list1);
        
        Department d2= new Department();
        d2.setDeptname("Marketing");
        d2.setEmp(list2);
        
        session.persist(d1);
        session.persist(d2);
        tr.commit();
        session.close();
        System.out.println("success");

	}

}
