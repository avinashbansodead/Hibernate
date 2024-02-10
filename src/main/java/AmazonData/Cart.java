package AmazonData;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart 
{
	@Id
	private int id;
	private String name;
	private double price;
	
	@OneToOne
	private Account account;
	
	@OneToMany
	private List<Product> products;

	public List<Product> getProducts() 
	{
		return products;
	}

	public void setProducts(List<Product> products) 
	{
		this.products = products;
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

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) 
	{
		this.account = account;
	}

}
