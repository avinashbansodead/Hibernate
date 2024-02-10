package AmazonData;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account 
{
	@Id
	private int id;
	private String name;
	private long phoneno;
	private String email;
	private String pass;
	
	@OneToOne
	private Cart cart;

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

	public long getPhoneno() 
	{
		return phoneno;
	}

	public void setPhoneno(long phoneno)
	{
		this.phoneno = phoneno;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPass() 
	{
		return pass;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}

	public Cart getCart() 
	{
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	

}
