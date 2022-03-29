package com.gl.collegefest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="name")
	private String name;


	@Column(name="department")
	private String department;


	@Column(name="country")
	private String country;


	public Student() {
		
	}


	public Student( String name, String department, String country) {
		
		this.name = name;
		this.department = department;
		this.country = country;
	}

	@Override
	public String toString() {
		return "StudentsList [id=" + id + ", name=" + name + ", Department=" + department + ", Country=" + country
				+ "]";
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


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}




}
