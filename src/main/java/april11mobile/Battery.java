package april11mobile;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Battery 
{
	@Id
	private int id ;
	private String brand;
	private double mah;
	
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
	public double getMah() 
	{
		return mah;
	}
	public void setMah(double mah) {
		this.mah = mah;
	}
	

}
