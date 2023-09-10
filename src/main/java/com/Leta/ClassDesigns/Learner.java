package com.Leta.ClassDesigns;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Learner {

	@Id
	String id;
	String name;
	@ManyToOne
	Department department;
	
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Learner() {}
 
	public Learner(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Learner [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}
