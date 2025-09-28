package main.controller;



import java.util.List;

import javax.mail.Multipart;
import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sun.mail.handlers.multipart_mixed;

import main.bo.Bo;
import main.model.Admin;
import main.model.person;

@Controller
public class GlobleController 
{

	
	@RequestMapping("/")
	public String handlermethod()
	{
		return "user_register";
	}
	
	

	@RequestMapping(value="/login_panel")
	public String loginpage()
	{
		return "login_panel";
	}
	
	
	@RequestMapping(value ="/register")
	public String sdetsa(HttpServletRequest req , HttpServletResponse resp , ModelMap map,@RequestParam("profile_pic") MultipartFile file)
	{
		
		person p = new person();
		p.setEmail(req.getParameter("email"));
		p.setFname(req.getParameter("fname"));
		p.setGender(req.getParameter("gender"));
		p.setPassword(req.getParameter("password"));
		p.setPhoto(file.getOriginalFilename());
		p.setLname(req.getParameter("lname"));
        p.setMobile(req.getParameter("mobile"));
		
		HttpSession session =  req.getSession();
		
		session.setAttribute("email", p.getEmail());
		session.setAttribute("password", p.getPassword());
				
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		
		Bo b = ap.getBean("s2" , Bo.class);
		
		b.insetdeta(p);
		
		return "login_panel";
	}
	

	@RequestMapping("/login")
	public String sdetga(HttpServletRequest req , HttpServletResponse resp)
	{
		HttpSession session = req.getSession();

		
		
		String email =  req.getParameter("email");
		String password =  req.getParameter("password");
		
		
		ApplicationContext ap =  new ClassPathXmlApplicationContext("beans.xml");
		Bo b = ap.getBean("s2" , Bo.class);
		
		
		person p =  b.logindeta(email, password);
		
		if(p!=null)
		{
		
			
			 session.setAttribute("user", p);
			 return "user_dashboard";
		}
		else
		{

	        return "login_panel"; 
	       
		}
		
		
	}

	@RequestMapping(value="/edit_profile")
	public String editpage()
	{
		return "edit_profile";
	}
	
	@RequestMapping(value="/change_password")
	public String changepass()
	{
		return "change_password";
	}
	
	@RequestMapping(value="/view_profile")
	public String viewpagepage()
	{
		return "view_profile";
	}
	
	@RequestMapping("/admin_login")
	public String adminlogin()
	{
		return "admin_login";
	}
	
	@RequestMapping("/changePassword")
	public String olddeta(HttpServletResponse resp , HttpServletRequest req)
	{
		
		String oldpass = req.getParameter("oldPassword");
		String newpass = req.getParameter("newPassword");
		String conpass = req.getParameter("confirmPassword");
		
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		Bo b = ap.getBean("s2",Bo.class);
		

		HttpSession session =  req.getSession();
        person p2 =  (person) session.getAttribute("user");
		String email =  p2.getEmail();
		
		
		
		person p = b.password(oldpass , email);
		
		if(p!=null && p.getPassword().equals(oldpass))
		{
			
		        if(newpass.equals(conpass))
		        {
		        	 b.passwordupdet(newpass, email);
		        	 
		        	 return "user_dashboard";
		        }
		        else
		        {
		        	return "change_password";
		        }
			
		}
		else
		{
			System.out.println("Try Again");
			return "change_password";
		}

	}
	
	
	@RequestMapping("/updateProfile")
	public String fetchsingledeta(HttpServletRequest req , HttpServletResponse resp , @RequestParam("profile_pic") MultipartFile file)
	{
		
		
		String fname =  req.getParameter("fname");
		String lname =  req.getParameter("lname");
		String email =  req.getParameter("email");
	    String photo =  file.getOriginalFilename();
	    int id = Integer.parseInt(req.getParameter("id"));
	    
	    ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
	    Bo b = ap.getBean("s2" , Bo.class);
	    
	    
	    
	    
	    person p = new person();
	    p.setId(id);
	    p.setEmail(email);
	    p.setFname(fname);
	    p.setLname(lname);
	    p.setPhoto(photo);
	   
	    
	    b.updetdeta(p);
		return "user_dashboard";
	}

	@RequestMapping("/log-out")
	public String logoutdeta(HttpServletRequest request , HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		
		session.removeAttribute("user");
		return "login-panel";
	}

	@RequestMapping("/adminLogin")
	public String login_checkdeta(HttpServletRequest request , HttpServletResponse response)
	{
		String email =  request.getParameter("email");
		String password = request.getParameter("password");
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Bo s1 =  applicationContext.getBean("s2" , Bo.class);
		
		Admin s2  = s1.login_check(email, password);
	   
		String email_admin =  s2.getEmail();
		String password_adminString = s2.getPassword();
		
		if(email.equals(email_admin) && password.equals(password_adminString))
		{
		    return "admin_dashboard";	
		    
		}
		else
		{
			return "admin_login";
		}
		
		
		
	
	}
	
	@RequestMapping("/delaet_admin")
	public String deleatdeta (HttpServletRequest request , HttpServletResponse response)
	{
		int id =  Integer.parseInt(request.getParameter("id"));
		
		ApplicationContext ap =  new ClassPathXmlApplicationContext("beans.xml");
		Bo bo =  ap.getBean("s2", Bo.class);
		
		bo.deleat_admindeta(id);
		
		
		return "admin_dashboard";
		
	}
		
	
	 
	
}
