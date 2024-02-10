package april11mobile;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mobile 
{	
	@Id
	
	private int id;
	private String brand;
	private double price;
	
	@OneToOne
	private Battery b;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public Battery getB() 
	{
		return b;
	}
	public void setB(Battery b) 
	{
		this.b = b;
	}

}
