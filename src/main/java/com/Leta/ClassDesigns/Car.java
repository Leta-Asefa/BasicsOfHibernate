package com.Leta.ClassDesigns;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Car {

	@Id
	String id;
	String name;
	@OneToMany
	List<Driver> drivers= new ArrayList<>();
	
	public Car() {}
 
	public Car(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
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
		return "Laptop [id=" + id + ", name=" + name + "]";
	}

}
