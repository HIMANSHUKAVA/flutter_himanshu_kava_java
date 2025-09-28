package com.main.model;

public class Rating {

	private int id;
	private int hotelid;
	private int userid;
	private String feedback;
	private String ratings;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	
	
	
}
