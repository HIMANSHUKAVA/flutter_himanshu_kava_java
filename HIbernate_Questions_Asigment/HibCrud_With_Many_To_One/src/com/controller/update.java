package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.Dao;
import com.model.Cart;
import com.model.Item;

public class update {

	
	public static void main(String[] args) {
		
		
		Scanner ss = new Scanner(System.in);
		
		
//		 first cart
		
		
		Cart c = new Cart();
		

		System.out.println("Enter the cart id");
		int id = ss.nextInt();
		
		
		System.out.println("Enter The Cart Name");
		String cartname1 =  ss.next();
		
		System.out.println("Enter The Cart total");
		double carttotal1 =  ss.nextDouble();
		
		c.setName(cartname1);
		c.setCartid(id);
//		item1
		System.out.println("Enter The Itemid");
		int itemid1 = ss.nextInt();
		
		
		System.out.println("Enter the itemtotal");
		double itemtotal1 =  ss.nextDouble();
		
		System.out.println("Enter The Quantity");
		int q1 =  ss.nextInt();
		

//		item2
		
		System.out.println("Enter The second Itemid");
		int itemid2 = ss.nextInt();
		
		
		System.out.println("Enter the second itemtotal");
		double itemtotal2 =  ss.nextDouble();
		
		System.out.println("Enter The  second Quantity");
		int q2 =  ss.nextInt();
		

		
		Item item_1 = new Item();
//		item_1.setId(itemid1);
		item_1.setItemid(itemid1);
		item_1.setItemtotal(itemtotal1);
		item_1.setQuantity(q1);
		item_1.setCart(c);
		
		Item item_2 = new Item();
		
		item_2.setItemid(itemid2);
		item_2.setItemtotal(itemtotal2);
		item_2.setQuantity(q2);
		item_2.setCart(c);
		
	    List<Item>s1 =  new ArrayList<>();
	    s1.add(item_1);
	    s1.add(item_2);
	    
	    c.setItem(s1);
	    c.setTotal(carttotal1);
		
	    
	 
	    new Dao().updatedeta(c);
	}
}
