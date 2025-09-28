package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subscriber {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subscriptiond;
	@Column
	private String subscriptionname;
	
	
	@ManyToMany(mappedBy = "s")
    private	List<Reader>s1;


	public int getSubscriptiond() {
		return subscriptiond;
	}


	public void setSubscriptiond(int subscriptiond) {
		this.subscriptiond = subscriptiond;
	}


	public String getSubscriptionname() {
		return subscriptionname;
	}


	public void setSubscriptionname(String subscriptionname) {
		this.subscriptionname = subscriptionname;
	}


	public List<Reader> getS1() {
		return s1;
	}


	public void setS1(List<Reader> s1) {
		this.s1 = s1;
	}


	@Override
	public String toString() {
		return "Subscriber [subscriptiond=" + subscriptiond + ", subscriptionname=" + subscriptionname + ", s1=" + s1
				+ "]";
	}
	
	
	
}
