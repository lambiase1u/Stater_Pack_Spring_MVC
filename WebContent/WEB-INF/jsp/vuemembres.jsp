<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Affichage</title>
</head>
On retrouve
<body>
	le
	<h2>Groupe</h2>
	<table border="1">
		<tr>
			<th colspan="3" align="center">Membres du groupe</th>
		</tr>
		<tr>
			<c:forEach var="personne" items="${groupe.membres}">
				<td>${personne}</td>
			</c:forEach>
		</tr>
	</table>
	<a href="<c:url value="/ajouter.html"/>">Ajout</a>
</body>
</html>