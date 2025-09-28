package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Reader {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int readerid;
	
	@Column
	private String email;
	@Column
	private String  firstname;
	@Column
	private String lastname;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	
	@JoinTable(
		    name = "reader_subscriber",
		    joinColumns = @JoinColumn(name = "readerid"),
		    inverseJoinColumns = @JoinColumn(name = "subscriptionid")
)
	private List<Subscriber>s;

	
	
	
	
	
	public int getReaderid() {
		return readerid;
	}

	public void setReaderid(int readerid) {
		this.readerid = readerid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<Subscriber> getS() {
		return s;
	}

	public void setS(List<Subscriber> s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Reader [readerid=" + readerid + ", email=" + email + ", firstname=" + firstname + ", lastname="
				+ lastname + "]";
	}
	
	
	
	
}
