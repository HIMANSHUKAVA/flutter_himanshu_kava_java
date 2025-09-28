package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String Street;
	
	@Column
	String city;
	
	@Column
	String state;

	
	@OneToOne
	Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", Street=" + Street + ", city=" + city + ", state=" + state + ", student="
				+ student + "]";
	}
	
	
	
}
