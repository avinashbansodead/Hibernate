package april14;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Studente
{
@Id
private int id;

@Column(nullable = false)
private String name;

private int age;
private int yop;

@Column(unique = true)
private long mobno;
@ManyToMany
private List<Course>course;

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
public int getAge() 
{
	return age;
}
public void setAge(int age) 
{
	this.age = age;
}
public int getYop()
{
	return yop;
}
public void setYop(int yop) 
{
	this.yop = yop;
}
public long getMobno() 
{
	return mobno;
}
public void setMobno(long mobno) 
{
	this.mobno = mobno;
}
public List<Course> getCourse() 
{
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}

}
