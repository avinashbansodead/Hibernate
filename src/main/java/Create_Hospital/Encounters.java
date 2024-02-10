package Create_Hospital;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Encounters {
	@Id
	private int encounterId;
	private String encounterPatientName;
	private String  encounterDate;
	private String encounterLastIn;
	private String encounterLastOut;
	@OneToOne
	private Patient patient;
	
	public int getEncounterId() {
		return encounterId;
	}
	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}
	public String getEncounterPatientName() {
		return encounterPatientName;
	}
	public void setEncounterPatientName(String encounterPatientName) {
		this.encounterPatientName = encounterPatientName;
	}
	public String getEncounterDate() {
		return encounterDate;
	}
	public void setEncounterDate(String encounterDate) {
		this.encounterDate = encounterDate;
	}
	public String getEncounterLastIn() {
		return encounterLastIn;
	}
	public void setEncounterLastIn(String encounterLastIn) {
		this.encounterLastIn = encounterLastIn;
	}
	public String getEncounterLastOut() {
		return encounterLastOut;
	}
	public void setEncounterLastOut(String encounterLastOut) {
		this.encounterLastOut = encounterLastOut;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
