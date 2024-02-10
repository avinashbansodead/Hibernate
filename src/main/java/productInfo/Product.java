package productInfo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Product
{
public static void main(String[]args)
{
EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

Scanner sc=new Scanner(System.in);

for( int i=0;i<=5;i++)
{
	
	
	
	System.out.println("Enter the Id");
	int id =sc.nextInt();
	System.out.println("Enter the Brand");
	String brand=sc.next();
	System.out.println("Enter the Warranty");
	String warranty=sc.next();
	System.out.println("Enter the price");
	double price=sc.nextDouble();
	Product1 p=new Product1();
	
	p.setId(id);
	p.setBrand(brand);
	p.setWarranty(warranty);
	p.setPrice(price);
	
	et.begin();
	em.persist(p);
	et.commit();
}
}
}


