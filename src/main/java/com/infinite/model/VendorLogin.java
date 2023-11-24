package com.infinite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class VendorLogin {
	@Id
	@Column(name = "User_Id")
	private int user_Id;
	@Column(name = "First_name")
	private String username;
	@Column(name = "Last_name")
	private String lname;
	@Column(name = "Email")
	private String email;
	@Column(name = "License")
	private String license;
	@Column(name = "Certificate")
	private String certificate;
	@Column(name = "Phno")
	private String phnno;
	@Column(name = "Password")
	private String vpassword;
	@Column(name = "Confirm_Password")
	private String cpassword;

	VendorLogin() {

	}

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getPhnno() {
		return phnno;
	}

	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}

	
	public String getVpassword() {
		return vpassword;
	}

	public void setVpassword(String vpassword) {
		this.vpassword = vpassword;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	
}
