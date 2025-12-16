package servlet;

import java.io.IOException;

import Dao.patientdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.patient;

@WebServlet("/addPatient")
public class addPatient extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		patient p =new patient();
		
		p.setPatient_name(req.getParameter("name"));
		p.setPatient_email(req.getParameter("email"));
		p.setPatient_number(req.getParameter("phone"));
		p.setPatient_gender(req.getParameter("gender"));
		p.setPatient_age(req.getParameter("age"));
		p.setPatient_status(req.getParameter("status"));
		
		
		int status =  patientdao.addpatient(p);
		
		if(status>0)
		{
			 resp.sendRedirect("viewPatients.jsp");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}
}
