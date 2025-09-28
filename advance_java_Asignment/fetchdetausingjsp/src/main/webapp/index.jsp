<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Example</title>
</head>
<body>

<form action="fetchservlet" method="post">

    <input type="text" placeholder="Enter The Name" name="name" id="name" />
    <br/>

    <input type="text" placeholder="Enter The Lname" name="s" id="s" />
    <br/>

    <input type="email" placeholder="Enter The Email" name="email" id="email" />
    <br/>

    <input type="text" placeholder="Enter The Mobile" name="mobail" id="mobail" />
    <br/>

    <input type="password" placeholder="Enter The Password" name="password" id="password" />
    <br/>

    <input type="submit" value="Submit" />

</form>

</body>
</html>
