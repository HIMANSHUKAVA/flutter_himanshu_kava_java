package main.service;

import java.util.List;

import main.model.product;

public interface productservice
{

	product insertdeta(product p);
	List<product>viewalldeta();
	product singleproductdeta(int id);
	void deleatdeta(int id);
	product updetdeta(product p , int id);
}
