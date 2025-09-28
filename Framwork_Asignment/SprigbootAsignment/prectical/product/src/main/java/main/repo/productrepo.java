package main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.product;

public interface productrepo  extends JpaRepository<product, Integer>
{

}
