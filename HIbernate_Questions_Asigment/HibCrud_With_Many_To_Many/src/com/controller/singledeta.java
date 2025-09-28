package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Reader;

public class singledeta {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id = s.nextInt();
		
		Reader r = new Reader();
		r.setReaderid(id);
		
		Reader s2 =  new Dao().singledeta(r);
		
		System.out.println(s2);
	}
}
