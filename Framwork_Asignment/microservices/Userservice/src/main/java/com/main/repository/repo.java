package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.User;

public interface repo  extends JpaRepository<User, Integer>
{

}
