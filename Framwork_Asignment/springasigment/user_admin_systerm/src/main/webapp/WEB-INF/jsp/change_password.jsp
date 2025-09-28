<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Change Password</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 shadow p-5 bg-light w-50">
    <h3 class="text-center mb-4">Change Password</h3>

    <form action="changePassword" method="post">
        <div class="mb-3">
            <label>Old Password</label>
            <input type="password" name="oldPassword" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>New Password</label>
            <input type="password" name="newPassword" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Confirm New Password</label>
            <input type="password" name="confirmPassword" class="form-control" required>
        </div>

        <button type="submit" class="btn btn-primary">Change Password</button>
        <a href="userDashboard" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
