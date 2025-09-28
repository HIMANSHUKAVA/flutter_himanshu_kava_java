package main;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servet1")
public class servet1  extends HttpServlet
{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{

		
	String name =  req.getParameter("name");
	
	Cookie ck =  new Cookie("name", name);
	resp.addCookie(ck);
	resp.sendRedirect("servlet2");
		
		
		
	}
	
	
}
