<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1e+4GYhfyx+" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>

<body>
    <div class="container mt-5 p-5 shadow bg-light w-75">
        <div class="row align-item-center">
            <div class="col-md-4">
                <img src="image/admin-login.jpeg" alt="" class="img-fluid rounded">
            </div>
            <div class="col-md-8">
                <h2> <span class="text-danger">Admin</span> Login</h2>
                <form action="adminLogin" method="post">
                    <div class="mb-3">
                        <label class="form-label">Email</label>
                        <input type="email" placeholder="Enter Your Email" name="email" id="email" required class="form-control">
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Password</label>
                        <input type="password" placeholder="Enter Your Password" name="password" id="password" required class="form-control">
                    </div>
                    <button type="submit" class="btn btn-outline-primary">Login</button>
                    <button type="reset" class="btn btn-outline-danger">Reset</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
