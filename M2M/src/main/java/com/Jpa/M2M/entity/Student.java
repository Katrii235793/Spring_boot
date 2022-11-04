package com.Jpa.M2M.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="student_tab")
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	private String dept;
	
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= CascadeType.ALL)
	@JoinTable(name="student_course_table",
	joinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "id"
                    )},
    inverseJoinColumns = {
            @JoinColumn(name = "course_id", referencedColumnName = "id"
                   )})
			
	@JsonManagedReference
	private Set<Courses>courses;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
