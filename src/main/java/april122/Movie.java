package april122;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie
{
	@Id
	private int id;
	private String Mname;
	private int Collection;
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getMname() 
	{
		return Mname;
	}
	public void setMname(String Mname)
	{
		this.Mname = Mname;
	}
	public int getCollection() {
		return Collection;
	}
	public void setCollection(int Collection) {
		this.Collection = Collection;
	}
	
	

}
