package com.contact.contactservice.service;

import java.util.List;

import com.contact.contactservice.entity.Contact;

public interface contactService {

	public List<Contact> getContactOfuser(Long userId);
}
