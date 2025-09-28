package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.product;
import main.repository.repo;

@Service
public class prouctimpl implements productservice
{

	@Autowired
	repo r;
	
	@Override
	public product insertdeta(product p)
	{
		// TODO Auto-generated method stub
		return r.save(p);
	}

	@Override
	public List<product> viewalldeta() {
		// TODO Auto-generated method stub
		return r.findAll();
	}

	@Override
	public product singleproductdeta(int id) {
		// TODO Auto-generated method stub
		return r.findById(id).orElseThrow();
	}

	

	@Override
	public product updetdeta(product p, int id) {
		// TODO Auto-generated method stub
		
		p.setId(id);
		
		return r.save(p);
	}

	@Override
	public void deleatdeta(int id) {
		// TODO Auto-generated method stub
		
		r.deleteById(id);
		
	}

}
