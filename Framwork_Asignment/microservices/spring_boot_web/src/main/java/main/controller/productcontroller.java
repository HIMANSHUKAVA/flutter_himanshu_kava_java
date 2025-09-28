package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import main.model.Product;
import main.repository.ProductRepo;
import main.service.Prodcurtservicec;
import main.service.categoryservice;

@Controller
public class productcontroller
{

	@Autowired
	ProductRepo ser;
	
	@Autowired
	categoryservice ser1;
	
	@GetMapping("/product")
	public String sdeta(Model modal)
	{
		
		modal.addAttribute("product" , new Product());
		modal.addAttribute("category" , ser1.viewall());
		return "app_product";
	}
	
	
	@GetMapping("/viewproduct")
	public String all(Model modal)
	{
		
		
		List<Product>deta =  ser.findAll();
		
		modal.addAttribute("deta" , deta);
		return "viewproduct";
	}
	
	
	
	@PostMapping("/save_product")
	public String insertdeta(@ModelAttribute Product product)
	{
	
		ser.save(product);
		return "redirect:/";
        
	}
	
	
	
	
	
	
	
}
