package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Cart;

public class Dao {

	
	public void insertdeta(Cart s)
	{
		Session s1 = new Util().getconnect();
		Transaction tr = s1.beginTransaction();
		
		s1.save(s);
		
		tr.commit();
		s1.close();
	}
	
	
	public void deleatdeta(int id)
	{
		Session s = new Util().getconnect();
		
		Transaction tr =  s.beginTransaction();
		
		Cart c = s.get(Cart.class, id);
		
		
		s.delete(c);
		
		tr.commit();
		s.close();
		
	}
	
	public void  updatedeta(Cart s)
	{		Session s1 = new Util().getconnect();
	        Transaction tr = s1.beginTransaction();
		
	        s1.update(s);
	        
	        tr.commit();
	        s1.close();
        		
	}
	
	
	public List<Cart>viewall()
	{
		Session s = new Util().getconnect();
		Transaction tr =  s.beginTransaction();
		
		List<Cart>s1 =  s.createQuery("from Cart").list();
		
		tr.commit();
		s.close();
		return s1;
	}
	
	public Cart singledeta(Cart s1)
	{
		Session s = new Util().getconnect();
		Transaction tr =  s.beginTransaction();
		
	  Cart s2 = (Cart) s.get(Cart.class, s1.getCartid());
		
		
		tr.commit();
		s.close();
		
		return s2;
		
	}
}
