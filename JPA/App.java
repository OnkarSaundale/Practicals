import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Alien a = new Alien();
      a.setAid(9);
      a.setAname("Maria");
      a.setTech("Hardware");
      
      //This is JPA API Interfaces & classes not Hibernate or iBatis related classes or interfaces
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(a); //saving the data into databases
    	em.getTransaction().commit();
    	System.out.println(a);
    	
    }
}
