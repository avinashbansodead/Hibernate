package AmazonData;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Account account=new Account();
		account.setId(2);
		account.setName("Sumit");
		account.setPhoneno(9890454896l);
		account.setEmail("sumit@gmail.com");
		account.setPass("S1234");
		
		Cart cart =new Cart();
		cart.setId(2);
		cart.setName("Electronic");
		cart.setPrice(0);
		
		Product product1=new Product();
		product1.setId(3);
		product1.setBrand("Crompton");
		product1.setCategory("electronic");
		product1.setPrice(2000);
		
		
		Product product2=new Product();
		product2.setId(4);
		product2.setBrand("Hard Disk");
		product2.setCategory("hardware");
		product2.setPrice(5000);
		
		account.setCart(cart);
		cart.setAccount(account);
		
		List<Product> products=new ArrayList<Product>();
		
		products.add(product1);
		products.add(product2);
		cart.setProducts(products);
		
		double totalprice=0.0;
		for(Product product:products)
			
		{
			totalprice=totalprice+product.getPrice();
		}
		
		cart.setPrice(totalprice);
		product1.setCart(cart);
		product2.setCart(cart);
		
		et.begin();
		em.persist(account);
		em.persist(cart);
		em.persist(product1);
		em.persist(product2);
		et.commit();
		
		System.out.println("Data saved");
		System.out.println(cart.getPrice());
		
		
}
}