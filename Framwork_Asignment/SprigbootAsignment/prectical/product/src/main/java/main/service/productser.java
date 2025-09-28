package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.model.product;
import main.repo.productrepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface productser 
{

	
	
	void insertdeta(product p);
	List<product>viewall();
	
	
	Page<product>viewallpages(Pageable pageable);
	
}
