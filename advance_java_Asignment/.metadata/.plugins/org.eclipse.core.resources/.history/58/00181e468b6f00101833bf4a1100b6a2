package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NamingServlet extends HttpServlet
{

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{

	 ServletConfig config =  getServletConfig();
	 
	 System.out.println(config.getInitParameter("Myname"));
	
	 
	 resp.setContentType("text/html");
	 PrintWriter out =  resp.getWriter();
	 
	 out.println(config.getInitParameter("Myname"));
}




}
