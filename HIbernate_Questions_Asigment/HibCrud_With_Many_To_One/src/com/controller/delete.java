package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Cart;

public class delete {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Cart Id");
		int id = s.nextInt();
		
		
		
		new Dao().deleatdeta(id);
	}
}
