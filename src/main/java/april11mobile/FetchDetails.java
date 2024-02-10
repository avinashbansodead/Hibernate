package april11mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main (String []args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
		EntityManager em=emf.createEntityManager();
		
		Mobile mobile=em.find(Mobile.class,2);
		System.out.println("mobile id:"+mobile.getId());
		System.out.println("mobile brand:"+mobile.getBrand());
		System.out.println("mobile price:"+mobile.getPrice());
		
		Battery battery=mobile.getB();
		System.out.println("Battery id"+battery.getId());
		System.out.println("Battery brand"+battery.getBrand());
		System.out.println("Battery Mah"+battery.getMah());
		
		Battery battery1=em.find(Battery.class,1);
		System.out.println("Battery id"+battery1.getId());
		System.out.println("Battery brand"+battery1.getBrand());
		System.out.println("Battery Mah"+battery1.getMah());
		
		Mobile mobile1=em.find(Mobile.class,1);
		System.out.println("mobile id:"+mobile1.getId());
		System.out.println("mobile brand:"+mobile1.getBrand());
		System.out.println("mobile price:"+mobile1.getPrice());
		
				
		
		
		
		
		

	}}
