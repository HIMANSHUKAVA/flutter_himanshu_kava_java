package main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class controller 
{

	
	 @Autowired
	    private RestTemplate temp;

	    private static final Logger s = LoggerFactory.getLogger(controller.class);

	    @GetMapping
	    public String sdeta() {
	        String response = temp.getForObject("http://localhost:8082/world", String.class);

	        // सही तरीका से log
	        s.info("Response from world-service: {}", response);

	        return "hello" + response;
	    }
}
