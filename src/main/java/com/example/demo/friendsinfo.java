package com.example.demo;

public class friendsinfo {

	public String name ;
	public String date ;
	public String age;
	public String contactno;
	public String hobies;
	public String places;
	public String favmovies;
	public String location;
	public String qualification;
	
	
	public friendsinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public friendsinfo(String name, String date, String age, String contactno, String hobies, String places,
			String favmovies, String location, String qualification) {
		super();
		this.name = name;
		this.date = date;
		this.age = age;
		this.contactno = contactno;
		this.hobies = hobies;
		this.places = places;
		this.favmovies = favmovies;
		this.location = location;
		this.qualification = qualification;
	}
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
	
	public void setAge(String email) {
		this.age = email;
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
