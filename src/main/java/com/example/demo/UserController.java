package com.example.demo;

import java.util.ArrayList;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	public UserRepository userrepo;
	
	String s=new String("Hello");
	
	//Get user details (Read)
	@GetMapping(value="/getusers")
	public List<User> disp()
	{
		return userrepo.findAll();
		
	}
	
	//Store the user in database (Create)
	@PostMapping(value="/createuser")
	public String createUser(@RequestBody User user)
	{
		
		User insertUser=userrepo.insert(user);
		return "User Inserter";
		
			
	}
	
	@DeleteMapping(value = "/deleteuser")
	public String deleteUser(@RequestBody User user)
	{
		userrepo.delete(user);
		return "User" +user.getUsername() + "Deleted" ;
		
	}
	
	
}
  