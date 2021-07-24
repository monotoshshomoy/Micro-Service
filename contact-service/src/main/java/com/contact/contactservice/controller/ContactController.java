package com.contact.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contactservice.entity.Contact;
import com.contact.contactservice.service.contactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private contactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId)
	{
		return this.contactService.getContactOfuser(userId);
		
	}
}
