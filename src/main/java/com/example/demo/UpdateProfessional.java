package com.example.demo;
import java.util.*;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "updateprofessionaldetails")
public class UpdateProfessional {
	
	
	public String name ;
	public String gender;
	
	public String qualification ;
	public String jobrole;
	public String contactno;
	public String email;
	public String otherskills;
	public String technologies;
	public int id;
	public String experience;
	
	
	
	
	public UpdateProfessional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdateProfessional(int id ,String name,String gender, String qualification, String experience, String email, String contactno, String technologies, String otherskills,
			String jobrole) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.experience = experience;
		this.email = email;
		this.contactno = contactno;
		this.technologies = technologies;
		this.otherskills = otherskills;
		this.jobrole = jobrole;
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOtherskills() {
		return otherskills;
	}

	public void setOtherskills(String otherskills) {
		this.otherskills = otherskills;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	
	

}
