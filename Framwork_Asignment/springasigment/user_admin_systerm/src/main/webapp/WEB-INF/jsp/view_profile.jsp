<%@page import="main.bo.Bo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="main.model.person"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Profile</title>

</head>
<body>
<%

   ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
   Bo b =  ap.getBean("s2" , Bo.class);
   
   List<person>p1 =  b.viewall();
    

%>

 <table border="1">
 
 <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Password</th>
            <th>Email</th>
            <th>Gendar</th>
           
        </tr>
    </thead>
 
  <tbody>
  
  <%
  
     for(person p : p1)
  
     {
  %>


           <tr>
           
           <td><%= p.getId() %></td>
           <td><%= p.getFname() %></td>
           <td><%= p.getLname() %></td>
           <td><%= p.getPassword() %></td>
           <td><%= p.getEmail() %></td>
           <td><%= p.getGender() %></td>
           
           
           </tr>

 <%
 
     }
 
 %>
  

  </tbody>
 
 
 
 </table>
</body>
</html>
