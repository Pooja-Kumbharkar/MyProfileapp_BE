package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UpdatePersonalController {
	
	UpdatePersonal insertUser = new UpdatePersonal();
	
	@Autowired
//	public UpdatePersonalRepository updaterepo;
	 MongoOperations mongoOperations;

	
	
	@GetMapping(value="/getupdatedusers")
	public List<UpdatePersonal> disp()
	{
		return( mongoOperations.findAll(UpdatePersonal.class));
		
	}
	

	@GetMapping(value="/getuserbyemail/{email}")
	public UpdatePersonal displaybyEmail(@PathVariable("email") String email)
	{
		 UpdatePersonal updateuser = mongoOperations.findOne(query(where("email").is(email)), UpdatePersonal.class);
		 return updateuser;
	}
	
	
	
	@PostMapping(value="/insertusers")
	public void createUser(@RequestBody UpdatePersonal user)
	{
		
		insertUser=mongoOperations.save(user);
		System.out.println(insertUser);
			
	}
	
	@PutMapping(value="/updatepersonal")
	public void updateUser(@RequestBody UpdatePersonal user)
	{
		
		
//		mongoOperations.save(user);
		
		 UpdatePersonal updateuser = mongoOperations.findOne(query(where("email").is(user.email)), UpdatePersonal.class);
		  System.out.println("Before" + updateuser.hobies);
		  
		  System.out.println("Before" + updateuser.favmovies);

		  
		  updateuser.setHobies(user.hobies);
		  updateuser.setFavmovies(user.favmovies);
		  updateuser.setContactno(user.contactno);
		  updateuser.setName(user.name);
		  updateuser.setEmail(user.email);
		  updateuser.setGender(user.gender);
		  updateuser.setPlaces(user.places);
		  updateuser.setDate(user.date);
		  
		  System.out.println("After " +updateuser.hobies);

		  System.out.println("After" +updateuser.favmovies);


		  updateuser = mongoOperations.save(updateuser);
	  
		
		
	
	}
	
	
	

}
