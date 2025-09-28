package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Student;

public class singledeta {

	
	public static void main(String[] args) {
		
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter The Student Id");
		int id = ss.nextInt();
		
		
		 Student s = new Student();
		 s.setId(id);
		 
		 Student s2 =  new Dao().singledeta(s);
		 
		 System.out.println(s2);
	}
}
