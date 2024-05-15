package com.example.demo;
import java.util.*;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "frienddetails")
public class FriendDetails {
	
	
	public String id;
	public String name ;
	public String date ;
	public String age;
	public String contactno;
	public String hobies;
	public String places;
	public String favmovies;
	public String location;
	public String qualification;
	public String parentemail;
	
	
	public FriendDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public FriendDetails(String name,String id, String date, String age, String contactno, String email, String hobies, String places,
			String favmovies, String location, String qualification) {
		super();
		this.id = email;
		this.name = name;
		this.date = date;
		this.age = age;
		this.contactno = contactno;
		this.hobies = hobies;
		this.places = places;
		this.favmovies = favmovies;
		this.location = location;
		this.qualification = qualification;
		this.parentemail = id;
	}

	


	public String getParentemail() {
		return parentemail;
	}



	public void setParentemail(String parentemail) {
		this.parentemail = parentemail;
	}



	public String getId() {
		return id;
	}

	

	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getContactno() {
		return contactno;
	}



	public void setContactno(String contactno) {
		this.contactno = contactno;
	}



	public String getHobies() {
		return hobies;
	}



	public void setHobies(String hobies) {
		this.hobies = hobies;
	}



	public String getPlaces() {
		return places;
	}



	public void setPlaces(String places) {
		this.places = places;
	}



	public String getFavmovies() {
		return favmovies;
	}



	public void setFavmovies(String favmovies) {
		this.favmovies = favmovies;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	


	

	
	

}
