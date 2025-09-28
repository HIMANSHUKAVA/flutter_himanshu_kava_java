package main.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.listhandler;

public class cont 
{

	
	public static void main(String[] args) {
		
		ApplicationContext ap =  new ClassPathXmlApplicationContext("beans.xml");
		listhandler l =  ap.getBean("list" , listhandler.class);
	
	      System.out.println(l.toString());
		
	}
	
}
