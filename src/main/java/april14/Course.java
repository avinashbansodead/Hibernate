package april14;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course
{
	@Id
	private int id;
	private String cname;
	private String duration;
	@ManyToMany
	private List<Studente>studente;

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
	public String getDuration() 
	{
		return duration;
	}
	public void setDuration(String duration) 
	{
		this.duration = duration;
	}
	public List<Studente> getStudente() 
	{
		return studente;
	}
	public void setStudente(List<Studente> studente) {
		this.studente = studente;
	}
	
}
