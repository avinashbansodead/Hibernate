package april13;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company 
{
 @Id
  private int id ;
  private String cname ;
  private String location ;
  
  public int getId() 
  {
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname) 
	{
		this.cname = cname;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
  
  
}
