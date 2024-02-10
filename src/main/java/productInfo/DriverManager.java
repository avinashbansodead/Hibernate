package productInfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverManager
{
public static void main(String[]args)
{
EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
Product1 p =em.find(Product1.class,1);
System.out.println(p.getId());
System.out.println(p.getBrand());
System.out.println(p.getPrice());
System.out.println(p.getWarranty());

}
}
