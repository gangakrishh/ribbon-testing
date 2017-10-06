package com.example.profile;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Autowired
	DiscoveryClient client;
	
	private Random ran = new Random(10000);
	@RequestMapping("/profile")
	public String profile(){
		ServiceInstance SI = client.getLocalServiceInstance();
		String s = SI.getHost() + ":"+SI.getPort();
		return "Profile"+ran.nextInt()+s;
	}
	
}
