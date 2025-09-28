package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Student;

public class Dao {


	
	public void insertdeta(Student s)
	{
		Session s1 = new Util().getconnect();
		Transaction tr = s1.beginTransaction();
		
		s1.save(s);
		
		tr.commit();
		s1.close();
	}
	
	
	public void deleatdeta(Student s1)
	{
		Session s = new Util().getconnect();
		
		Transaction tr =  s.beginTransaction();
		
		s.delete(s1);
		tr.commit();
		s.close();
	}
	
	public void  updatedeta(Student s)
	{		Session s1 = new Util().getconnect();
	        Transaction tr = s1.beginTransaction();
		
	        s1.update(s);
	        
	        tr.commit();
	        s1.close();
        		
	}
	
	
	public List<Student>viewall()
	{
		Session s = new Util().getconnect();
		Transaction tr =  s.beginTransaction();
		
		List<Student>s1 =  s.createQuery("from Student").list();
		
		tr.commit();
		s.close();
		return s1;
	}
	
	public Student singledeta(Student s1)
	{
		Session s = new Util().getconnect();
		Transaction tr =  s.beginTransaction();
		
		Student s2 = (Student) s.get(Student.class, s1.getId());
		
		
		tr.commit();
		s.close();
		
		return s2;
		
	}
}
