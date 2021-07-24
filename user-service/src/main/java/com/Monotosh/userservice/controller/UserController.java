package com.Monotosh.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Monotosh.userservice.entity.User;
import com.Monotosh.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId)
	{
		User user=userservice.getUser(userId);
		
		List contacts = this.restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/" + userId, List.class);
		
		user.setContacts(contacts);
		
		return user;
		
	}

}