package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Person;
import main.repo.repository;

@Service
public class serviceimpl implements serviceinterfase
{
	
	@Autowired
	repository repo;

	@Override
	public Person adddetta(Person p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public List<Person> viewalldeta() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Person singledeta(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public void deleadeta(int id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
	}

	@Override
	public Person updetdeta(int id, Person p) {
		// TODO Auto-generated method stub
		p.setId(id);
		return repo.save(p);
	}

	
	
}
