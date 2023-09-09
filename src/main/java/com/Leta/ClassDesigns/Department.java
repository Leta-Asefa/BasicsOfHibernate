package com.Leta.ClassDesigns;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	String id;
	String name;
	@OneToMany(mappedBy = "department")
	List<Learner> learners=new ArrayList<>();
	
	public Department() {
	}

	public List<Learner> getLearners() {
		return learners;
	}

	public void setLearners(List<Learner> learners) {
		this.learners = learners;
	}

	public Department(String id, String name) {
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
		return "Developer [id=" + id + ", name=" + name + ", laptop=" +  "]";
	}

	
	
}
