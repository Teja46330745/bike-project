package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double milage;
	
	public Bike() {}
	
	public Bike(int id, String name, double milage) {
		super();
		this.id = id;
		this.name = name;
		this.milage = milage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", milage=" + milage + "]";
	}
	

}
