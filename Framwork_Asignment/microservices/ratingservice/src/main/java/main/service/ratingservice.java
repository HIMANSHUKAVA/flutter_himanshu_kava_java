package main.service;

import java.util.List;

import main.model.rating;

public interface ratingservice
{

	
	rating insertdeta(rating r);
	List<rating> viewdeta();
	rating singledeta(int id);
    List<rating>userByid(int userid);
    List<rating>HotelByid(int hotelid);
	
	
}
