package Create_Hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Patient {
	
	@Id
	private int id;
	private String name;
	private String bgroup;
	private int age;
	@ManyToOne
	private Branch branch;
	
	@OneToOne
	Encounters encounters;
	@ManyToMany
	private List<Diesease>dieseases;
	
	public List<Diesease> getDieseases() {
		return dieseases;
	}
	public void setDieseases(List<Diesease> dieseases) {
		this.dieseases = dieseases;
	}
	public Encounters getEncounters() {
		return encounters;
	}
	public void setEncounters(Encounters encounters) {
		this.encounters = encounters;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBgroup() {
		return bgroup;
	}
	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
