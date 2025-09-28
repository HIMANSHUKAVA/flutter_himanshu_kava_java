package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Address;
import com.model.Student;

public class insert {

	
	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Enter The Name");
		String name =  ss.next();
		
		
		System.out.println("Enter The City");
		String city =  ss.next();
		
		
		System.out.println("Enter The State");
		String state =  ss.next();
		
		
		System.out.println("Enter The Striet");
		String Striet =  ss.next();
		
		
		
		Address a = new Address();
		a.setCity(city);
		a.setState(state);
		a.setStreet(Striet);
		
		Student s = new Student();
		
		s.setName(name);
		s.setAddress(a);
		
		
		new Dao().insertdeta(s);
		
		
	}
}
