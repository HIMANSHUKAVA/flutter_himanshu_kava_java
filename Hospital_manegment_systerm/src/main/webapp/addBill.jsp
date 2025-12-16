<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.patient" %>
<%@ page import="Dao.patientdao" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Bill</title>

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
    <h4>Generate Bill</h4>
  </div>

  <div class="card-body">
    <form action="addBill" method="post">

      <!-- Patient -->
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

      <div class="mb-3">
        <label>Consultation Fee</label>
        <input type="number" name="consultationFee"
               class="form-control" required>
      </div>

      <div class="mb-3">
        <label>Test Charges</label>
        <input type="number" name="testCharges"
               class="form-control" required>
      </div>

      <div class="mb-3">
        <label>Room Rent</label>
        <input type="number" name="roomRent"
               class="form-control" required>
      </div>

      <div class="mb-3">
        <label>Insurance Discount</label>
        <input type="number" name="insuranceDiscount"
               class="form-control" value="0">
      </div>

      <div class="mb-3">
        <label>Bill Date</label>
        <input type="date" name="billDate"
               class="form-control" required>
      </div>

      <button class="btn btn-success w-100">
        Generate Bill
      </button>

    </form>
  </div>
</div>

</div>
</div>
</div>

</body>
</html>
