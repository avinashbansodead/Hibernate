package april121;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch 
{
  @Id
  private int id ;
  private String bname ;
  private int pincode ;
  
  public int getId() 
  {
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getBname() 
	{
		return bname;
	}
	public void setBname(String bname) 
	{
		this.bname = bname;
	}
	public int getPincode() 
	{
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
  
  
}
