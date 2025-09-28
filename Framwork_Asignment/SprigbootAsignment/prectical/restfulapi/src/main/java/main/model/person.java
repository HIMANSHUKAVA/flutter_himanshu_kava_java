package main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class person 
{

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	
	@Column
	String name;
	
	@Column
	String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
}
