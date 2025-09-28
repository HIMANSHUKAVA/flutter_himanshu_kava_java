package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import main.model.rating;
import main.repository.repo;

@Service
public class ratingimpl implements ratingservice
{

	@Autowired  repo rs;
	
	@Override
	public rating insertdeta(rating r) {
		// TODO Auto-generated method stub
		return rs.save(r) ;
	}

	@Override
	public List<rating> viewdeta() {
		// TODO Auto-generated method stub
		return rs.findAll();
	}

	@Override
	public rating singledeta(int id) {
		// TODO Auto-generated method stub
		return rs.findById(id).orElseThrow();
	}
	@Override
	public List<rating> userByid(int userid) {
		// TODO Auto-generated method stub
		return rs.findByUserid(userid);
	}

	@Override
	public List<rating> HotelByid(int hotelid)
	{
		// TODO Auto-generated method stub
		return rs.findByHotelid(hotelid);
	}


	
}
