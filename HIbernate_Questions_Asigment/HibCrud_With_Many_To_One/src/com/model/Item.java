package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	int id;
	
	
	@Column
	int itemid;
	
	@Column
	double itemtotal;
	
	@Column
	int quantity;
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	Cart cart;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public double getItemtotal() {
		return itemtotal;
	}

	public void setItemtotal(double itemtotal) {
		this.itemtotal = itemtotal;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemid=" + itemid + ", itemtotal=" + itemtotal + ", quantity=" + quantity ;
	}

	
	
	
	
	
	
}
