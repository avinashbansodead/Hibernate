package april151;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CounryDriver 
{
	public static void main(String[] args) 
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Country country=new Country();
	
	country.setId(2);
	country.setName("UK");
	country.setPrimeminister("Donalt Trum");
	et.begin();
	em.persist(country);
	et.commit();
	
	System.out.println("Data inserteds");
	
}
}
