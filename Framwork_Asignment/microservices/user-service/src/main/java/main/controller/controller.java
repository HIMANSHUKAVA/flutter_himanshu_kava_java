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

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import main.model.person;
import main.service.userservicein;

@RestController
@RequestMapping("/user")
public class controller 
{

	@Autowired
	userservicein s;
	
	@PostMapping
	public ResponseEntity<person>savedeta(@RequestBody person p)
	{
		
		person p1 = s.insertdeta(p); 
		return new ResponseEntity<>(p1,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<person>>detafind()
	{
		List<person>s1 =  s.viewalldeta();
		
		return new ResponseEntity<>(s1,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<person>singledeta(@PathVariable int id)
	{
		person p1 = s.singledeta(id);
		
		return new ResponseEntity<>(p1,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<person>updetadeta(@PathVariable int id , @RequestBody person p)	
	{
		
		person d = s.updatdeta(p, id);
		
		return new ResponseEntity<>(d,HttpStatus.OK);
		
     }
	
	@DeleteMapping("/{id}")
	public void deleatdeta(@PathVariable int id)
	{
		s.deleatdeta(id);
	}
}
