package com.controller;

import java.util.Scanner;

import com.dao.Dao;

public class delete {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Reader Id");
		int id =  s.nextInt();
		
		new Dao().deletedeta(id);
	}
}
