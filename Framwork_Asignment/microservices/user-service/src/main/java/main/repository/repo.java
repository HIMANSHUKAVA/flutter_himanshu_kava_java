package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.person;

public interface repo extends JpaRepository<person, Integer>
{

}
