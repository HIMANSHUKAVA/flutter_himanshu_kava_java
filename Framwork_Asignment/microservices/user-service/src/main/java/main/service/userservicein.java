package main.service;

import java.util.List;

import main.model.person;

public interface userservicein
{

	person insertdeta(person p);
	person updatdeta(person p , int id);
	void deleatdeta(int id);
	List<person>viewalldeta();
	person singledeta(int id);
}
