package april151;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchValues 
{
	public static void main(String[] args) 
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
	EntityManager em=emf.createEntityManager();
	//EntityTransaction et=em.getTransaction();
	Query query=em.createQuery(" select a from Country a");
	query.getResultList();
	List<Country>countries=query.getResultList();
	
	for(Country country:countries)
	{
		System.out.println(country.getId());
		System.out.println(country.getName());
		System.out.println(country.getPrimeminister());
		System.out.println("--Data Fetched Sucefully--");
	}
}
}
