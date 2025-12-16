package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Appointment;

public class appoinmentdao {

	
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
	
	
	public static int addapoinment(Appointment a)
	{
		int status=0;
		
		Connection con =  appoinmentdao.getconnect();
		
		try
		{
			PreparedStatement ps =
	                con.prepareStatement(
	                    "INSERT INTO appointment (patient_id, doctor_id, appointment_date, appointment_time, status) VALUES (?,?,?,?,?)"
	                );
			
			 ps.setInt(1, a.getPatientId());
	            ps.setInt(2, a.getDoctorId());
	            ps.setDate(3, a.getAppointmentDate());
	            ps.setTime(4, a.getAppointmentTime());
	            ps.setString(5, a.getStatus());

	            status = ps.executeUpdate();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static List<Appointment>viewall()
	{
		Connection con =  appoinmentdao.getconnect();
		List<Appointment>s = new ArrayList();
		
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from appointment");
			ResultSet set = ps.executeQuery();
			
			while(set.next()) {
				Appointment a = new Appointment();
				
				a.setAppointmentId(set.getInt("appointment_id"));
			    a.setPatientId(set.getInt("patient_id"));
			    a.setDoctorId(set.getInt("doctor_id"));
			    a.setAppointmentDate(set.getDate("appointment_date"));
			    a.setAppointmentTime(set.getTime("appointment_time"));
			    a.setStatus(set.getString("status"));

			    s.add(a);
			
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return s;
	}
	
	
	public static int updatedeta(int id , String status1)
	{
		Connection con =  appoinmentdao.getconnect();
		int status =  0;
		
		
		try
		{
			PreparedStatement ps = con.prepareStatement(
		            "UPDATE appointment SET status=? WHERE appointment_id=?"
		        );
			ps.setString(1, status1);
			ps.setInt(2, id);
			
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
          e.printStackTrace();			
		}
		
		return status;
	
	}
	
	
	
}
