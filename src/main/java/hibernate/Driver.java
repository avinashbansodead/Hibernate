package hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernatedemo.Student;

public class Driver
{
public static void main(String[]args)
{
EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
for(int i=1;i<=5;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Id");
int Id =sc.nextInt();
Student s=em.find(Student.class,Id);
System.out.println(s.getId());
System.out.println(s.getName());
System.out.println(s.getAge());
System.out.println("The Details of Id "+Id+" are fetched");
}
}
}

