package Create_Hospital;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class HospitalDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("account");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		

		Hospital hospital=new Hospital();
		hospital.setHospitalId(1);
		hospital.setHospitalName("Apollo Hospital");
		hospital.setHospitalCeo("Dr.Shaha");
		
		Branch branch1=new Branch();
		branch1.setBranchId(1);
		branch1.setBranchName("FIRST BRANCH");
		branch1.setBranchManager("Sanjay Raut");
		
		Branch branch2=new Branch();
		branch2.setBranchId(2);
		branch2.setBranchName("SECOND BRANCH");
		branch2.setBranchManager("Surendra Chavan");
		
		List<Branch>branches=new ArrayList<Branch>();
		branches.add(branch1);
		branches.add(branch2);
		
		hospital.setBranches(branches);
		
		Address address1=new Address();
		address1.setAddressId(1);
		address1.setAddressLocation("Baner");
		address1.setAddressLandMark("Manin Chowk");
		address1.setAddressPincode(121456);
		address1.setBranch(branch1);
		
		
		Address address2=new Address();
		address2.setAddressId(2);
		address2.setAddressLocation("Deccan");
		address2.setAddressLandMark("FC road");
		address2.setAddressPincode(654321);
		address2.setBranch(branch2);
		
		branch1.setAddress(address1);
		branch2.setAddress(address2);
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		Patient patient1=new Patient();
		patient1.setId(1);
		patient1.setName("Raju");
		patient1.setBgroup("A");
		patient1.setAge(24);

		Patient patient2=new Patient();
		patient2.setId(2);
		patient2.setName("Shyam");
		patient2.setBgroup("B");
		patient2.setAge(26);
		
		List<Patient>patientsList1=new ArrayList<Patient>();
		patientsList1.add(patient1);
		patientsList1.add(patient2);
		
		branch1.setPatients(patientsList1);
		
		patient1.setBranch(branch1); 
		patient2.setBranch(branch1);
		
		Patient patient3=new Patient();
		patient3.setId(3);
		patient3.setName("Karan");
		patient3.setBgroup("AB");
		patient3.setAge(25);

		Patient patient4=new Patient();
		patient4.setId(4);
		patient4.setName("Arjun");
		patient4.setBgroup("O");
		patient4.setAge(27);
		
		List<Patient>patientsList2=new ArrayList<Patient>();
		patientsList2.add(patient3);
		patientsList2.add(patient4);
		
		branch2.setPatients(patientsList2);
		
		patient3.setBranch(branch2); 
		patient4.setBranch(branch2);
		
		Encounters encounter1=new Encounters();
		encounter1.setEncounterId(1);
		encounter1.setEncounterPatientName("Rohit");
		encounter1.setEncounterDate("01/01/2022");
		encounter1.setEncounterLastIn("05/02/2022");
		encounter1.setEncounterLastOut("07/02/2022");

		Encounters encounter2=new Encounters();
		encounter2.setEncounterId(2);
		encounter2.setEncounterPatientName("Yash");
		encounter2.setEncounterDate("03/01/2022");
		encounter2.setEncounterLastIn("09/03/2022");
		encounter2.setEncounterLastOut("17/03/2022");
		
		Encounters encounter3=new Encounters();
		encounter3.setEncounterId(3);
		encounter3.setEncounterPatientName("Rohit");
		encounter3.setEncounterDate("06/02/2022");
		encounter3.setEncounterLastIn("29/03/2022");
		encounter3.setEncounterLastOut("7/04/2022");
		
		Encounters encounter4=new Encounters();
		encounter4.setEncounterId(4);
		encounter4.setEncounterPatientName("Mayur");
		encounter4.setEncounterDate("03/03/2022");
		encounter4.setEncounterLastIn("09/05/2022");
		encounter4.setEncounterLastOut("12/05/2022");
		
		patient1.setEncounters(encounter1);
		patient2.setEncounters(encounter2);
		patient3.setEncounters(encounter3);
		patient4.setEncounters(encounter4);
		
		encounter1.setPatient(patient1);
		encounter2.setPatient(patient2);
		encounter3.setPatient(patient3);
		encounter4.setPatient(patient4);
		
		Diesease diesease1=new Diesease();
		diesease1.setDieseaseId(1);
		diesease1.setDiseaseName("Malaria");
		diesease1.setDiseaseSymptoms("Fever,Yellowish screen");
		
		Diesease diesease2=new Diesease();
		diesease2.setDieseaseId(2);
		diesease2.setDiseaseName("Typhoid");
		diesease2.setDiseaseSymptoms("Fever,Cough");
		
		Diesease diesease3=new Diesease();
		diesease3.setDieseaseId(3);
		diesease3.setDiseaseName("Dengue");
		diesease3.setDiseaseSymptoms("Omiting,Rash,Eye pain");
		
		Diesease diesease4=new Diesease();
		diesease4.setDieseaseId(4);
		diesease4.setDiseaseName("Corona");
		diesease4.setDiseaseSymptoms("Bledding,Feeling tired,Restless");
		
		List<Diesease>diseases=new ArrayList<Diesease>();
		diseases.add(diesease1);
		diseases.add(diesease2);
		diseases.add(diesease3);
		diseases.add(diesease4);
		
		List<Patient>patientsList3=new ArrayList<Patient>();
		patientsList3.add(patient1);
		patientsList3.add(patient2);
		patientsList3.add(patient3);
		patientsList3.add(patient4);
		
		patient1.setDieseases(diseases);
		patient2.setDieseases(diseases);
		patient3.setDieseases(diseases);
		patient4.setDieseases(diseases);
		
		diesease1.setPatients(patientsList3);
		diesease2.setPatients(patientsList3);
		diesease3.setPatients(patientsList3);
		diesease4.setPatients(patientsList3);
		
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		em.persist(address1);
		em.persist(address2);
		em.persist(patient1);
		em.persist(patient2);
		em.persist(patient3);
		em.persist(patient4);
		em.persist(encounter1);
		em.persist(encounter2);
		em.persist(encounter3);
		em.persist(encounter4);
		em.persist(diesease1);
		em.persist(diesease2);
		em.persist(diesease3);
		em.persist(diesease4);
		et.commit();
}
}
