package april153;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriver 
{
	public static void main(String[] args) 
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	User user=new User();
	user.setId(2);
	user.setName("Avinash");
	user.setEmail("abc@1234");
	user.setPassword("1234");
	
	et.begin();
	em.persist(user);
	et.commit();
	
	System.out.println("Data inserted sucessfully");
	
}
}
