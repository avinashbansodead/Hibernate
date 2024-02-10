package april12;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car
{
@Id
private int id;
private String name;
private String type;

@OneToOne
private Engine e;

public Engine getE() 
{
	return e;
}
public void setE(Engine e) 
{
	this.e = e;
}
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
public String getType() 
{
	return type;
}
public void setType(String type) {
	this.type = type;
}

}


