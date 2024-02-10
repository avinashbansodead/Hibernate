package april12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarEngineDriver
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=new Car();
		c.setId(12);
		c.setName("Odiee");
		c.setType("Diesel");
		
		System.out.println("Above are the car details");
		
		
		Engine e=new Engine();
		e.setId(85);
		e.setHp(45);
		e.setName("kirloskar");
		
		et.begin();
		em.persist(c);
		em.persist(e);
		et.commit();
		System.out.println("Car Details");
		
	}

}
