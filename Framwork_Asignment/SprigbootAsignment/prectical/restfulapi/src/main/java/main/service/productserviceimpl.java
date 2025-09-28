package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.person;
import main.repo.repository;

@Service
public class productserviceimpl implements personservice
{

	@Autowired
	repository rs;
	
	@Override
	public person insertdeta(person p) {
		// TODO Auto-generated method stub
		return rs.save(p);
	}

	@Override
	public List<person> viewall() {
		// TODO Auto-generated method stub
		return rs.findAll();
	}

	@Override
	public void deleatbyid(int id) {
		// TODO Auto-generated method stub

		
		 rs.deleteById(id);
	}

	@Override
	public person userbyid(int id) {
		// TODO Auto-generated method stub
		return rs.findById(id).orElseThrow();
	}

	@Override
	public person updatedeta(int id, person p) {
		// TODO Auto-generated method stub
		p.setId(id);
		return rs.save(p);
	}

}
