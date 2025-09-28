package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.model.product;
import main.service.productservice;

@RequestMapping("/product")
@RestController
public class controller 
{

	@Autowired

	productservice pr;
	
	@PostMapping()
	public ResponseEntity<product>savedeta(@RequestBody product p)
	{
	
		product s1 =  pr.insertdeta(p);
		return  new ResponseEntity<>(s1 , HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<product>>view()
	{
		List<product>s1 =  pr.viewalldeta();
		return new ResponseEntity<>(s1 , HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<product>singledeta(@PathVariable int id)
	{
		product s1 =  pr.singleproductdeta(id);
		
		return new ResponseEntity<>(s1 , HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void deleat(@PathVariable int id)
	{
		 pr.deleatdeta(id);
		
		return;
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<product>updet(@RequestBody product p , @PathVariable int id)
	{
		product s1 =  pr.updetdeta(p, id);
		
		return new ResponseEntity<>(s1 ,HttpStatus.OK);
	}
	
	
}
