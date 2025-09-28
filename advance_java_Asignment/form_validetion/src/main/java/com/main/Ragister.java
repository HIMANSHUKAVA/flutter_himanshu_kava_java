package com.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Ragister extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String fname =  req.getParameter("fname");
		String lname =  req.getParameter("lname");
		String email =  req.getParameter("email");
		String mobail =  req.getParameter("mobail");
		String password =req.getParameter("Password");
		
		String alphabea = "^[A-Za-z]+$";
		String number =  "^[0-9]{10}+$";
		String emailvalidate = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String passwordvalidate = "^(?=.*[a-z])(?=.*[A-Z])(?=. *\\d)(?=.*[@#$%_&]).{6,}$";
        
        boolean sdeta = true;
        
        if(!fname.matches(alphabea))
        {
        	req.setAttribute("msg" , "please enter alphabeat only");
        	sdeta = false;
        }

       if(!lname.matches(alphabea))
        {
        	req.setAttribute("msg" , "please enter alphabeat only");
        	sdeta = false;
        }
       if(!mobail.matches(number))
        {
        	req.setAttribute("mobail", "number must be 10 digit");
        	sdeta = false;
        }
        
        if(!email.matches(emailvalidate))
        {
        	req.setAttribute("mail", "please Enter the valid email formate");
        	sdeta=false;
        }
        
        if(!password.matches(passwordvalidate))
        {
             req.setAttribute("pass","please Enter the valid password");
             sdeta = false;
        }
        
       if(sdeta)
       {
    	   req.setAttribute("success", "form submited");
       }
        
        
       req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
