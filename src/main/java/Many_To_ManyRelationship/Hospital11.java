package Many_To_ManyRelationship;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Hospital11 
{
	@Id
	private int id;
	private String hname ;
	private String country ;
	
	@ManyToMany
	private List<Branch11> branches ;
	
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
	public List<Branch11> getBranches() 
	{
		return branches;
	}
	public void setBranches(List<Branch11> branches) {
		this.branches = branches;
	}
	
	

}
