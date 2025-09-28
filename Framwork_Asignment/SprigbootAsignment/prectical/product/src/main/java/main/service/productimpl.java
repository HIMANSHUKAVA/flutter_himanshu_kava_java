package main.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import main.model.product;
import main.repo.productrepo;

@Service
public class productimpl implements productser
{
	
	@Autowired
	productrepo r;

	@Override
	public void insertdeta(product p) {
		// TODO Auto-generated method stub
		
		r.save(p);
	}

	@Override
	public List<product> viewall() {
		// TODO Auto-generated method stub
		return r.findAll();
	}

	@Override
	public Page<product> viewallpages(Pageable pageable) {
		// TODO Auto-generated method stub
		return r.findAll(pageable);
	}

}
