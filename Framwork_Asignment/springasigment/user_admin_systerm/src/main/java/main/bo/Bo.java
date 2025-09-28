package main.bo;

import java.util.List;

import main.dao.Dao;
import main.model.Admin;
import main.model.person;

public class Bo 
{

	Dao dao;
	
	 public void insetdeta(person p)
	 {

		 dao.insetdeta(p);
	 }
	 
	 public void deleatdeta(person p)
	 {
		 dao.deleatdeta(p);
	 }
	
	 public void updetdeta(person p)
	 {
		 dao.updetdeta(p);
	 }

	 public List<person>viewall()
	 {
		 return dao.viewall();
	 }
	 
	 public person singledeta(person p)
	 {
		 return dao.singledeta(p);
	 }

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	 
	public person logindeta(String email ,String password)
	{
		return dao.logindeta(email, password);
	}
	
	public person password(String password , String email)
	  {
		  
		  return dao.password(password , email);
	  }
	  
	  public void passwordupdet(String password , String email)
	  {
		   dao.passwordupdet(password, email);
	  }
	  
	  public Admin login_check(String email , String password)
	  {
		  return dao.login_check(email, password);
	  }
	  
	public void  deleat_admindeta(int id)
	{
dao.deleat_admindeta(id);
	}
}
