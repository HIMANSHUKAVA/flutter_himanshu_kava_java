package servlet;

import java.io.IOException;

import Dao.appoinmentdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateAppointmentStatus")
public class updateAppointmentStatus  extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	int id =  Integer.parseInt(req.getParameter("id"));
    	String status1 = req.getParameter("status");
    	
    	int status =  appoinmentdao.updatedeta(id , status1);
    	
    	if(status > 0)
    	{
    		resp.sendRedirect("viewAppointments.jsp");
    	}
    	else
    	{
    		System.out.println("Failed");
    	}
    }
}
