package main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.rating;

public interface repo  extends JpaRepository<rating, Integer>
{
	List<rating> findByUserid(int userid);

	List<rating>findByHotelid(int hotelid);
}
