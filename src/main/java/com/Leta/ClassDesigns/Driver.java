package com.Leta.ClassDesigns;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Driver {

	@Id
	String id;
	String name;
	@ManyToOne
	Car car;
	public Driver() {
	}

	public Driver(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Driver(String id, String name,Car car) {
		super();
		this.id = id;
		this.name = name;
		this.car=car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
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
