package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.User;
import com.main.repository.repo;

@Service
public class userimpl implements userservice
{

	@Autowired
	repo rs;
	
	@Override
	public User insertdeta(User u) {
		// TODO Auto-generated method stub
		return rs.save(u);
	}

	@Override
	public List<User> viewall() {
		// TODO Auto-generated method stub
		return rs.findAll();
	}

	@Override
	public User userbyid(int id) {
		// TODO Auto-generated method stub
		return rs.findById(id).orElseThrow();
	}


	
}
