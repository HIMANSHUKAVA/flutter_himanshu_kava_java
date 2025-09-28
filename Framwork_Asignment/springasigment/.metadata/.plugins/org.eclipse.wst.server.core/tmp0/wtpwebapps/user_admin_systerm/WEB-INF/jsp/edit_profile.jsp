<%@page import="main.model.person"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 shadow p-5 bg-light w-75">
    <h3 class="mb-4 text-center">Edit Your Profile</h3>

     <%
     
     person  p = (person)session.getAttribute("user");
     
     %>

    <form action="updateProfile" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value="<%=p.getId()%>">


        <div class="mb-3">
            <label>Fname</label>
            <input type="text" class="form-control" name="fname" value="<%= p.getFname()%>" required>
        </div>

        <div class="mb-3">
            <label>Lname</label>
            <input type="text" class="form-control" name="lname" value="<%= p.getLname()%>" required>
        </div>

        <div class="mb-3">
            <label>Email</label>
            <input type="email" class="form-control" name="email" value="<%= p.getEmail() %>" required>
        </div>

        <div class="mb-3">
            <label>Update Profile Picture</label>
            <input type="file" class="form-control" name="profile_pic">
        </div>

        <button type="submit" class="btn btn-success">Update</button>
        <a href="userDashboard" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
