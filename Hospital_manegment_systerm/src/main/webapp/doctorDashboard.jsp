<%@ page import="model.doctor" %>
<%
doctor d = (doctor) session.getAttribute("doctor");
if (d == null) {
    response.sendRedirect("index.jsp");
    return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Dashboard</title>

<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
    body {
        background-color: #f4f6f9;
    }
    .card {
        border-radius: 15px;
        transition: 0.3s;
    }
    .card:hover {
        transform: scale(1.03);
    }
</style>

</head>
<body>

<!-- NAVBAR -->
<nav class="navbar navbar-dark bg-primary">
    <div class="container-fluid">
        <span class="navbar-brand">
            Hospital Management System
        </span>
        <span class="text-white">
            Welcome Dr. <b><%= d.getName() %></b>
        </span>
    </div>
</nav>

<!-- CONTENT -->
<div class="container mt-4">

    <h3 class="mb-4">Doctor Dashboard</h3>

    <div class="row g-4">

        <!-- Patients -->
        <div class="col-md-4">
            <div class="card shadow text-center p-4">
                <h5>Patient</h5>
                <p>Manage patient records</p>
                <a href="addPatient.jsp" class="btn btn-primary btn-sm">Add Patient</a><br><br>
                <a href="viewPatients.jsp" class="btn btn-outline-primary btn-sm"  style="margin-top: 5px">View Patients</a>
            </div>
        </div>

        <!-- Appointments -->
        <div class="col-md-4">
            <div class="card shadow text-center p-4">
                <h5>Appointments</h5>
                <p>Check appointments</p>
                 <a href="addAppointment.jsp" class="btn btn-success btn-sm">Add Appointments</a>
                <a href="viewAppointments.jsp" class="btn btn-success btn-sm"  style="margin-top: 5px">View Appointments</a>
            </div>
        </div>

        <!-- Medical Records -->
        <div class="col-md-4">
            <div class="card shadow text-center p-4">
                <h5>Medical Records</h5>
                <p>Diagnosis & prescriptions</p>
                <a href="addMedicalRecord.jsp" class="btn btn-warning btn-sm"> Add Medical Records</a>
                
                <a href="viewMedicalRecords.jsp" class="btn btn-warning btn-sm"  style="margin-top: 5px">Manage Medical Records</a>
                
            </div>
        </div>

        <!-- Billing -->
        <div class="col-md-4">
            <div class="card shadow text-center p-4">
                <h5>Billing</h5>
                <p>Generate & view bills</p>
                <a href="addBill.jsp" class="btn btn-danger btn-sm">Add Billing</a>
                <a href="viewBills.jsp" class="btn btn-danger btn-sm" style="margin-top: 5px">Manage Billing</a>
                
            </div>
        </div>

        <!-- Logout -->
        <div class="col-md-4">
            <div class="card shadow text-center p-4">
                <h5>Logout</h5>
                <p>End session</p>
                <a href="logout.jsp" class="btn btn-dark btn-sm">Logout</a>
            </div>
        </div>

    </div>

</div>

</body>
</html>
