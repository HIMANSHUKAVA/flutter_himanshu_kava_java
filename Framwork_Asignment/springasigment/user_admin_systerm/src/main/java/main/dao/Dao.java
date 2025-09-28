package main.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import main.model.Admin;
import main.model.person;

public class Dao  extends HibernateDaoSupport
{

	
  public void insetdeta(person p)
  {
	  this.getHibernateTemplate().save(p);
  }
  
  public void deleatdeta(person p)
  {
	  this.getHibernateTemplate().delete(p);
  }
  
  public void updetdeta(person p)
  {
	  this.getHibernateTemplate().update(p);
  }
  
  public List<person>viewall()
  {
	 List<person>s =  (List<person>) this.getHibernateTemplate().find("from person");
	
	 
	 return s;
  }
  
  
  
  public person singledeta(person p)
  {
	person p1 =   this.getHibernateTemplate().get(person.class, p.getId());
	return p1;
  }
  
  
  public person logindeta(String email ,String password)
  {
	  
	  
	  List<person>single = (List<person>) this.getHibernateTemplate().find("from person where email=? and password=?" ,email , password);	 
	  
	  
	  
	  return single.isEmpty() ? null :single.get(0);
  }
  
 
  public person password(String password , String email)
  {
	  
	  List<person>sdeta = (List<person>) this.getHibernateTemplate().find("from person where password=? and email=?",password , email);
	  
	  
	  return sdeta.isEmpty() ? null : sdeta.get(0);
  }
  public Admin login_check(String email , String password)
  {
	  List<Admin>passwodsAdmins = (List<Admin>) this.getHibernateTemplate().find("from Admin where email = ?  and password =?", email , password);
	  
	  return passwodsAdmins.isEmpty() ? null : passwodsAdmins.get(0);
  }
 
  public void passwordupdet(String password , String email)
  {
	  
	  this.getHibernateTemplate().bulkUpdate("update person set password = ? where email = ?",password ,email);
	  
	  
  }
  public void deleat_admindeta(int id)
  {
	
	  String sql = "delete from person where id=?";
	  
	  
	  this.getHibernateTemplate().bulkUpdate(sql , id);
	  
  }
  

	
	
}
