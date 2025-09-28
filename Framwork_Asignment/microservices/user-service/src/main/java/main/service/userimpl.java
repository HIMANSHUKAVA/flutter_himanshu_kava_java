package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.person;
import main.repository.repo;

@Service
public class userimpl  implements userservicein
{
	
	@Autowired
	repo r;
	

	@Override
	public person insertdeta(person p) {
		// TODO Auto-generated method stub
		return r.save(p);
	}

	@Override
	public person updatdeta(person p, int id) {
		// TODO Auto-generated method stub
		
		p.setId(id);
		return r.save(p);
	}

	@Override
	public List<person> viewalldeta() {
		// TODO Auto-generated method stub
		return r.findAll();
	}

	@Override
	public person singledeta(int id) {
		// TODO Auto-generated method stub
		return r.findById(id).orElseThrow();
	}

	@Override
	public void deleatdeta(int id)
	{
		// TODO Auto-generated method stub
		
		r.deleteById(id);
		
	}

}
