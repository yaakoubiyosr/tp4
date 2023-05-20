<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
Bienvenue à votre session 
</h1>
<%
String prenom = request.getParameter("prenom");
String nom= request.getParameter("nom");
%>
<h5>
Prenom : <%= prenom %>
</h5>
<h5>
Nom : <%= nom %>
</h5>


</body>
</html>