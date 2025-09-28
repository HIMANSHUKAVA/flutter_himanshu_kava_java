package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Category;
import main.repo.category_repo;

@Service
public class categoryimpl  implements categoryser
{

	@Autowired
	category_repo r;
	
	@Override
	public void adddeta(Category c) {
		// TODO Auto-generated method stub
		
		r.save(c);
	}

	@Override
	public List<Category> findalls() {
		// TODO Auto-generated method stub
		return r.findAll();
	}

	@Override
	public Category userbyid(int id) {
		// TODO Auto-generated method stub
		return r.findById(id).orElse(null);
	}

	
	
	
	
}
