package Create_Hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital {
	@Id
	private int hospitalId;
	private String hospitalName;
	private String hospitalCeo;
	
@OneToMany
	
	private List<Branch>branches;
	
	public List<Branch> getBranches() {
	return branches;
}
public void setBranches(List<Branch> branches) {
	this.branches = branches;
}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalCeo() {
		return hospitalCeo;
	}
	public void setHospitalCeo(String hospitalCeo) {
		this.hospitalCeo = hospitalCeo;
	}
	
}