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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CalendarController {
	
	@Autowired
	 MongoOperations mongoOperations;

	Calendartask calendartask = new Calendartask();
	
	
	
	@GetMapping(value="/geteventsbydate/{startdate}/{enddate}")
	public List<Calendartask> disp(@PathVariable("startdate") String startdate, @PathVariable("enddate") String enddate )
	{
		System.out.println("Start Date is " +startdate);
		System.out.println("Start Date is " +enddate);

		List<Calendartask> calendartask = mongoOperations.find(query(where("startdate").is(startdate).and("enddate").is(enddate)), Calendartask.class);
		return calendartask;		
	}
	
	@GetMapping(value="/getevents")
	public List<Calendartask> disp()
	{

		List<Calendartask> calendartask = mongoOperations.findAll(Calendartask.class);
		return calendartask;		
	}
	
	@GetMapping(value="/geteventbyid/{crid}")
	public Calendartask disp(@PathVariable("crid") String crid)
	{
		Calendartask getevent = mongoOperations.findOne(query(where("_id").is(crid)), Calendartask.class);
		return getevent;		
	}
	
	
	@PostMapping(value="/setevents")
	public void createUser(@RequestBody Calendartask user)
	{
		
		calendartask=mongoOperations.save(user);
		System.out.println(calendartask);
			
	}
	
	@DeleteMapping(value="/deleteevents/{crid}")
	public void deleteUser(@PathVariable("crid") String crid)
	{
		Calendartask deleteevent = mongoOperations.findOne(query(where("_id").is(crid)), Calendartask.class);
		mongoOperations.remove(deleteevent);
		System.out.println("Event deleted");
		
	}
	
	@PutMapping(value="/updateevents/{crid}")
	public void updateUser(@RequestBody Calendartask user, @PathVariable("crid") String crid)
	{
		
		
//		mongoOperations.save(user);
		
		 Calendartask updateevent = mongoOperations.findOne(query(where("_id").is(user.crNumber)), Calendartask.class);

		 updateevent.setEventName(user.eventName);
		 updateevent.setSummary(user.summary);
		 updateevent.setDetails(user.details);
		 updateevent.setAuthor(user.author);
		 updateevent.setTimerange(user.timerange);
		 updateevent.setHost(user.host);
		 
		 mongoOperations.save(updateevent);
		 
		 
	  	
	
	}
	
	
	
	


}
