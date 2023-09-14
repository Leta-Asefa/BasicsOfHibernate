package com.Leta.BasicsOfHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NameDepartment {
	@Id
	String name;
	String department;
	
	@Override
	public String toString() {
		return "NameDepartment [name=" + name + ", department=" + department + "]";
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

	public NameDepartment() {
		// TODO Auto-generated constructor stub
	}

}
