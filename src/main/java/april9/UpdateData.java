package april9;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData
{
public static void main(String[]args)
{
EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

UpdateDat ud=new UpdateDat();
ud.setId(1);
ud.setName("Hitesh");
ud.setAge(23);

et.begin();
em.merge(ud);
et.commit();
System.out.println("Update Data");
}
}