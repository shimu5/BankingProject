package com.bjitacademy.finalproject.model;

public class AccountType {

	int id;
	String name;
	public AccountType() {
		super();	
	}
	
	public AccountType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		
	
}
