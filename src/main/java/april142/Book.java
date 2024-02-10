package april142;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book 
{
@Id
private int id;
private String name;
private int nop;

@ManyToMany
List<Author>authors;
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
public int getNop() {
	return nop;
}
public void setNop(int nop) {
	this.nop = nop;
}
public List<Author> getAuthors() 
{
	return authors;
}
public void setAuthors(List<Author> authors) 
{
	this.authors = authors;
}
}
