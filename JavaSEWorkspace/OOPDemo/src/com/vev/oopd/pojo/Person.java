package com.vev.oopd.pojo;

public abstract class Person {
	private String name;
	private int age;
	public Person() {
		/* default constructor */
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Name : " + name + "\t" + "Age : " + age;
	}
	
	@Override
	public boolean equals(Object other) {
		Person tempPerson = (Person) other;
		return name.equals(tempPerson.name) && age == tempPerson.getAge();
	}
}

