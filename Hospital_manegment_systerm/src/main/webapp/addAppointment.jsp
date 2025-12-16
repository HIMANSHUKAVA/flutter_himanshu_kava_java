<%@page import="Dao.patientdao"%>
<%@page import="model.patient"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Appointment</title>

<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-dark bg-primary">
    <div class="container-fluid">
        <span class="navbar-brand">Hospital Management System</span>
        <a href="doctorDashboard.jsp" class="btn btn-light btn-sm">Dashboard</a>
    </div>
</nav>

<div class="container mt-4">
<div class="row justify-content-center">
<div class="col-md-6">

<div class="card shadow">
<div class="card-header bg-success text-center text-white">
    <h4>Add Appointment</h4>
</div>

<div class="card-body">

<form action="addAppointment" method="post">

    <!-- Patient -->
    <div class="mb-3">

      
      %>
        <label class="form-label">Select Patient</label>
        <select name="patientId" class="form-select" required>
            <option value="">-- Select Patient --</option>
            
            <%
            List<patient> s = patientdao.viewall();
            for (patient p : s) {
        %>
            <option value="<%= p.getId() %>">
                <%= p.getPatient_name() %>
            </option>
        <%
            }
        %>
            
        </select>
    </div>
    


    <!-- Appointment Date -->
    <div class="mb-3">
        <label class="form-label">Appointment Date</label>
        <input type="date" name="date" class="form-control" required>
    </div>

    <!-- Appointment Time -->
    <div class="mb-3">
        <label class="form-label">Appointment Time</label>
        <input type="time" name="time" class="form-control" required>
    </div>

    <!-- Status -->
    <div class="mb-3">
        <label class="form-label">Status</label>
        <select name="status" class="form-select">
            <option value="Pending">Pending</option>
            <option value="Confirmed">Confirmed</option>
        </select>
    </div>

    <button type="submit" class="btn btn-success w-100">
        Book Appointment
    </button>

</form>

</div>
</div>

</div>
</div>
</div>

</body>
</html>
