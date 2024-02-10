package Create_Hospital;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Address {
	@Id
	private int AddressId;
	private String AddressLocation;
	private String AddressLandMark;
	private int AddressPincode;
	@OneToOne
	private Branch branch;
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public String getAddressLocation() {
		return AddressLocation;
	}
	public void setAddressLocation(String addressLocation) {
		AddressLocation = addressLocation;
	}
	public String getAddressLandMark() {
		return AddressLandMark;
	}
	public void setAddressLandMark(String addressLandMark) {
		AddressLandMark = addressLandMark;
	}
	public int getAddressPincode() {
		return AddressPincode;
	}
	public void setAddressPincode(int addressPincode) {
		AddressPincode = addressPincode;
	}
	
}
