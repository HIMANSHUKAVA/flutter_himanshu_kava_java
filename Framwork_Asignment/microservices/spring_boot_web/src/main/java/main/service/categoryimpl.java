package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Category;
import main.repository.CategoryRepo;

@Service
public class categoryimpl implements categoryservice 
{
	
	@Autowired
	CategoryRepo repo;

	@Override
	public Category adddeta(Category c)
	{
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public List<Category> viewall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
