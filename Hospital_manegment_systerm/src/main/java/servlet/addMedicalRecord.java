package servlet;

import java.io.IOException;
import java.sql.Date;

import Dao.appoinmentdao;
import Dao.medicaldao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.MedicalRecord;
import model.doctor;

@WebServlet("/addMedicalRecord")
public class addMedicalRecord extends HttpServlet 
{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
    	 
    	 HttpSession session = req.getSession();
    	 doctor d = (doctor) session.getAttribute("doctor");
    	 
    	 String date = req.getParameter("visitDate");
    	 
    	 Date s = Date.valueOf(date);
    	 
    	 int patient_id = Integer.parseInt(req.getParameter("patientId"));
    	 
    	 MedicalRecord m = new MedicalRecord();
    	 m.setDoctor_id(d.getId());
    	 m.setPatient_id(patient_id);
    	 m.setDiagnosi(req.getParameter("diagnosis"));
    	 m.setPrescription(req.getParameter("prescription"));
    	 m.setVisit_date(s);
    	 
    	 int status = medicaldao.addmedicaldeta(m);
    	 
    	 if(status>0)
    	 {
    		 resp.sendRedirect("viewBill.jsp");
    	 }
    	 else
    	 {
    		 System.out.println("Failed");
    	 }
    	 
    }
}
