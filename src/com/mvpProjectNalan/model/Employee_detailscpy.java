package com.mvpProjectNalan.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class Employee_detailscpy {
	
	@Id
	@GeneratedValue
	@Column(name="details_id")
	private int details_id;
	
	@Column(name="employee_id")
	private int employee_id;

	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="middlename")
	private String middlename;

	@Column(name="address")
	private String address;
	
	@Column(name="phonenumber")
	private long phonenumber;

	@Column(name="aadhaarnumber")
	private String aadhaarnumber;
	
	@Column(name="pannumber")
	private String pannumber;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="fathername")
	private String fathername;
	
	@Column(name="mothername")
	private String mothername;
	
	@Column(name="bloodgroup")
	private String bloodgroup;
	
	@Column(name="department")
	private String department;
	
	@Column(name="collegename")
	private String collegename;
	
	@Column(name="cgpa")
	private String cgpa;

	public int getDetails_id() {
		return details_id;
	}

	public void setDetails_id(int details_id) {
		this.details_id = details_id;
	}

	

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double  getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAadhaarnumber() {
		return aadhaarnumber;
	}

	public void setAadhaarnumber(String aadhaarnumber) {
		this.aadhaarnumber = aadhaarnumber;
	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

}
