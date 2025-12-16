<%@page import="Dao.appoinmentdao"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Appointment" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Appointments</title>

<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
    body {
        background-color: #f4f6f9;
    }
    .table {
        background-color: white;
    }
</style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-dark bg-primary">
    <div class="container-fluid">
        <span class="navbar-brand">Hospital Management System</span>
        <a href="doctorDashboard.jsp" class="btn btn-light btn-sm">⬅ Dashboard</a>
    </div>
</nav>

<div class="container mt-4">

    <h3 class="mb-3">Appointments</h3>

    <table class="table table-bordered table-hover text-center">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Patient ID</th>
                <th>Date</th>
                <th>Time</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
        </thead>

        <tbody>
        <%
            List<Appointment> list =
                appoinmentdao.viewall();

            if (list != null && !list.isEmpty()) {
                for (Appointment a : list) {
        %>
            <tr>
                <td><%= a.getAppointmentId() %></td>
                <td><%= a.getPatientId() %></td>
                <td><%= a.getAppointmentDate() %></td>
                <td><%= a.getAppointmentTime() %></td>
                <td>
                    <span class="badge bg-info">
                        <%= a.getStatus() %>
                    </span>
                </td>
                <td>
                    <!-- Update Status -->
                    <form action="updateAppointmentStatus" method="post"
                          style="display:inline;">
                        <input type="hidden" name="id"
                               value="<%= a.getAppointmentId() %>">
                        <select name="status"
                                class="form-select form-select-sm d-inline w-auto">
                            <option>Pending</option>
                            <option>Confirmed</option>
                            <option>Completed</option>
                            <option>Cancelled</option>
                        </select>
                        <button class="btn btn-sm btn-success">
                            Update
                        </button>
                    </form>
                </td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="6">No Appointments Found</td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>

</div>

</body>
</html>
