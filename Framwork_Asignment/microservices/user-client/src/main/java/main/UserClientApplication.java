package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserClientApplication {

	@Bean
	public RestTemplate temp()
	{
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(UserClientApplication.class, args);
	}

}
