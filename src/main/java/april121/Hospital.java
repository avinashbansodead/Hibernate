package april121;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Hospital 
{
	@Id
	private int id;
	private String hname ;
	private String country ;
	
	@OneToMany
	private List<Branch> branches ;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getHname() 
	{
		return hname;
	}
	public void setHname(String hname) 
	{
		this.hname = hname;
	}
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	public List<Branch> getBranches() 
	{
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	
	

}
