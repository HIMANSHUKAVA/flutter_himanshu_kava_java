package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.Dao;
import com.model.Cart;
import com.model.Item;

public class insert {

	
	
public static void main(String[] args) {
	
	Scanner ss = new Scanner(System.in);
	
	
//	 first cart
	
	
	Cart c = new Cart();
	
	System.out.println("Enter The Cart Name");
	String cartname1 =  ss.next();
	
	System.out.println("Enter The Cart total");
	double carttotal1 =  ss.nextDouble();
	
	
	c.setName(cartname1);
	
//	item1
	System.out.println("Enter The Itemid");
	int itemid1 = ss.nextInt();
	
	
	System.out.println("Enter the itemtotal");
	double itemtotal1 =  ss.nextDouble();
	
	System.out.println("Enter The Quantity");
	int q1 =  ss.nextInt();
	

//	item2
	
	System.out.println("Enter The second Itemid");
	int itemid2 = ss.nextInt();
	
	
	System.out.println("Enter the second itemtotal");
	double itemtotal2 =  ss.nextDouble();
	
	System.out.println("Enter The  second Quantity");
	int q2 =  ss.nextInt();
	

	
	Item item_1 = new Item();
//	item_1.setId(itemid1);
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
	
    
    
    
//    second cart
    
    Cart c1 = new Cart();
	
	System.out.println("Enter The Cart second Name");
	String cartname2 =  ss.next();
	
	System.out.println("Enter Thesecond Cart total");
	double carttotal2 =  ss.nextDouble();
	
	
	c1.setName(cartname2);
	c1.setTotal(carttotal2);
	
	
//	item1
	System.out.println("Enter second cart The Itemid");
	int itemid3 = ss.nextInt();
	
	
	System.out.println("Enter the second cart  itemtotal");
	double itemtotal3 =  ss.nextDouble();
	
	System.out.println("Enter The  second cart item Quantity");
	int q3 =  ss.nextInt();
	

//	item2
	
	System.out.println("Enter The second cart itemsecond Itemid");
	int itemid4 = ss.nextInt();
	
	
	System.out.println("Enter the second cart item two itemtotal");
	double itemtotal4 =  ss.nextDouble();
	
	System.out.println("Enter The  second cart item two Quantity");
	int q4 =  ss.nextInt();
	
	
	Item item_3 = new Item();
	item_3.setItemid(itemid3);
	item_3.setItemtotal(itemtotal3);
	item_3.setQuantity(q3);
	item_3.setCart(c1);
	
	
	Item item_4 = new Item();
	item_4.setItemid(itemid4);
	item_4.setItemtotal(itemtotal4);
	item_4.setQuantity(q4);
	item_4.setCart(c1);
	
	
	
	
    List<Item>s2 =  new ArrayList<>();
    s2.add(item_3);
    s2.add(item_4);
	
	
    c1.setItem(s2);
    
    
    new Dao().insertdeta(c);
    new Dao().insertdeta(c1);
	
}	
	
}
