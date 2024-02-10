package AmazonData;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product 
{
	@Id
	private int id;
	private String brand;
	private String category;
	private double price;
	
	@ManyToOne
	private Cart cart;

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

	public String getCategory() 
	{
		return category;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public Cart getCart() 
	{
		return cart;
	}

	public void setCart(Cart cart) 
	{
		this.cart = cart;
	}

}
