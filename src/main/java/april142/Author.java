package april142;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author 
{
	@Id
	private int id;
	private String name;
	private int award;
	
	
	@ManyToMany
	List<Book> books;

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

	public int getAward()
	{
		return award;
	}

	public void setAward(int award) 
	{
		this.award = award;
	}

	public List<Book> getBooks()
	{
		return books;
	}

	public void setBooks(List<Book> books) 
	{
		this.books = books;
	}

	
	
}
