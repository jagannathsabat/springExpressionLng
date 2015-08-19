<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Book</title>
</head>
<body>

<h3> Contact Details :</h3><br><hr>

<h3> ${savedContact} </h3><hr>


<table border="1">
	<c:choose>
		<c:when test="${empty listofcontact}">Contact List is Empty</c:when>
		<c:otherwise>
			<tr>
				<th>ID</th>
				<th>name</th>
				<th>PhNumber</th>
			</tr>
			
			<c:forEach items="${listofcontact}" var="contact">
				<tr>
				<td>${contact.id}</td>
				<td>${contact.name}
				<td>${contact.phNumber}</td>
			</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>




<hr><p> <a href='<c:url value="/"/>'>Home</a> </p>

</body>
</html>