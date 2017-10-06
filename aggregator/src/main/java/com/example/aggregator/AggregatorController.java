package com.example.aggregator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class AggregatorController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/welcome")
	public String welcome(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> s = new HttpEntity<>(headers);
		String fullUrl = "http://profile/profile";
		ResponseEntity<String> response = restTemplate.exchange(fullUrl, HttpMethod.GET, s, String.class);
		return "hello"+response.getBody();
		
	}
	
}
