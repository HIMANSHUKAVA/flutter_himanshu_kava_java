package com.main.controller;


import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.main.model.Rating;
import com.main.model.User;
import com.main.service.userservice;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

//❌ अगर ये import नहीं किया:
import org.springframework.http.HttpStatus;

@Controller
@RequestMapping("/user")
public class Globalcontroller
{

	@Autowired
	userservice s;
	
	@Autowired
	private RestTemplate temp;
	
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Globalcontroller.class);

	
	@PostMapping
	public ResponseEntity<User>savedeta(@RequestBody  User r)
	{
	     User s1=	s.insertdeta(r);
		
 
	     return new ResponseEntity<>(s1 , HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<User>>getall()
	{
		List<User>s1 =  s.viewall();
		
		return new ResponseEntity<>(s1 ,  HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User>userid(@PathVariable  int id)
	{
		User s1 =  s.userbyid(id);
//		http://localhost:8084/rating/userid/1
		
	
		
		Rating[]s2 = temp.getForObject("http://localhost:8084/rating/userid/1",Rating[].class);
		
		List<Rating>s3 = Arrays.asList(s2);
		
		s1.setRatings(s3);
		
		
		logger.info("{}"+s3);
		return new ResponseEntity<>(s1 , HttpStatus.OK); 
		
		
		
	}
	
	
	
	
}
