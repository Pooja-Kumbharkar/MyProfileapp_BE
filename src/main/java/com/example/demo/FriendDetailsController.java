package com.example.demo;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

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
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FriendDetailsController {
	
	@Autowired
//	public FriendDetailsRepository friendrepo;
	 MongoOperations mongoOperations;

	FriendDetails frienddetails = new FriendDetails();
	
	
	
	@GetMapping(value="/getfrienddetials/{parentemail}")
	public List<FriendDetails> disp(@PathVariable("parentemail") String parentemail)
	{
		List<FriendDetails> frienddetail = mongoOperations.find(query(where("parentemail").is(parentemail)), FriendDetails.class);
		return frienddetail;
	}
	
	
	
	
	@PostMapping(value="/updatefrienddetails")
	public void createUser(@RequestBody FriendDetails user)
	{
		FriendDetails frienddetails = mongoOperations.save(user);	
			
	}
	
	@DeleteMapping(value = "/removefriend")
	public void deleteUser(@RequestBody FriendDetails user)
	{
		mongoOperations.remove(user);
//		return "User" +user.getName() + "Deleted" ;
		
	}
	
	


}
