package main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.Category;

public interface category_repo extends JpaRepository<Category, Integer>
{

	
}
