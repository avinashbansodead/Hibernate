package april153;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchUser
{
	
		public static void main(String[] args) 
		{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
		EntityManager em=emf.createEntityManager();
		//EntityTransaction et=em.getTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email");
		String email=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		

		
		
		
		
		Query query=em.createQuery("select a from User a where a.email=?1 and a.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<User> user=query.getResultList();
		if(user.size()>0)
		{
			System.out.println("Welcome");
			
		}
		else
		{
			System.out.println("Invalid Crediential");
		}
		
		
}
	}
