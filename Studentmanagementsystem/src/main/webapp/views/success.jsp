<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">

<tr>
<th>studentId</th>
<th>studentFullName</th>
<th>studentEmail</th>
<th>studentAge</th>
<th>studentCollagename</th>
<th>feesPaid</th>
<th>studentCourse</th>
<th>batchmode</th>
<th>batchNumber</th>
</tr>

<c:forEach items="${data}" var="s">
<tr>
<td>${s.studentId }</td>
<td>${s.studentFullName }</td>
<td>${s.studentEmail }</td>
<td>${s.studentAge }</td>
<td>${s.studentCollagename }</td>
<td>${s.feesPaid }</td>
<td>${ s.studentCourse}</td>
<td>${s.batchmode }</td>
<td>${s.batchNumber}</td>

</tr>
</c:forEach>
</table>
</body>
</html>