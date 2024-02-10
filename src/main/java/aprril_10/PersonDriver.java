package aprril_10;

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
	
	Person p=new Person();
	p.setId(27);
	p.setName("Rajesh");
	p.setAge(20);
	
	Pan p1=new Pan();
	p1.setId(21);
	p1.setPan_No("ABC123");
	p1.setAddress("Deccan");
	
	p.setPan(p1);
	et.begin();
	em.persist(p);
	em.persist(p1);
	et.commit();
}
}
