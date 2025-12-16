<%@page import="Dao.Billingdao"%>
<%@page import="model.Billing"%>
<%@page import="Dao.medicaldao"%>
<%@page import="model.MedicalRecord"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Medical Records</title>

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

<h3 class="mb-3">Medical Records</h3>

<table class="table table-bordered table-hover text-center">
  <thead class="table-dark">
    <tr>
      <th>ID</th>

    </tr>
  </thead>

  <tbody>
  <%
    List<Billing> list =
              Billingdao.viewall();
    if (list != null && !list.isEmpty()) {
      for (Billing r : list) {
  %>
    <tr>
      <td><%= r.getBillId() %></td>
      <td><%= r.getPatientId()%></td>
      <td><%= r.getConsultationFee()%></td>
      <td><%= r.getTestCharges()%></td>
      <td><%= r.getRoomRent()%></td>
      <td><%= r.getInsuranceDiscount()%></td>
      <td><%= r.getTotalAmount()%></td>
      <td><%= r.getBillDate()%></td>
      

    </tr>
  <%
      }
    } else {
  %>
    <tr>
      <td colspan="5">No Medical Records Found</td>
    </tr>
  <%
    }
  %>
  </tbody>
</table>

</div>

</body>
</html>
