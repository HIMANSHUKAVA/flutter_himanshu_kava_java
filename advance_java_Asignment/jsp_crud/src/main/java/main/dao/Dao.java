package main.dao;

import java.sql.DriverManager;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.log.UserDataHelper.Mode;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import main.Model;

public class Dao {

	
	
	public static Connection getConnec()
	{
		Connection con = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cod", "root", "");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static  int savedeta(Model m)
	{
		int status=0;
		
		Connection con =  Dao.getConnec();
		
		try
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into person(name , email , address , mobail) value(?,?,?,?)");
			ps.setString(1, m.getName());
			ps.setString(2, m.getEmail());
			ps.setString(3, m.getAddress());
			ps.setString(4, m.getPhone());
			
			status = ps.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static List<Model>viewall()
	{
		
		Connection con = Dao.getConnec();
		
		List<Model>s =  new ArrayList<>();
		
		try
		{
			PreparedStatement ps =  (PreparedStatement) con.prepareStatement("select * from person");
			ResultSet rs =  (ResultSet) ps.executeQuery();
			
			
			Model m = new Model();
			while(rs.next())
			{
				
			    m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setEmail(rs.getString("email"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("mobail"));
				
				s.add(m);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return  s;
	}
	
	
	public static int deleaatdeta(int id)
	{
		Connection con =  Dao.getConnec();
		
		int status=0;
		
		try
		{
			PreparedStatement ps =  (PreparedStatement) con.prepareStatement("delete from person where id = ?");
			ps.setInt(1,id);
			
			
			status =  ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static Model singledeta(int id)
	{
		
		Connection con =  Dao.getConnec();
		Model m = null;
		
		try
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from person where id =?");
			ps.setInt(1, id);
			
			ResultSet rs =  (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
			
				m= new Model();
				m.setName(rs.getString("name"));
				m.setEmail(rs.getString("email"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("mobail"));
				m.setId(rs.getInt("id"));
				
			
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return m;
	}
	
	
	public static  int updatedeta(Model m)
	{
		int status=0;
		
		Connection con =  Dao.getConnec();
		
		try
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("update person set name=?,email=?,address=?,mobail=? where id=?");
			ps.setString(1, m.getName());
			ps.setString(2, m.getEmail());
			ps.setString(3, m.getAddress());
			ps.setString(4, m.getPhone());
			ps.setInt(5, m.getId());
			status = ps.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

}
