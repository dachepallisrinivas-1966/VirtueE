package com.vev.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="c_id")
	private Long courseId;
	
	@Column(name="c_name")
	private String courseName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="course", fetch = FetchType.LAZY)
	private Set<Student> students;
	
	public Course() {
		/* default constructor */
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	
	public Long getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		// return String.format("Course [courseId=%s, courseName=%s, students=%s]", courseId, courseName, students);
		return String.format("Course [courseId=%s, courseName=%s]", courseId, courseName);
	}
	
	
}
