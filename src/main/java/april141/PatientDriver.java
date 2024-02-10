package april141;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PatientDriver
{
public static void main(String[] args) 
{
EntityManagerFactory emf=Persistence.createEntityManagerFactory("avii");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

Patient patient1=new Patient();
patient1.setId(1);
patient1.setName("Vishal");
patient1.setBgroup("B+");
patient1.setAge(22);

Patient patient2=new Patient();
patient2.setId(2);
patient2.setName("Rakesh");
patient2.setBgroup("AB+");
patient2.setAge(20);

Patient patient3=new Patient();
patient3.setId(3);
patient3.setName("Rohit");
patient3.setBgroup("B");
patient3.setAge(26);

Disease disease1=new Disease();
disease1.setId(1);
disease1.setName("Hapattia");
disease1.setSymptoms("Higher fever and weakness");

Disease disease2=new Disease();
disease2.setId(2);
disease2.setName("Typhoid");
disease2.setSymptoms("Yellow screen or eyes");

Disease disease3=new Disease();
disease3.setId(3);
disease3.setName("Chicken Pox");
disease3.setSymptoms("Eichy and blister-like rash on skin");

List<Disease> disease4= new ArrayList<Disease>();
disease4.add(disease1);
disease4.add(disease2);
disease4.add(disease3);

patient1.setDiseases(disease4);
patient2.setDiseases(disease4);
patient3.setDiseases(disease4);

List<Patient>pateient4=new ArrayList<Patient>();
pateient4.add(patient1);
pateient4.add(patient2);
pateient4.add(patient3);

disease1.setPatients(pateient4);
disease2.setPatients(pateient4);
disease3.setPatients(pateient4);

et.begin();
em.persist(patient1);
em.persist(patient2);
em.persist(patient3);
em.persist(disease1);
em.persist(disease2);
em.persist(disease3);

et.commit();

System.out.println("done");



}
}