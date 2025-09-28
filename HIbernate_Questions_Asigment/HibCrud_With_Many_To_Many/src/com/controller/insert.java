package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.dao.Dao;
import com.model.Reader;
import com.model.Subscriber;

public class insert {

	
	public static void main(String[] args) {
		
		
          Reader r1 = new Reader();
          Reader r2 = new Reader();
          
          Subscriber s1 = new Subscriber();
          Subscriber s2 = new Subscriber();
          
          
          r1.setFirstname("himanshu");
          r1.setLastname("kava");
          r1.setEmail("kava@gmail.com");
          
          
          r2.setFirstname("nishanr");
          r2.setLastname("parmar");
          r2.setEmail("nishant@gmail.com");
          
          
          s1.setSubscriptionname("netflix");
          s2.setSubscriptionname("jiohotstar");
          
          
          
          List<Reader>rs =  new ArrayList<>();
          List<Subscriber>sop = new ArrayList<>();
          
          
          rs.add(r1);
          rs.add(r2);
          
          
          sop.add(s1);
          sop.add(s2);
          
          
          r1.setS(sop);
          r2.setS(sop);
          
          s1.setS1(rs);
          s2.setS1(rs);
          
          
          new Dao().insertdeta(r1);
          new Dao().insertdeta(r2);
           
          
          
 
		
	}
}
