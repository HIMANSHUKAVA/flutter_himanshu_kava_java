package com.controller;

import java.util.List;

import com.dao.Dao;
import com.model.Student;

public class view {

	
	public static void main(String[] args) {
		
		List<Student>list = new Dao().viewall();
		
		for(Student s : list)
		{
			System.out.println(s);
		}
		
		
	}
}
