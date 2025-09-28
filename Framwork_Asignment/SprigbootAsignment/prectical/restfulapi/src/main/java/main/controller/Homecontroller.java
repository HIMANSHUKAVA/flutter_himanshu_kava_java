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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.model.person;
import main.service.personservice;

@RestController
public class Homecontroller 
{
	
	@Autowired
	personservice ser;

	@GetMapping(value = "/")
	public String homecontroller()
	{
		return "hello";
	}
	
	
	@PostMapping("/person")
	public ResponseEntity<person>insertdeta(@RequestBody person p)
	{
		person p1 = ser.insertdeta(p); 
		
		return new ResponseEntity<person>(p1,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/persons")
	public ResponseEntity<List<person>>viewall()
	{
		List<person>s =  ser.viewall();
		
		return new ResponseEntity<List<person>>(s,HttpStatus.OK);
	}
	
	@GetMapping("/persons/{id}")
	public ResponseEntity<person>singledeta(@PathVariable("id") int id)
	{
            person p =  ser.userbyid(id);
            
            
            return new ResponseEntity<person>(p,HttpStatus.OK);
	}
	
	
	
	@PutMapping("/person1/{id}")
	public ResponseEntity<person>updatedeta(@PathVariable("id") int id , @RequestBody person p1)
	{
		
		p1.setId(id);
		
		person s1 = ser.updatedeta(id, p1);
		return  new ResponseEntity<person>(s1,HttpStatus.OK);
	}
	

	@DeleteMapping("/person2/{id}")
	public String deleatdeta(@PathVariable("id") int id)
	{
		ser.deleatbyid(id);
		
		
		return "user deleted";
	}
	
	
}
