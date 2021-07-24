package com.contact.contactservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contactservice.entity.Contact;

@Service
public class contactImp implements contactService {

	List<Contact> list=List.of(
			new Contact(1L, "m@gmail.com", "Ami", 1311L),
			new Contact(2L, "c@gmail.com", "OK", 1311L),
			new Contact(3L, "r@gmail.com", "mmm", 1312L)
			);
	
	@Override
	public List<Contact> getContactOfuser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
