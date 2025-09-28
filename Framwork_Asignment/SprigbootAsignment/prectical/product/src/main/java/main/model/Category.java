package main.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category 
{
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     int category_id;
	
	@Column
     String category_name;
     
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	List<product>s;
	
	
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public List<product> getS() {
		return s;
	}
	public void setS(List<product> s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", s=" + s + "]";
	}
	
	
	
	
 
	

}
