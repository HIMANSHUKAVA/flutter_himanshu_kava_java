
<%@page import="Dao.Billingdao"%>
<%@page import="model.Billing"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%-- <%@ page import="model.Billing" %><!--  -->
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Bills</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
  body { background-color: #f4f6f9; }
  .table { background-color: white; }
</style>
</head>

<body>

<nav class="navbar navbar-dark bg-primary">
  <div class="container-fluid">
    <span class="navbar-brand">Hospital Management System</span>
    <a href="doctorDashboard.jsp" class="btn btn-light btn-sm">Dashboard</a>
  </div>
</nav>

<div class="container mt-4">

<h3 class="mb-3">Billing Records</h3>

<table class="table table-bordered table-hover text-center">
  <thead class="table-dark">
    <tr>
      <th>Bill ID</th>
      <th>Patient ID</th>
      <th>Test Charges</th>
      <th>Consultation Fee</th>
      <th>Room Rent</th>
      <th>InsuranceDiscount</th>
     <th>Total Amount</th>
      <th>Bill Date</th>  
    </tr>
  </thead>

  <tbody>
  <%
    List<Billing> list =
        Billingdao.viewall();

    if (list != null && !list.isEmpty()) {
      for (Billing b : list) {
  %>
    <tr>
      <td><%= b.getBillId()%></td>
      <td><%= b.getPatientId() %></td>
      <td><%= b.getTestCharges()%></td>
      <td><%= b.getConsultationFee()%></td>
      <td><%= b.getRoomRent()%></td>
      <td><%= b.getInsuranceDiscount()%></td>
      <td><%= b.getTotalAmount()%></td>
      <td><%= b.getBillDate()%></td>
      
      
      
    </tr>
  <%
      }
    } else {
  %>
    <tr>
      <td colspan="4">No Bills Found</td>
    </tr>
  <%
    }
  %>
  </tbody>
</table>

</div>

</body>
</html>
