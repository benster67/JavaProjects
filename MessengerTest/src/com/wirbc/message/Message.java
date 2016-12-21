package com.wirbc.message;

import java.util.Date;

public class Message {
	String address;
	String message;
	Date timeStamp;
	


	public Message(String message, String address) {
		this.message = message;
		this.address = address;
		timeStamp = new Date();
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public String getMessage() {
		return message;
	}
	
	public Date getDate() {
		return timeStamp;
	}

}