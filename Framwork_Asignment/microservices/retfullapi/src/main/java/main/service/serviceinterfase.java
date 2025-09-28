package main.service;

import java.util.List;

import main.model.Person;

public interface serviceinterfase {

	Person adddetta(Person p);
	List<Person>viewalldeta();
	Person singledeta(int id);
	void deleadeta(int id);
	Person updetdeta(int id , Person p);
	
}
