package april11mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class BatteryDriver 
{
public static void main (String []args)
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Mobile m=new Mobile();
	m.setId(1);
	m.setBrand("Nokia");
	m.setPrice(24500);
	
	Battery b=new Battery();
	b.setId(1);
	b.setBrand("Nokia");
	b.setMah(7000);
	
	
	m.setB(b);
	et.begin();
	em.persist(m);
	em.persist(b);
	et.commit();
	System.err.println("Data stored Sucessfully");
}
}
