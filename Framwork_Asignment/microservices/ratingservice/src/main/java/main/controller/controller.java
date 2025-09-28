package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.model.rating;
import main.service.ratingservice;

@RestController
@RequestMapping("/rating")
public class controller 
{

	@Autowired
	ratingservice rs;
	
	@PostMapping
	public ResponseEntity<rating>savedeta(@RequestBody rating r)
	{
		rating s1 =  rs.insertdeta(r);
		return new ResponseEntity<>(s1 , HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<rating>>viewall()
	{
		List<rating>s1 =  rs.viewdeta();
		
		return new ResponseEntity<>(s1,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<rating>singledeta(@PathVariable int id)
	{
		rating s1 =  rs.singledeta(id);
		
		return new ResponseEntity<>(s1,HttpStatus.OK);
	}
	
	@GetMapping("/userid/{id}")
	public ResponseEntity<List<rating>> singleuserkdeta(@PathVariable int id) {
	    List<rating> s1 = rs.userByid(id);
	    System.out.println(s1);
	    return new ResponseEntity<>(s1, HttpStatus.OK);
	}


	@GetMapping("/hotelid/{id}")
	public ResponseEntity<List<rating>> singlehotelkdeta(@PathVariable int id) {
	    List<rating> s1 = rs.HotelByid(id);
	    System.out.println(s1);
	    return new ResponseEntity<>(s1, HttpStatus.OK);
	}

	
	
	
}
