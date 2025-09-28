package main.controller;

import org.springframework.context.ApplicationContext;
import  main.model.person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.person;

public class cont 
{

	
public static void main(String[] args) {

	ApplicationContext ap =  new ClassPathXmlApplicationContext("beans.xml");
	
     person p1 = ap.getBean("s2", person.class);
     
     System.out.println(p1.toString());
     
     
}
	
}
