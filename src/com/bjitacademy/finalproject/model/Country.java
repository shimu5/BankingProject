package com.bjitacademy.finalproject.model;

public class Country {
	
	private int id;
	private String name;
	private String country_code;
	private String currency_code;
	private String currency_name;

	public Country() {
		super();
	}

	public Country(String currency_code,
			String currency_name) {
		super();			
		this.currency_code = currency_code;
		this.currency_name = currency_name;
	}
	
	public Country(int id, String name, String country_code, String currency_code,
			String currency_name) {
		super();
		this.id = id;
		this.name = name;
		this.country_code = country_code;
		this.currency_code = currency_code;
		this.currency_name = currency_name;
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

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public String getCurrency_name() {
		return currency_name;
	}

	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}

}
