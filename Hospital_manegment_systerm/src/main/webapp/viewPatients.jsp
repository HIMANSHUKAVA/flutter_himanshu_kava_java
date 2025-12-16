<%@page import="Dao.patientdao"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.patient" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Patients</title>

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
        <a href="doctorDashboard.jsp" class="btn btn-light btn-sm">⬅ Dashboard</a>
    </div>
</nav>

<div class="container mt-4">
<h3 class="mb-3">Patient List</h3>

<table class="table table-bordered table-hover text-center">
<thead class="table-dark">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Contact</th>
    <th>Gender</th>
    <th>Age</th>
    <th>Status</th>
    <th>Action</th>
</tr>
</thead>

<tbody>
<%
    List<patient> s = patientdao.viewall();

    if (s != null && !s.isEmpty()) {
        for (patient p : s) {
%>
<tr>
    <td><%= p.getId()%></td>
    <td><%= p.getPatient_name() %></td>
    <td><%= p.getPatient_email() %></td>
    <td><%= p.getPatient_number() %></td>
    <td><%= p.getPatient_gender() %></td>
    <td><%= p.getPatient_age() %></td>
    <td><%= p.getPatient_status() %></td>
    <td>
      

<a href="editPatient.jsp?id=<%= p.getId() %>"
   class="btn btn-sm btn-warning">
   Edit
</a>



    <form action="deletePatient" method="post" style="display:inline;">
    <input type="hidden" name="id" value="<%= p.getId() %>">
    <button type="submit"
            class="btn btn-sm btn-danger"
            onclick="return confirm('Are you sure?')">
        Delete
    </button>
</form>
      
    </td>
</tr>
<%
        }
    } else {
%>
<tr>
    <td colspan="8">No Patients Found</td>
</tr>
<%
    }
%>
</tbody>
</table>

</div>
</body>
</html>
