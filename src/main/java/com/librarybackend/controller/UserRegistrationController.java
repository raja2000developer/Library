package com.librarybackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarybackend.model.UserRegistrationModel;


@RestController
public class UserRegistrationController {
	
	@PostMapping("/register")
	public String userRegistration(@RequestBody UserRegistrationModel userRegis) {
		return userRegis.toString();
	}
	
	
	
}
