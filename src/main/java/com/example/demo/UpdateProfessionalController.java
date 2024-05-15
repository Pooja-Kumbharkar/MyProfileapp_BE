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
public class UpdateProfessionalController {
	
	UpdateProfessional insertUser = new UpdateProfessional();
	
	@Autowired
//	public UpdatePersonalRepository updaterepo;
	 MongoOperations mongoOperations;

	
	
	@GetMapping(value="/getupdatedprofessionalusers")
	public List<UpdateProfessional> disp()
	{
		return( mongoOperations.findAll(UpdateProfessional.class));
		
	}
	
	@GetMapping(value="/getprofessionaluserbyemail/{email}")
	public UpdateProfessional displaybyEmail(@PathVariable("email") String email)
	{
		 UpdateProfessional updateuser = mongoOperations.findOne(query(where("email").is(email)), UpdateProfessional.class);
		 return updateuser;
	}
	
	
	@PostMapping(value="/insertprofessionalusers")
	public void createUser(@RequestBody UpdateProfessional user)
	{
		
		insertUser=mongoOperations.save(user);
		System.out.println(insertUser);
			
	}
	
	@PutMapping(value="/updateprofessional")
	public void updateUser(@RequestBody UpdateProfessional user)
	{
		
		
//		mongoOperations.save(user);
		
		 UpdateProfessional updateuser = mongoOperations.findOne(query(where("email").is(user.email)), UpdateProfessional.class);
		  System.out.println("Before" + updateuser.qualification);
		  
		  System.out.println("Before" + updateuser.otherskills);

		  
		  updateuser.setExperience(user.experience);
		  updateuser.setJobrole(user.jobrole);
		  updateuser.setContactno(user.contactno);
		  updateuser.setName(user.name);
		  updateuser.setEmail(user.email);
		  updateuser.setQualification(user.qualification);
		  updateuser.setTechnologies(user.technologies);
		  updateuser.setOtherskills(user.otherskills);
		  
		  System.out.println("After " +updateuser.experience);

		  System.out.println("After" +updateuser.jobrole);


		  updateuser = mongoOperations.save(updateuser);
	  
		
		
	
	}
	
	
	

}
