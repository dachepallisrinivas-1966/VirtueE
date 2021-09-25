package com.vev.oopd.ui;

import com.vev.oopd.pojo.Employee;
import com.vev.oopd.pojo.Manager;
import com.vev.oopd.pojo.Person;
import com.vev.oopd.pojo.Student;

public class InheritanceApp {

	public static void main(String[] args) {
		
		// Person person = new Person("Divya", 19);
		// System.out.println(person);		// System.out.println(person.toString())
		
		Employee employee = new Employee("Ramana", 23, 54000);
		System.out.println(employee);
		
		Student student = new Student("Kumar", 21, 34000);
		System.out.println(student);
		
		Manager manager = new Manager("Rahul", 47, 78000, 8000);
		System.out.println(manager);
		System.out.println(manager.hashCode());
		
//		Person person2 = new Person("Divya", 19);
//		System.out.println(person == person2);
//		System.out.println(person.equals(person2));
		
	}

}
