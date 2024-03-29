package com.Leta.ClassDesigns;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Driver {

	@Id
	String id;
	String name;
	@ManyToMany(mappedBy = "drivers", cascade = CascadeType.ALL)
	List<Car> cars=new ArrayList<>();
	
	public Driver() {
	}



	public List<Car> getCars() {
		return cars;
	}



	public void setCars(List<Car> cars) {
		this.cars = cars;
	}



	public Driver(String id, String name) {
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
