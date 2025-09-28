package com.dao;


import java.time.Period;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Reader;
import com.model.Subscriber;

public class Dao {

	
	
	public void insertdeta(Reader r)
	{
		Session sess =  new Util().getconnect();
		
		Transaction tr =  sess.beginTransaction();
		
		sess.save(r);
		
		tr.commit();
		sess.close();

	}
	
	
	public void deletedeta(int id) {
	    Session ss = new Util().getconnect();
	    Transaction tr = ss.beginTransaction();

         Reader r1  = ss.get(Reader.class, id);
        
         
         for(Subscriber sub :  r1.getS())
         {
        	 sub.getS1().remove(r1);
         }
         
         r1.getS().clear();
        ss.delete(r1);
	    tr.commit();
	    ss.close();
	}
	
	
	public List<Reader>viewlll()
	{
	
		 Session ss = new Util().getconnect();
		    Transaction tr = ss.beginTransaction();
		    
		    List<Reader>s1 = ss.createQuery("from Reader").list();
		    tr.commit();
		    ss.close();
		    
		    return s1;
		    
	}
	
	public Reader singledeta(Reader s)
	{
		 Session ss = new Util().getconnect();
		    Transaction tr = ss.beginTransaction();
		    
		    Reader r =  ss.get(Reader.class, s.getReaderid());
		    
		    tr.commit();
		    ss.close();
		    
		    return r;
	}

	
	public void updatedeta(Reader r)
	{
		Session ss = new Util().getconnect();
	    Transaction tr = ss.beginTransaction();
	    
	    ss.update(r);
	    
	}
}
