package com.example.demo;

import java.util.HashMap;

import java.util.Random;


import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "userdetails")
public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public int id;
	public String username;
	public String password;

	
	public User(int id, String username, String password) {
		super();
		Random randI = new Random();
		this.id = randI.nextInt();
		this.username = username;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	
}