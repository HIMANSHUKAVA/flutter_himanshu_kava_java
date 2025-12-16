package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.doctor;

public class dao {

	
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
	
	
	public static doctor login(String email , String password) {
		
		
		Connection con =  dao.getconnect();
		doctor d= null;
		
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from doctor where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				d = new doctor();
				d.setId(set.getInt(1));
				d.setName(set.getString(2));
				d.setEmail(email);
				d.setPassword(password);
				d.setSpeciality(set.getString(5));
			}
			else
			{
				System.out.println("Login Failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return d;
	}
	
}
