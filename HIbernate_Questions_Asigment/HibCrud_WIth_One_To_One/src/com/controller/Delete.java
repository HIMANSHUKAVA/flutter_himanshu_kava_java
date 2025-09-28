package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Student;

public class Delete {

	
	public static void main(String[] args) {
		
		
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Enter The Student  Id");
		
		int id = ss.nextInt();
		
		Student s = new Student();
		
		s.setId(id);
		
		new Dao().deleatdeta(s);
		
		
	}
}
