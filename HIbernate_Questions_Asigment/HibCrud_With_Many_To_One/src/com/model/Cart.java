package com.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cartid;
	
	
	@Column
	String name;
	
	@Column
	double total;

	@OneToMany(mappedBy = "cart" , cascade = CascadeType.ALL , orphanRemoval = true , fetch = FetchType.EAGER)
	List<Item>item =  new ArrayList();


	public int getCartid() {
		return cartid;
	}


	public void setCartid(int cartid) {
		this.cartid = cartid;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}



	public List<Item> getItem() {
		return item;
	}


	public void setItem(List<Item> item) {
		this.item = item;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", name=" + name + ", total=" + total + ", item=" + item + "]";
	}
	
	
	
	
	
}
