package april14;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudenteDriver
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Studente studente1=new Studente();
		studente1.setId(2);
		studente1.setName("Mangesh");
		studente1.setYop(2020);
		studente1.setAge(22);
		studente1.setMobno(7975412563l);
		
		Studente studente2=new Studente();
		studente2.setId(2);
		studente2.setName("Ravi");
		studente2.setYop(2021);
		studente2.setAge(21);
		studente2.setMobno(7875312563l);
		
		Studente studente3=new Studente();
		studente3.setId(3);
		studente3.setName("Krishna");
		studente3.setYop(2020);
		studente3.setAge(20);
		studente3.setMobno(9478512563l);
		
		Course course1=new Course();
		course1.setId(1);
		course1.setCname("Java");
		course1.setDuration("5C month");
		
		Course course2=new Course();
		course2.setId(2);
		course2.setCname("SQL");
		course2.setDuration("3 month");
		
		Course course3=new Course();
		course3.setId(3);
		course3.setCname("Webtech");
		course3.setDuration("2 month");
		
		
		List<Studente>studente4=new ArrayList<Studente>();
		studente4.add(studente1);
		studente4.add(studente2);
		studente4.add(studente3);
		
		course1.setStudente(studente4);
		course2.setStudente(studente4);
		course3.setStudente(studente4);
		
		//List<Studente>studente5=new ArrayList<Studente>();
		//studente5.add(studente1);
		//studente5.add(studente2);
		
		
		List<Course>course4=new ArrayList<Course>();
		
		course4.add(course1);
		course4.add(course2);
		course4.add(course3);
		
		
		
		studente1.setCourse(course4);
		studente2.setCourse(course4);
		studente3.setCourse(course4);
		
		et.begin();
		em.persist(studente1);
		em.persist(studente2);
		em.persist(studente3);
		em.persist(course1);
		em.persist(course2);
		em.persist(course3);
		et.commit();
		System.out.println("Done");
		
		
		

}
}
