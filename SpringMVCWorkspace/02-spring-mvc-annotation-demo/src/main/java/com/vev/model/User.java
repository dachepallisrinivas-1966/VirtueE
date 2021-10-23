package com.vev.model;

public class User {
	private String name;
	private int age;
	private String email;
	private String country;
	
	public User() {
		/* default constructor */
	}

	public User(String name, int age, String email, String country) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return String.format("User [name=%s, age=%s, email=%s, country=%s]", name, age, email, country);
	}

	
}
