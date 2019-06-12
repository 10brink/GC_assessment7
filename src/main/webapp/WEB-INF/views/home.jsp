<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Parks Homepage</title>
</head>
<body>
Parks
<div>

<table border = "4">
 <thead>
 <tr>

<td>Name</td>
<td>City</td>


</tr>
</thead>
<tbody>
<c:forEach items = "${parks }" var = "item">
<tr>

<td><a href = "details?id=${item.id }">${item.name }</a></td>
<td> ${item.data.city }</td>


</tr>
</c:forEach>
</tbody>
</table>
</div>


</body>
</html>