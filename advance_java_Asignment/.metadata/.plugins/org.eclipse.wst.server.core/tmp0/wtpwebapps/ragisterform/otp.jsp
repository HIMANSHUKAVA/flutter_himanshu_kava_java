<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>OTP Verification</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow-lg">
                    <div class="card-header bg-info text-white text-center">
                        <h3>Enter OTP</h3>
                        <p>Please enter the 4-digit OTP sent to your email</p>
                    </div>
                    <div class="card-body">
                        <form action="verifyotp" method="post">
                            <div class="mb-3">
                                <label for="otp" class="form-label">OTP</label>
                                <input type="text"
                                       class="form-control text-center"
                                       id="otp"
                                       name="otp"
                                      
                                       maxlength="4"
                                       required
                                       placeholder="Enter 4-digit OTP">
                                <div class="form-text text-muted">OTP must be exactly 4 digits</div>
                            </div>
                            <button type="submit" class="btn btn-primary w-100">Verify OTP</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>

