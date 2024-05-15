package com.example.demo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "eventcalendar")
public class Calendartask {

	@Id
	public String crNumber;
	public String eventName;
	public String summary;
	public String details;
	public String author;
	public String timerange;
	public String startdate;
	public String enddate;
	public List<String> host;
	private String endtime;
	
	public Calendartask() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Calendartask(String crNumber, String eventName,String starttime , String endtime, String summary, String details, String author,
			String timerange) {
		super();
		this.crNumber = crNumber;
		this.eventName = eventName;
		this.summary = summary;
		this.details = details;
		this.author = author;
		this.timerange = timerange;
		this.host = host;
		this.startdate = starttime;
		this.endtime = endtime;
	}
	
	public String getCrNumber() {
		return crNumber;
	}
	
	public String getStartDate() {
		return startdate;
	}

	public void setStartDate(String starttime) {
		this.startdate = starttime;
	}

	public String getEndDate() {
		return endtime;
	}

	public void setEndDate(String endtime) {
		this.endtime = endtime;
	}

	public void setCrNumber(String crNumber) {
		this.crNumber = crNumber;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTimerange() {
		return timerange;
	}

	public void setTimerange(String timerange) {
		this.timerange = timerange;
	}

	public List<String> getHost() {
		return host;
	}

	public void setHost(List<String> host) {
		this.host = host;
	}

	

	
	
	
	
	
	
	
	
}