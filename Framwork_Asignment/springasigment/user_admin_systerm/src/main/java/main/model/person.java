package main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class person 
{

	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	@Column
	String fname;
	@Column
	String lname;
	@Column
	String email;
	@Column
	String password;
	@Column
	String gender;
	@Column
	String photo;
	@Column
	String mobile;
	
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", gender=" + gender + ", photo=" + photo + ", mobile=" + mobile + "]";
	}


	
	
	
	
}
