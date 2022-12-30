package my_pack;
import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class EmpMain {

	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Employee e1=new Employee();
        e1.setEmpid(3);
        e1.setEmpname("Sumit ");
        e1.setSalary(50000);
        session.save(e1);
        tr.commit();
        session.close();

	}

}
