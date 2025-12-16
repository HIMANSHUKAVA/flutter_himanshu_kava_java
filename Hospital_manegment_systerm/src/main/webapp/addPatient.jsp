<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Patient</title>

<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
    body {
        background-color: #f4f6f9;
    }
    .card {
        border-radius: 15px;
    }
</style>

</head>
<body>

<!-- NAVBAR -->
<nav class="navbar navbar-dark bg-primary">
    <div class="container-fluid">
        <span class="navbar-brand">Hospital Management System</span>
        <a href="doctorDashboard.jsp" class="btn btn-light btn-sm"> Dashboard</a>
    </div>
</nav>

<!-- FORM -->
<div class="container mt-4">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow">
                <div class="card-header bg-success text-white text-center">
                    <h4>Add Patient</h4>
                </div>

                <div class="card-body">

                    <form action="addPatient" method="post">

                        <div class="mb-3">
                            <label class="form-label">Patient Name</label>
                            <input type="text" name="name"
                                   class="form-control"
                                   placeholder="Enter patient name" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input type="email" name="email"
                                   class="form-control"
                                   placeholder="Enter email" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Contact Number</label>
                            <input type="text" name="phone"
                                   class="form-control"
                                   placeholder="Enter contact number" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Gender</label>
                            <select name="gender" class="form-select" required>
                                <option value="">Select Gender</option>
                                <option>Male</option>
                                <option>Female</option>
                                <option>Other</option>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Age</label>
                            <input type="number" name="age"
                                   class="form-control"
                                   placeholder="Enter age" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Patient Status</label>
                            <select name="status" class="form-select" required>
                                <option value="">Select Status</option>
                                <option value="admitted">Admitted</option>
                                <option value="discharged">Discharged</option>
                                <option value="followup">Follow-up</option>
                            </select>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">
                                 Add Patient
                            </button>
                        </div>

                    </form>

                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
