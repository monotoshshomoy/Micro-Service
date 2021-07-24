package com.Monotosh.userservice.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.Monotosh.userservice.entity.*;
@Service
public class UserServiceImp implements UserService {
	
List<User> list=List.of(
			new User(1311L,"Monotosh","4322"),
			new User(1312L,"Sume","1232"),
			new User(1313L,"Shomoy","6789")
);
	
	@Override
	public User getUser(Long id) {
		
		return list.stream().filter(user ->user.getUserId().equals(id)).findAny().orElse(null);
	}


}
