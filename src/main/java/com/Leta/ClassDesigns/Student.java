package com.Leta.ClassDesigns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
//@Table(name="Student_table")   // to give your own name for table
public class Student  {



	@Id
	String id;
	//@Column(name="fullName")   // to giver your own name for column
	String name;
	//@Transient			//to exclude the below field from table creation
	String department;
	
	public Student() {
		
	}

	
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


	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}
