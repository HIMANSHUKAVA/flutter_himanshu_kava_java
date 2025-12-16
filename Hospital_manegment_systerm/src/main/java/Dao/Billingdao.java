package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Billing;

public class Billingdao {

	
	public static Connection getconnect()
	{
	
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	public static int addbiling(Billing b)
	{
		Connection con = Billingdao.getconnect();
		int status = 0;
		
		try
		{
			PreparedStatement ps =  con.prepareStatement("insert into billing (patient_id, consultation_fee, test_charges, room_rent, insurance_discount, total_amount, bill_date) values (?,?,?,?,?,?,?)");
			ps.setInt(1, b.getPatientId());
			ps.setInt(2, b.getConsultationFee());
			ps.setInt(3, b.getTestCharges());
			ps.setInt(4, b.getRoomRent());
			ps.setInt(5, b.getInsuranceDiscount());
			ps.setInt(6, b.getTotalAmount());
			ps.setDate(7, b.getBillDate());
			
			status =  ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static List<Billing>viewall()
	{
		Connection con =  Billingdao.getconnect();
		List<Billing>s = new ArrayList();
	
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from billing");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				Billing b= new Billing();
				
				b.setBillId(set.getInt(1));
				b.setPatientId(set.getInt(2));
				b.setConsultationFee(set.getInt(3));
				b.setTestCharges(set.getInt(4));
				b.setRoomRent(set.getInt(5));
				b.setInsuranceDiscount(set.getInt(6));
				b.setTotalAmount(set.getInt(7));
				b.setBillDate(set.getDate(8));
				
				s.add(b);
				
				
				
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return s;
	}
	

}
