	<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container bg-light mt-5 p-5 w-75 shadow">
    <div class="row">
        <div class="col-md-6">
            <img src="image/user.png" alt="user image" style="width: 100%;" class="d-flex mx-auto">
        </div>
        <div class="col-md-6">
            <h2>Register Here</h2>
            <form action="register" method="post" enctype="multipart/form-data">
                <div class="mb-3">
                    <label class="form-label">First Name</label>
                    <input type="text" placeholder="Enter First Name" class="form-control" name="fname" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Last Name</label>
                    <input type="text" placeholder="Enter Last Name" class="form-control" name="lname" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" placeholder="Enter Email" class="form-control" name="email" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Mobile</label>
                    <input type="text" placeholder="Enter Mobile Number" class="form-control" name="mobile" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" placeholder="Enter Password" class="form-control" name="password" required>
                </div>

                <div class="mb-3">
                    <label class="form-label me-2">Gender:</label>
                    <input type="radio" name="gender" value="male" class="form-check-input"> Male
                    <input type="radio" name="gender" value="female" class="form-check-input ms-3"> Female
                </div>

                <div class="mb-3">
                    <label class="form-label">Profile Picture</label>
                    <input class="form-control" type="file" name="profile_pic">
                </div>

                <div class="mb-3">
                    <input type="submit" value="Register" class="btn btn-outline-primary">
                    <input type="reset" value="Reset" class="btn btn-outline-danger">
                </div>
                
                <a href="login_panel">Login Here</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
