package main.service;

import java.util.List;

import main.model.Category;

public interface categoryser 
{

	void adddeta(Category c);
	
	List<Category>findalls();
	
	Category userbyid(int id);
}
