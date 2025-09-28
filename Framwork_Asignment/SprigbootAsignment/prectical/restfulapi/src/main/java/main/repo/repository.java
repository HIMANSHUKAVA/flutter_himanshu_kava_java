package main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.person;

public interface repository  extends JpaRepository<person, Integer>
{

}
