<%@page import="Dao.patientdao"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.patient" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Patient</title>

<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-dark bg-primary">
    <div class="container-fluid">
        <span class="navbar-brand">Hospital Management System</span>
        <a href="viewPatients" class="btn btn-light btn-sm">Back</a>
    </div>
</nav>

<div class="container mt-4">
<div class="row justify-content-center">
<div class="col-md-6">

<div class="card shadow">
<div class="card-header bg-warning text-center">
    <h4>Edit Patient</h4>
</div>

<div class="card-body">

<form action="updatePatient" method="post">

<%

int id =  Integer.parseInt(request.getParameter("id"));
     patient p = patientdao.singledeta(id);

%>

    <!-- Hidden ID -->
    <input type="hidden" name="id" value="<%= p.getId() %>">

    <div class="mb-3">
        <label>Patient Name</label>
        <input type="text" name="name" class="form-control"
               value="<%= p.getPatient_name() %>" required>
    </div>

    <div class="mb-3">
        <label>Email</label>
        <input type="email" name="email" class="form-control"
               value="<%= p.getPatient_email() %>" required>
    </div>

    <div class="mb-3">
        <label>Contact Number</label>
        <input type="text" name="phone" class="form-control"
               value="<%= p.getPatient_number() %>" required>
    </div>

    <div class="mb-3">
        <label>Gender</label>
        <select name="gender" class="form-select">
            <option value="Male" <%= "Male".equals(p.getPatient_gender())?"selected":"" %>>Male</option>
            <option value="Female" <%= "Female".equals(p.getPatient_gender())?"selected":"" %>>Female</option>
            <option value="Other" <%= "Other".equals(p.getPatient_gender())?"selected":"" %>>Other</option>
        </select>
    </div>

    <div class="mb-3">
        <label>Age</label>
        <input type="number" name="age" class="form-control"
               value="<%= p.getPatient_age() %>" required>
    </div>

    <div class="mb-3">
        <label>Status</label>
        <select name="status" class="form-select">
            <option value="admitted" <%= "admitted".equals(p.getPatient_status())?"selected":"" %>>Admitted</option>
            <option value="discharged" <%= "discharged".equals(p.getPatient_status())?"selected":"" %>>Discharged</option>
            <option value="followup" <%= "followup".equals(p.getPatient_status())?"selected":"" %>>Follow-up</option>
        </select>
    </div>

    <button type="submit" class="btn btn-warning w-100">
        Update Patient
    </button>

</form>

</div>
</div>

</div>
</div>
</div>

</body>
</html>
