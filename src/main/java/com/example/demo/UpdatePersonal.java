package com.example.demo;
import java.util.*;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "updatepersonaldetails")
public class UpdatePersonal {
	
	
	public String name ;
	public String date ;
	public String email;
	public String contactno;
	public String hobies;
	public String places;
	public String favmovies;
	public int id;
	public String gender;
	
	
	
	
	
	public UpdatePersonal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdatePersonal(int id ,String name, String gender, String date, String email, String contactno, String hobies, String places,
			String favmovies) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.email = email;
		this.contactno = contactno;
		this.hobies = hobies;
		this.places = places;
		this.favmovies = favmovies;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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
	
	
	

}
