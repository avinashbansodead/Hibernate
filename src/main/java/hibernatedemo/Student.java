package hibernatedemo;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
@Entity
public class Student
{
@Id
int id;
String name;
int age;
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
}

