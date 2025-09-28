package main.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.modal.person;

public class cont 
{

	
public static void main(String[] args) {
	
	ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
	person p = ap.getBean("s1" , person.class);
	
	
	System.out.println(p.toString());
	
}
	
}
