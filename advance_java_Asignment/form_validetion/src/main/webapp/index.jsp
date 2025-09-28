<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Register Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>

<body>
    <div class="container p-5 mt-5 shadow w-75">
        <div class="row">
            <div class="col-md-6">
                <img src="image/user_login.jpeg" alt="User" class="img-fluid">
            </div>

            <div class="col-md-6">
                <h3 class="text-success">Register Form</h3>
                <form action="Register" method="post">

                    <label class="form-label">Firstname</label>
                    <input type="text" name="fname" class="form-control" placeholder="Enter the first name">
                    <p class="text-danger">${msg}</p>

                    <label class="form-label">Lastname</label>
                    <input type="text" name="lname" class="form-control" placeholder="Enter the last name">
                    <p class="text-danger">${msg}</p>

                    <label class="form-label">Mobile</label>
                    <input type="text" name="mobail" class="form-control" placeholder="Enter the mobile number" id="mobail">
                    <p class="text-danger">${mobail}</p>

                    <label class="form-label">Email</label>
                    <input type="text" name="email" class="form-control" placeholder="Enter the email">
                    <p class="text-danger">${email}</p>

                    <label class="form-label">Password</label>
                    <input type="text" name="Password" class="form-control" placeholder="Enter the password">
                    <p class="text-danger">${pass}</p>

                    <input type="submit" value="Register" class="btn btn-outline-primary mt-3">
                    <input type="reset" value="Reset" class="btn btn-outline-danger mt-3 ms-2">

                    <!-- Success message -->
                    <p class="text-success mt-3">${success}</p>
                </form>
            </div>
        </div>
    </div>
</body>

</html>

