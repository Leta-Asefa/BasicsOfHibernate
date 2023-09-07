package com.Leta.BasicsOfHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {

	@Id
	String id;
	String name;
	String department;
	
	
	public Student(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
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


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public Student() {
	
	}

}