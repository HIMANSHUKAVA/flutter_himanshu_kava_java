package main.model;

public class person 
{

	String id;
	String fname;
	String lname;
	String email;
	String mobail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getMobail() {
		return mobail;
	}
	public void setMobail(String mobail) {
		this.mobail = mobail;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobail=" + mobail
				+ "]";
	}
	
	
	
	
	
}
