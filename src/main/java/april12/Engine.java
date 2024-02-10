package april12;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine 
{
	@Id
	private int id;
	private String name;
	private int hp;
	
	@OneToOne
	private Car c;
	
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
	public int getHp() 
	{
		return hp;
	}
	public void setHp(int hp) 
	{
		this.hp = hp;
	}
	public Car getC() {
		return c;
	}
	public void setC(Car c) {
		this.c = c;
	}
	@Override
	public String toString()
	{
	return "Engine[id= " +id+",name=" +name+",hp=" +hp+ "]";
	}

}
