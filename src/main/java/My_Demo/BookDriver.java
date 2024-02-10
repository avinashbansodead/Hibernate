package My_Demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDriver {
	public static void main(String[] args) 
	{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("onemany");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Book book1=new Book();
	book1.setBookId(1);
	book1.setBookName("Chava");
	book1.setBookNop(500);
	
	
	Author author1=new Author();
	author1.setAuthorId(1);
	author1.setAuthorName("Shivaji Sawant");
	author1.setAward(50);
	
	Author author2=new Author();
	author2.setAuthorId(2);
	author2.setAuthorName("Sakharam Khandekar");
	author2.setAward(25);
	
	Author author3=new Author();
	author3.setAuthorId(3);
	author3.setAuthorName("Vijay Deshmukh");
	author3.setAward(45);
	
author1.setBooks(book1);
author2.setBooks(book1);
author3.setBooks(book1);

List<Author> authors=new ArrayList<Author>();
authors.add(author1);
authors.add(author2);
authors.add(author3);

book1.setAuthors(authors);
author1.setBooks(book1);
author2.setBooks(book1);
author3.setBooks(book1);


et.begin();
em.persist(author1);
em.persist(author2);
em.persist(author3);
em.persist(book1);
et.commit();

System.out.println("Data Saved");
}
}
