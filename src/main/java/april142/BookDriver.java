package april142;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDriver 
{
	public static void main(String[] args) 
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Book book1=new Book();
	book1.setId(1);
	book1.setName("Chava");
	book1.setNop(500);
	
	Book book2=new Book();
	book2.setId(2);
	book2.setName("Yayati");
	book2.setNop(745);

	Book book3=new Book();
	book3.setId(3);
	book3.setName("Shivaray");
	book3.setNop(800);
	
	Author author1=new Author();
	author1.setId(1);
	author1.setName("Shivaji Sawant");
	author1.setAward(50);
	
	Author author2=new Author();
	author2.setId(2);
	author2.setName("Sakharam Khandekar");
	author2.setAward(25);
	
	Author author3=new Author();
	author3.setId(3);
	author3.setName("Vijay Deshmukh");
	author3.setAward(45);
	
	List<Book> book5=new ArrayList<Book>();
	book5.add(book1);
	book5.add(book2);
	book5.add(book3);
	
author1.setBooks(book5);
author2.setBooks(book5);
author3.setBooks(book5);

List<Author> author5=new ArrayList<Author>();
author5.add(author1);
author5.add(author2);
author5.add(author3);

book1.setAuthors(author5);
book2.setAuthors(author5);
book3.setAuthors(author5);

et.begin();
em.persist(author1);
em.persist(author2);
em.persist(author3);
em.persist(book1);
em.persist(book2);
em.persist(book3);
et.commit();

System.out.println("Data Saved");
}
}
