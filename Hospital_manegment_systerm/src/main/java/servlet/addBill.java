package servlet;

import java.io.IOException;
import java.sql.Date;

import Dao.Billingdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Billing;

@WebServlet("/addBill")
public class addBill extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int id = Integer.parseInt(req.getParameter("patientId"));
		int consultfee = Integer.parseInt(req.getParameter("consultationFee"));
		int testcharge = Integer.parseInt(req.getParameter("testCharges"));
		int roomrent = Integer.parseInt(req.getParameter("roomRent"));
		int insurence = Integer.parseInt(req.getParameter("insuranceDiscount"));
		Date d = Date.valueOf(req.getParameter("billDate"));
		
//		consultationFee + testCharges + roomRent - insuranceDiscount;
		
		int total_bill = consultfee + testcharge + roomrent - insurence;
		
		Billing b = new Billing();
		b.setPatientId(id);
		b.setBillDate(d);
		b.setConsultationFee(consultfee);
		b.setInsuranceDiscount(insurence);
		b.setRoomRent(roomrent);
		b.setTestCharges(testcharge);
		b.setTotalAmount(total_bill);
		
		
		int status = Billingdao.addbiling(b);
		
		if(status > 0)
		{
			resp.sendRedirect("viewBills.jsp");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
	}
}
