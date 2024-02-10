package april122;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ActorDriver
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Actor a=new Actor();
		a.setId(3);
		a.setName("Ritesh Deshmukh");
		a.setAge(35);
		
		Movie m1=new Movie();
		m1.setId(4);
		m1.setMname("Tere Nam");
		m1.setCollection(200);
		
		Movie m2=new Movie();
		m2.setId(5);
		m2.setMname("Wanted");
		m2.setCollection(200);
		
		Movie m3=new Movie();
		m3.setId(6);
		m3.setMname("Dabangg");
		m3.setCollection(200);
		
		List<Movie> ma1=new ArrayList<Movie>();
		ma1.add(m1);
		ma1.add(m2);
		ma1.add(m3);
		
		a.setMa(ma1);
		
		System.out.println("Table created and data inserted");
		et.begin();
		em.persist(a);
		em.persist(m1);
		em.persist(m2);
		em.persist(m3);
		et.commit();
		
}
}
