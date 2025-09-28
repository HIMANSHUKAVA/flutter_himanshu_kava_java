<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String userEmail = (String) session.getAttribute("email");
    if (userEmail == null) {
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">My Messaging App</a>
        <div class="d-flex">
            <span class="navbar-text text-white me-3">
                Welcome, <%= userEmail %>
            </span>
            <a href="Logout.jsp" class="btn btn-outline-light">Logout</a>
        </div>
    </div>
</nav>

<div class="container mt-4">
    <div class="row g-4">

        <!-- Profile Section -->
        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">
                    <h5 class="card-title">Your Profile</h5>
                    <p>Edit your personal details</p>
                    <a href="profile.jsp" class="btn btn-primary">Edit Profile</a>
                </div>
            </div>
        </div>

        <!-- Send Message -->
        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">
                    <h5 class="card-title">Send Message</h5>
                    <p>Send a message to another user</p>
                    <a href="message.jsp" class="btn btn-success">Compose</a>
                </div>
            </div>
        </div>

        <!-- Inbox -->
        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">
                    <h5 class="card-title">Inbox</h5>
                    <p>View messages you received</p>
                    <a href="inbox.jsp" class="btn btn-warning">Open Inbox</a>
                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>
