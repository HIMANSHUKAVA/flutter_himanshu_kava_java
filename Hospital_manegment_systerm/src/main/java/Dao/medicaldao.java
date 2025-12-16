package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.MedicalRecord;

public class medicaldao {

	
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
	
	
	public static int addmedicaldeta(MedicalRecord m)
	{
		int status = 0;
		Connection con =  medicaldao.getconnect();
		
		try
		{
           PreparedStatement ps = con.prepareStatement("insert into medical_record (patient_id, doctor_id, diagnosis, prescription, visit_date) values(?,?,?,?,?)");
           ps.setInt(1,m.getPatient_id());
           ps.setInt(2, m.getDoctor_id());
           ps.setString(3, m.getDiagnosi());
           ps.setString(4, m.getPrescription());
           ps.setDate(5, m.getVisit_date());
           
           
           status = ps.executeUpdate();
		}
		catch(Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}
	
	
	public static List<MedicalRecord>viewall()
	{
		List<MedicalRecord>m = new ArrayList();
		Connection con =  medicaldao.getconnect();
		
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from medical_record");
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				MedicalRecord s = new MedicalRecord();
				s.setId(1);
				s.setPatient_id(set.getInt(2));
				s.setDoctor_id(set.getInt(3));
				s.setDiagnosi(set.getString(4));
				s.setPrescription(set.getString(5));
				s.setVisit_date(set.getDate(6));
				
				
				m.add(s);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return m;

	}
	
	
}
