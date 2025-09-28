package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Cart;

public class singledeta {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Enter the cart id");
		int id =  ss.nextInt();
		
		
		Cart c = new Cart();
		c.setCartid(id);
		
	     Cart c1 =  new Dao().singledeta(c);	
		
	     
	     System.out.println(c1);
	}
}
