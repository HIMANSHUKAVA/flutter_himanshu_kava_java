package com.controller;

import java.util.List;

import com.dao.Dao;
import com.model.Reader;

public class view {

	
	public static void main(String[] args) {
		
		List<Reader>s1 =  new Dao().viewlll();
		
	  for(Reader s2 : s1)
	  {
		  System.out.println(s2.getReaderid() + " "+s2.getFirstname() + " " + s2.getLastname() + " " + s2.getEmail());
		  
		  System.out.println(s2.getS());
	  }
	  
	  
	}
}
