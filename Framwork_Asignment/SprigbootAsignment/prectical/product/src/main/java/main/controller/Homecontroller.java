package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import main.model.Category;
import main.model.product;
import main.service.categoryser;
import main.service.productser;

@Controller
public class Homecontroller 
{

	@Autowired
	categoryser ser;
	
	@Autowired
	productser sp;
	
	
	@RequestMapping( value = "/")
	public String sdeta()
	{
		return "index";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String categoryinsertdeta(@ModelAttribute("Category") Category c , Model m)
	{
	
		  if(c.getCategory_id()>0)
		  {
			  System.out.println("category saved");
		  }
		  else
		  {
			  System.out.println("failed");
		  }
		  
		  ser.adddeta(c);
		  
		  
		  return "redirect:/product";
	}
	
	
	@RequestMapping("/product")
	public String spdeta(Model m)
	{
		List<Category>s =  ser.findalls();
		  
		m.addAttribute("categories" , s);
		 m.addAttribute("product", new product());
		
		return "product";
	}
	
	
	@RequestMapping(value = "/productsave" , method = RequestMethod.POST)
	public String productdeta(@ModelAttribute("product") product p , Model m , 
			@RequestParam(defaultValue = "0") int page , 
			@RequestParam(defaultValue = "2")int size)

	{
		
		Pageable pageble = PageRequest.of(page, size);
		Page<product>productpage =  sp.viewallpages(pageble);
		
		
		int form_id = p.getCategory().getCategory_id();
		Category existingCategory = ser.userbyid(form_id);
		
		p.setCategory(existingCategory);
		
		
		if(p.getId()>0)
		{
			m.addAttribute("message" ,"product saved");
		}
		else
		{
			m.addAttribute("message" , "failed");
		}
		sp.insertdeta(p);
		List<product>s1 = sp.viewall();
		m.addAttribute("product", new product()); // empty product object for binding
		m.addAttribute("s1" , s1);
		
		m.addAttribute("productpage" , productpage);
		m.addAttribute("currentpage" , page);
		m.addAttribute("totapages" , productpage.getTotalPages());
		
		return "product";
		
	}
	

	
	
}
