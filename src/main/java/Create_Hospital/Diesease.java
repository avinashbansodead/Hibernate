package Create_Hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Diesease {

	@Id
	private int dieseaseId;
	private String diseaseName;
	private String diseaseSymptoms;
	
@ManyToMany
	private List<Patient> patients;

public int getDieseaseId() {
	return dieseaseId;
}

public void setDieseaseId(int dieseaseId) {
	this.dieseaseId = dieseaseId;
}

public String getDiseaseName() {
	return diseaseName;
}

public void setDiseaseName(String diseaseName) {
	this.diseaseName = diseaseName;
}

public String getDiseaseSymptoms() {
	return diseaseSymptoms;
}

public void setDiseaseSymptoms(String diseaseSymptoms) {
	this.diseaseSymptoms = diseaseSymptoms;
}

public List<Patient> getPatients() {
	return patients;
}

public void setPatients(List<Patient> patients) {
	this.patients = patients;
}
}
