package com.example.Elmo3lem.Utils;

public class CustomResponce {
	
	int statusCode = 200;
	String message = "sucsess";
	Object content =null;
	
	
	public CustomResponce(){ 
	}


	
	public CustomResponce(int statusCode, String message, Object content) {
 		this.statusCode = statusCode;
		this.message = message;
		this.content = content;
	}

	public CustomResponce( Object content) { 
		this.content = content;
	}
 

	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Object getContent() {
		return content;
	}


	public void setContent(Object content) {
		this.content = content;
	}
	
 
	
	
}
