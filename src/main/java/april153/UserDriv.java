package april153;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriv {

	public static void main(String[] args) 
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
	EntityManager em=emf.createEntityManager();
	EntityManager em1=emf.createEntityManager();
	EntityManager em2=emf.createEntityManager();
	EntityTransaction et=em1.getTransaction();
	System.out.println("Started");
	em.find(User.class, 2);
	em1.find(User.class, 1);
	em2.find(User.class, 2);
	em1.find(User.class, 1);
	em1.find(User.class, 1);
	em2.find(User.class, 1);
	System.out.println("end");
}
}