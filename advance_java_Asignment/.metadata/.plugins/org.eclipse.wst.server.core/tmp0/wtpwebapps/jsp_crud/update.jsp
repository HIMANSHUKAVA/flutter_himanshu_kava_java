<%@page import="main.dao.Dao"%>
<%@page import="main.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="m" class="main.Model"/>
<jsp:setProperty property="*" name="m"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

int a = Dao.updatedeta(m);

if(a>0)
{
	response.sendRedirect("index.jsp");
}
else
{
	System.out.println("error");
}

%>
</body>
</html>