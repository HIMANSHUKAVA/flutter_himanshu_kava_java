package com.controller;

import java.util.List;

import com.dao.Dao;
import com.model.Cart;

public class viewall {

	
	public static void main(String[] args) {
		
		
		List<Cart>c = new Dao().viewall();
		
		
		for(Cart c1 : c)
		{
			System.out.println(c1);
		}
	}
}
