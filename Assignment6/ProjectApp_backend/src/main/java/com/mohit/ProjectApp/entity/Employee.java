package com.mohit.ProjectApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empid;
	private String name;
	private String email;
	private long phone_No;
	private String address;
	
	
	
	public Employee() {
	
		// TODO Auto-generated constructor stub
	}

	public Employee(long empid, String name, String email, long phone_No, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.phone_No = phone_No;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public long getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
