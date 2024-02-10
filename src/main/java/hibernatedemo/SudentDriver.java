package hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SudentDriver
{
public static void main(String[]args)
{
EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();


for( int i=0;i<=5;i++)
{
	Scanner sc=new Scanner(System.in);
	Student s=new Student();
	
	System.out.println("Enter the Id");
	int Id =sc.nextInt();
	System.out.println("Enter the Name");
	String name=sc.next();
	System.out.println("Enter the age");
	int age=sc.nextInt();
	s.setId(Id);
	s.setName(name);
	s.setAge(age);
	
	et.begin();
	em.persist(s);
	et.commit();
}
}
}
