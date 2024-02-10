package april15;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver 
{
	public static void main(String[] args) 
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Persons persons=new Persons();
	persons.setId(2);
	persons.setName("Vikas");
	persons.setAge(22);
	
	Pan pan=new Pan();
	pan.setId(2);
	pan.setPannum("ABCD1234");
	pan.setAddress("karvenagar");
	
	persons.setPan(pan);
	
	et.begin();
	em.persist(persons);
	et.commit();
	
	System.out.println("Data sucefully stored");
	
	
	
	

}
}
