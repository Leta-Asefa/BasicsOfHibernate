package com.Leta.ClassDesigns;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Developer {

	@Id
	String id;
	String name;
	@OneToOne
	Laptop laptop;
	
	public Developer() {
	}

	public Developer(String id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}

	
	
}
