<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>affichage d'un client</title>
</head>
<body>
<jsp:useBean id="Client" class="modeles.clientBean" scope="session"></jsp:useBean>
<h2>Nom:
<jsp:getProperty name="Client" property="nom" />
</h2>
<h2>Prenom:
<jsp:getProperty name="Client" property="prenom" />
</h2>
<h2>Adresse:
<jsp:getProperty name="Client" property="adresse" />
</h2>
<h2>Téléphone:
<jsp:getProperty name="Client" property="telephone" />
</h2>
<h2>Email:
<jsp:getProperty name="Client" property="email" />
</h2>
</body>
</html>