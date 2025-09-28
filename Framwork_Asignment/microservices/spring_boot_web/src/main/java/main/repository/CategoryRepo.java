package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.Category;

public interface CategoryRepo extends JpaRepository<Category , Integer>
{

}
