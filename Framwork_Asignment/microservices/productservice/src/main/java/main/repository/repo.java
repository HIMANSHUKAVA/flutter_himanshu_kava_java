package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.product;

public interface repo extends JpaRepository<product, Integer>
{

	
}
