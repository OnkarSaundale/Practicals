package Component_Mapping;
//Has a kind of relationship
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("hibernate_compo_map.cfg.xml");//Configuration done by this file
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Transaction tr=session.beginTransaction();
        //Employee has a address
        Address addr= new Address();//Address class object here.
        addr.setCity("Pune");
        addr.setCountry("India");
        addr.setState("Maharashtra");
        
        Employee e1 = new Employee();//Persistance class object here.
        e1.setEmpname("Amit");
        e1.setSalary(500000);
        e1.setAddr(addr);
        
        session.save(e1);
        
        tr.commit();
        session.close();
 
        
	}

}
