package com.Leta.ClassDesigns;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	@Id
	String id;
	Name name;
	String department;
	
	public Teacher() {
	}
	
	public Teacher(String id, Name name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Teacher(String string, String string2, String string3) {
	
		//change the Name name field to String name; for this constructor to work
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	

}
