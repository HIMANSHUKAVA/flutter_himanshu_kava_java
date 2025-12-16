package servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import Dao.appoinmentdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Appointment;
import model.doctor;

@WebServlet("/addAppointment")
public class addAppointment extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		    HttpSession session = req.getSession();
	        doctor d = (doctor) session.getAttribute("doctor");

	        int patientId = Integer.parseInt(req.getParameter("patientId"));
	        
	        String dateStr = req.getParameter("date");
	        String timeStr = req.getParameter("time");

	        
	        Date sqlDate = Date.valueOf(dateStr);
	        Time sqlTime = Time.valueOf(timeStr + ":00");


	        Appointment a = new Appointment();
	        a.setDoctorId(d.getId());
	        a.setPatientId(patientId);
	        a.setAppointmentDate(sqlDate);
	        a.setAppointmentTime(sqlTime);
	        a.setStatus("Pending");

	        
	        int status =  appoinmentdao.addapoinment(a);
	        

	       resp.sendRedirect("viewAppointments.jsp");
	        
		
	}
	
	
}
