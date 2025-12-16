<%@page import="Dao.patientdao"%>
<%@page import="model.patient"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Medical Record</title>

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
  <div class="card-header bg-success text-white text-center">
    <h4>Add Medical Record</h4>
  </div>

  <div class="card-body">
    <form action="addMedicalRecord" method="post">

      <!-- Patient Dropdown -->
      <div class="mb-3">
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

      <!-- Diagnosis -->
      <div class="mb-3">
        <label class="form-label">Diagnosis</label>
        <textarea name="diagnosis" class="form-control"
                  rows="3" placeholder="Enter diagnosis" required></textarea>
      </div>

      <!-- Prescription -->
      <div class="mb-3">
        <label class="form-label">Prescription</label>
        <textarea name="prescription" class="form-control"
                  rows="3" placeholder="Enter prescription" required></textarea>
      </div>

      <!-- Visit Date -->
      <div class="mb-3">
        <label class="form-label">Visit Date</label>
        <input type="date" name="visitDate" class="form-control" required>
      </div>
      <button class="btn btn-success w-100">
        Save Medical Record
      </button>

    </form>
  </div>
</div>

</div>
</div>
</div>

</body>
</html>
