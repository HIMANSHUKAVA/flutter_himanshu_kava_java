package main.service;

import java.util.List;

import main.model.person;

public interface personservice
{

	public person insertdeta(person p);
	public List<person>viewall();
	public void deleatbyid(int id);
	public person userbyid(int id);
	public person updatedeta(int id ,person p);
}
