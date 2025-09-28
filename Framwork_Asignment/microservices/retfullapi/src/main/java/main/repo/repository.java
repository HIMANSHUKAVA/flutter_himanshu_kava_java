package main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Person;

@Repository
public interface repository  extends JpaRepository<Person, Integer>
{

	
}
