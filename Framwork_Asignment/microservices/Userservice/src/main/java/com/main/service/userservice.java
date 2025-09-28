package com.main.service;

import java.util.List;

import com.main.model.User;

public interface userservice
{

	
	User insertdeta(User u);
	List<User>viewall();
	User userbyid(int id);
	
}
