package com.src;

import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.validate.addvalid;
import com.validate.emailvalid;

public class Customer {

	@Min(value=10,message="less than 10")
	@Max(value=100,message="gr8 than 100")
	private int custid;
	
	@Pattern(regexp="^[a-zA-Z0-9]{10}",message="invalid")
	private String fatherName;
	
	@Pattern(regexp="^[a-zA-Z0-9]{11}",message="invalid")
	private String motherName;
	
	@com.validate.gender
	private String gender;
	
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@NotNull(message="required")
	private Date dob;
	
	@Min(value=10, message="invalid")
	@Max(value=10, message="invalid")
	private long mobileno;
	
	@Min(18)
	@Max(25)
	private int age;
	
	@Size(min=5, message="invalid")
	private String custname;
	
	@emailvalid
	private String emailid;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	@addvalid
	private String custadd;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustadd() {
		return custadd;
	}
	public void setCustadd(String custadd) {
		this.custadd = custadd;
	}
	
	
}
