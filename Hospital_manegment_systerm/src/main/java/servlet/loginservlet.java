package servlet;

import java.io.IOException;

import Dao.dao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.doctor;

@WebServlet("/loginservlet")
public class loginservlet  extends HttpServlet
{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String email =  req.getParameter("email");
		String password = req.getParameter("password");
		
		doctor d =  dao.login(email, password);
		
		if(d!=null)
		{
			HttpSession session =  req.getSession();
			 session.setAttribute("doctor", d);
			 
			 resp.sendRedirect(req.getContextPath() + "/doctorDashboard.jsp");
		}
		else
		{
			req.setAttribute("msg", "Invalid Email or Password");
            req.getRequestDispatcher("index.jsp")
                   .forward(req, resp);	
		}
		
		
	}
}
