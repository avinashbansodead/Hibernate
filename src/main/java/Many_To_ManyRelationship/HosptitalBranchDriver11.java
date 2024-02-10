package Many_To_ManyRelationship;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HosptitalBranchDriver11 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital11 hospital=new Hospital11();
		hospital.setId(2);
		hospital.setHname("Appolo");
		hospital.setCountry("India");
        
		Branch11 branch1=new Branch11();
		branch1.setId(4);
		branch1.setBname("karve");
		branch1.setPincode(411052);
		
		Branch11 branch2=new Branch11();
		branch2.setId(5);
		branch2.setBname("Deccan");
		branch2.setPincode(411051);
		
		Branch11 branch3=new Branch11();
		branch3.setId(6);
		branch3.setBname("Warje");
		branch3.setPincode(411050);

	    List<Branch11> branches=new ArrayList<Branch11>();
	    
	    branches.add(branch1);
	    branches.add(branch2);
	    branches.add(branch3);
	    hospital.setBranches(branches);
	    et.begin();
	    em.persist(hospital);
	    em.persist(branch1);
	    em.persist(branch2);
	    em.persist(branch3);
	    
	    et.commit();
	    System.out.println("Data saved");
   }
}
