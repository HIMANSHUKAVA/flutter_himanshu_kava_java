package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.patient;

public class patientdao {

	
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
	
	
	public static int addpatient(patient p) {
		
		int status=0;
		Connection con =  patientdao.getconnect();
		
		try
		{
			
			PreparedStatement ps = con.prepareStatement(
			        "INSERT INTO patient " +
			        "(patient_name, patient_email, patient_number, patient_gender, patient_age, patient_status) " +
			        "VALUES (?,?,?,?,?,?)"
			    );
		ps.setString(1, p.getPatient_name());	
	    ps.setString(2,p.getPatient_email());
	    ps.setString(3,p.getPatient_number());
	    ps.setString(4, p.getPatient_gender());
	    ps.setString(5, p.getPatient_age());
	    ps.setString(6, p.getPatient_status());
	    
	    status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	
		
	}
	
	
	public static List<patient>viewall()
	{
		Connection con = patientdao.getconnect();
		
		List<patient>s = new ArrayList();
		
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from patient");
			
			ResultSet set =  ps.executeQuery();
			
			while(set.next())
			{
				patient p = new patient();
				p.setId(set.getInt(1));
				p.setPatient_name(set.getString(2));
				p.setPatient_email(set.getString(3));
				p.setPatient_number(set.getString(4));
				p.setPatient_gender(set.getString(5));
				p.setPatient_age(set.getString(6));
				p.setPatient_status(set.getString(7));
				
				
				s.add(p);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return s;
	}
	
	public static int deletepatient(int id)
	{
		Connection con = patientdao.getconnect();
		int status =0;
		
		try
		{
			PreparedStatement ps = con.prepareStatement("delete from patient where id=?");
			ps.setInt(1, id);
			
			status =  ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
		
		
		
	}
	
	
	public static patient singledeta(int id) {
		
		Connection con =  patientdao.getconnect();
		patient p = new patient();
		
		
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from patient where id=?");
			ps.setInt(1, id);
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				p.setId(id);
				p.setPatient_name(set.getString(2));
				p.setPatient_email(set.getString(3));
				p.setPatient_number(set.getString(4));
				p.setPatient_gender(set.getString(5));
				p.setPatient_age(set.getString(6));
				p.setPatient_status(set.getString(7));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return p;
	}
	
	public static int update(patient p) {
		Connection con =  patientdao.getconnect();
		int status =0;
		
		try
		{
			

	        PreparedStatement ps = con.prepareStatement(
	            "UPDATE patient SET patient_name=?, patient_email=?, patient_number=?, patient_gender=?, patient_age=?, patient_status=? WHERE id=?"
	        );

	        ps.setString(1, p.getPatient_name());
	        ps.setString(2, p.getPatient_email());
	        ps.setString(3, p.getPatient_number());
	        ps.setString(4, p.getPatient_gender());
	        ps.setString(5, p.getPatient_age());
	        ps.setString(6, p.getPatient_status());
	        ps.setInt(7, p.getId());

	        status = ps.executeUpdate();

			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
		
	}
}
