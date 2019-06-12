<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${Park.getName() } Details</title>
</head>
<body>
<h2><p>
${Park.getName() }</p></h2>

<p>
${Park.data.getAcreage() } Acres</p>
<p> Established: 
${Park.data.getYearEstablished() }</p>
</body>
</html>