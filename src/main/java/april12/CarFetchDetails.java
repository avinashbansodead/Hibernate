package april12;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class CarFetchDetails {
	public static void main (String []args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id:");
		int id=sc.nextInt();
		
		
		Car c=em.find(Car.class,id);
		System.out.println("Car id:"+c.getId());
		System.out.println("Car Name:"+c.getName());
		System.out.println("Car Type:"+c.getType());
		
	
	//	Engine e=c.getEngine();
		Engine e=em.find(Engine.class,id);
		System.out.println("Battery id"+e.getId());
		System.out.println("Battery name"+e.getName());
		System.out.println("Battery hp"+e.getHp());
		
	
		System.out.println(e.toString());
		
		
		
		
		
		

	}

}
