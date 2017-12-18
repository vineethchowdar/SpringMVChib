<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">Product Records</h2>
		
		<div align="center">
		<table border="2">
		
			<tr>
				<th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductDescription</th>				
			</tr>
			
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.description}</td>
				</tr>
			</c:forEach>
			
		</table>
		
		</div>

</body>
</html>