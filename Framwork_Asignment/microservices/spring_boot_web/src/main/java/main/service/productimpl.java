package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Product;
import main.repository.ProductRepo;

@Service
public class productimpl implements Prodcurtservicec
{
	
	@Autowired
	ProductRepo repo;

	@Override
	public Product adddeta(Product p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Product singlebyid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public List<Product> viewall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
	
	
	
}
