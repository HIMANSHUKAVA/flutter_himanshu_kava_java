package main.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
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
import org.springframework.web.client.RestTemplate;

import main.model.person;

@RequestMapping("/client")
@RestController
public class controller
{

	@Autowired
	RestTemplate temp;
	
	 Logger  lsd= LoggerFactory.getLogger(controller.class);
	
	@PostMapping
	public ResponseEntity<person> savedeta(@RequestBody person p1)
	{
		lsd.info("{}"+p1);
		
		return temp.postForEntity("http://localhost:8081/user", p1, person.class);
		
	}
	
	@GetMapping
	public ResponseEntity<List<person>>viewalldeta()
	{
	

		ResponseEntity<List<person>>response = temp.exchange(
				
				"http://localhost:8081/user",
				HttpMethod.GET , 
				null,
				 new ParameterizedTypeReference<List<person>>() {}
				
				
				);
		
		return response;
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<person>sdeta(@PathVariable int id)
	{
		person p2 =  temp.getForObject("http://localhost:8081/user/"+id, person.class);
		
		return new ResponseEntity<>(p2,HttpStatus.OK);

	}
	
	@DeleteMapping("/{id}")
	public void deleatdeta(@PathVariable int id)
	{
	   temp.delete("http://localhost:8081/user/"+id);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<person>updet(@RequestBody person p , @PathVariable int id)
	{
		
		temp.put("http://localhost:8081/user/"+id,p);
		return   null;
	}
	
	
	
	
	
}
