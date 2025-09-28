package main.controller;

import java.util.List;

import org.hibernate.annotations.ConcreteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.model.Person;
import main.service.serviceinterfase;

@RestController
@RequestMapping("/user")
public class HomeController
{


	@Autowired
	serviceinterfase sf;
	
	
	
	@PostMapping
	public ResponseEntity<Person>insertdeta(@RequestBody Person p)
	{
		Person p1 =  sf.adddetta(p);
		return new ResponseEntity<>(p1,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Person>>viewalluser()
	{
		List<Person>p1 =  sf.viewalldeta();
		
		return new ResponseEntity<>(p1,HttpStatus.OK);
	}
	
	@GetMapping("/{id")
	public ResponseEntity<Person>singledeta(@PathVariable int id)
	{
		Person p2 =  sf.singledeta(id);
		
		return new ResponseEntity<>(p2,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	void deleatdeta(@PathVariable int id)
	{
		sf.deleadeta(id);
	}
	
	@PutMapping
	public ResponseEntity<Person>updet(@RequestBody Person p , @PathVariable int id)
	{
		Person p1 =  sf.updetdeta(id, p);
		return new ResponseEntity<>(p1, HttpStatus.OK);
	}




}
