<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Panel</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1e+4GYhfyx+" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>

<div class="container p-5 shadow bg-light w-75 mx-auto d-flex mt-5">
    <div class="row w-100">

        <div class="col-md-3">
            <img src="image/user_login.jpeg" alt="" class="img-fluid">
        </div>

        <div class="col-md-9">
            <h2>Login</h2>
            <!-- Use appropriate action in controller -->
            <form action="login" method="post">
                <div class="mb-3">
                    <label class="form-label">Email or Username</label>
                    <input type="text" name="email" class="form-control" placeholder="Enter email or username" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" name="password" class="form-control" placeholder="Enter password" required>
                </div>

                <input type="submit" value="Login" class="btn btn-primary">
                <input type="reset" value="Reset" class="btn btn-secondary">
            </form>
        </div>

    </div>
</div>

</body>
</html>
