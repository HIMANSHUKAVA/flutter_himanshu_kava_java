<%@page import="main.model.person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1e+4GYhfyx+" crossorigin="anonymous"></script>

        
</head>
<body>

<!-- Navigation bar -->
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
                <li class="nav-item"><a class="nav-link" href="change_password">Change Password</a></li>
                <li class="nav-item"><a class="nav-link" href="edit_profile">Edit Profile</a></li>
                <li class="nav-item"><a class="nav-link"href="view_profile">View Profile</a></li>
                
                   <li class="nav-item"><a class="nav-link" href="log-out">Log-out</a></li>
                   <li class="nav-item"><a class="nav-link" href="admin_login">Admin</a></li>
                   

                 
            </ul>
        </div>
    </nav>
</div>


</body>
</html>
