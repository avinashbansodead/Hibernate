package aprril_10;

import javax.persistence.*;	
@Entity
public class Pan 
{
	@Id
	private int id;
	private String pan_No;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPan_No() {
		return pan_No;
	}
	public void setPan_No(String pan_No) {
		this.pan_No = pan_No;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}