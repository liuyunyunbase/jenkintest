package com.bch.peixun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserApiController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/findUser/{id}")
	public String findUser(@PathVariable Integer id) {
		String userStr = restTemplate.getForObject("http://user-server/findUser/1", String.class);
		return userStr;
	}
}
