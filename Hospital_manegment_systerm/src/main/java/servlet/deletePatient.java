package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import Dao.patientdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deletePatient")
public class deletePatient  extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out =  resp.getWriter();
		
		int id =  Integer.parseInt(req.getParameter("id"));
		
		
		int status =  patientdao.deletepatient(id);
		
		if(status>0)
		{
			resp.sendRedirect("viewPatients.jsp");
		}
		else
		{
			out.print("failed");
		}
	}
	
	
}
