package april141;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Disease 
{
	@Id
	private int id;
	private String name;
	private String symptoms;
	
	@ManyToMany
	List<Patient>patients;

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getSymptoms()
	{
		return symptoms;
	}

	public void setSymptoms(String symptoms) 
	{
		this.symptoms = symptoms;
	}

	public List<Patient> getPatients() 
	{
		return patients;
	}

	public void setPatients(List<Patient> patients) 
	{
		this.patients = patients;
	}

}
