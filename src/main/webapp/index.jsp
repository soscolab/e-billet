<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<HTML>
    <HEAD>
        <TITLE>Afficher le nom de bouton cliqué</TITLE>
    </HEAD>
 
    <BODY>
        <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>liste des evenements </title>
</head>
<body>
<table>
<tr>
<th>iDE</th><th>FirstName</th>
<th>LastName</th><th>Role</th>
</tr>
<c:forEach items="${evenement}" var="e">
<tr>
<td>${e.id}</td>
<td>${e.type}</td>
<td>${e.date}</td>
<td>${e.localisation}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
</BODY>
</HTML>