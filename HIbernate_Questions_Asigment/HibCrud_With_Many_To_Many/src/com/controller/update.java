package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.mapping.Subclass;

import com.dao.Dao;
import com.model.Reader;
import com.model.Subscriber;

public class update {

	public static void main(String[] args) {
		


	    Scanner ss = new Scanner(System.in);
	    
	    System.out.println("Enter The Reader Id");
	    int id  =  ss.nextInt();
	    
	    System.out.println("Enter the first name");
	    String name =  ss.next();
	    
	    
	    System.out.println("Enter the last name");
	    String lname =  ss.next();
	    
	    System.out.println("Enter the email");
	    String email =  ss.next();
	    
	    
	    System.out.println("Enter the subcription name");
	    String sub =  ss.next();
	    
	    
	    Reader e = new Reader();
	    e.setEmail(email);
	    e.setFirstname(lname);
	    e.setLastname(lname);
	    e.setReaderid(id);
	    
	    Subscriber r = new Subscriber();
	    r.setSubscriptionname(lname);
	   
	    List<Reader>t = new ArrayList<>();
	    List<Subscriber>l = new ArrayList<>();
	    
	    
	    t.add(e);
	    l.add(r);
	    
	    e.setS(l);
	    r.setS1(t);
	    
	    new Dao().updatedeta(e);
	    
	    
	    
	}
	
	
}
