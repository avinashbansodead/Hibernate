package april10;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernatedemo.Student;

public class DriverDelete 
{
public static void main(String[]args)
{
EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

Student s=em.find(Student.class, 2);
et.begin();
em.remove(s);
et.commit();
System.out.println("Sucessfully Deleted");
}
}
