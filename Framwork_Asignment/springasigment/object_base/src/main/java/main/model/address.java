package main.model;

public class address 
{

	
	String city;
	String pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "address [city=" + city + ", pincode=" + pincode + "]";
	}
	
	

  
	
}
