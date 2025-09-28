<%@page import="main.model.person"%>
<%@page import="java.util.List"%>
<%@page import="main.bo.Bo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1e+4GYhfyx+" crossorigin="anonymous"></script>
</head>
<body>

<!-- Navbar -->
<div class="container-fluid bg-light">
    <nav class="navbar navbar-expand-md navbar-light">
        <a href="#" class="navbar-brand">
            <img src="image/compny_logo.png" alt="Logo" style="width: 60px;">
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarContent">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a href="#" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="#" class="nav-link">About</a></li>
                <li class="nav-item"><a href="#" class="nav-link">Add Product</a></li>

                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Account</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Change Password</a></li>
                        <li><a class="dropdown-item" href="#">Edit Profile</a></li>
                        <li><a class="dropdown-item" href="#">View Profile</a></li>
                        <li><a class="dropdown-item" href="#">Log-out</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</div>


<!-- User Table -->
<div class="container mt-5 shadow p-4">
    <h3 class="text-center mb-4">All Registered Users</h3>
    <%
         ApplicationContext ap  = new ClassPathXmlApplicationContext("beans.xml");
         Bo b = ap.getBean("s2" , Bo.class);
         
         List<person>viewall =  b.viewall();
    
    %>
    <table class="table table-bordered table-hover text-center">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <%
            
               for(person p1 : viewall)
               {
            
            %>
                   <tr>
           
           <td><%= p1.getId() %></td>
           <td><%= p1.getFname() %></td>
           <td><%= p1.getLname() %></td>
           <td><%= p1.getEmail() %></td>
           <td><%= p1.getGender() %></td>
           <td>
           
            <form action="delaet_admin" method="post">
             
            <input type="hidden" value="<%=p1.getId()%>" name="id">
            <input type="submit" value="Deleat" class="btn btn-outline-danger">
            </form>
           </td>
           
           </tr>
                  
            <%
            
               }
            %>
        </tbody>
    </table>
</div>

</body>
</html>
