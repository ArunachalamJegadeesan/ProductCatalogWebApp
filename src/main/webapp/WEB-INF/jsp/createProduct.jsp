<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Product Catalog</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" th:href="@{/css/main.css}"
	href="../css/main.css" />
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Product Catalog</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>					
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
	<form:form action="catalogAdd" method="post" commandName="productForm">
		<div class="starter-template">
		<h1> Add Products ..</h1>		   
		   <table>
		   <tr>
		   <td>Product Name:<form:input  path ="productName"/></td>
		   <td align="left"><form:errors path="productName" /></td>
		   <td>USOC:<form:input   path ="usoc" /></td>
		   <td align="left"><form:errors path="usoc" /></td>
		   <td>State Code:<form:input   path ="stateCode"/> </td>
		   <td align="left"><form:errors path="stateCode" /></td>
		   <td>Region Code:<form:input   path ="regionCode" /></td>
		   <td align="left"><form:errors path="regionCode" /></td>
		   <td>Availablity:<form:select  path="available">
		   <option value="Y">Y</option>
		   <option value="N">N</option>
		   </form:select> 
		   </tr>
		   <tr>
		   <td><input type="submit" value="Add Product & Refresh" /></td>
		   </tr>
		   </table>		   		
		</div>
		<div class="starter-template">
		<h2> List of Products</h2>
		<table style="width:100%">
		<tr>
		<td>Product Name</td>
		<td>State Code</td>
		<td>Region Code </td>
		<td>USOC </td>
		<td>Availablity</td>
		</tr>		 
<c:forEach var="product" items="${products}">
<tr>
	<td><c:out value="${product.productName}"></c:out></td>
	<td><c:out value="${product.stateCode}"></c:out></td>
	<td><c:out value="${product.regionCode}"></c:out></td>
	<td><c:out value="${product.usoc}"></c:out></td>
	<td><c:out value="${product.available}"></c:out></td>
</tr>
</c:forEach>
</table>
</div>
</form:form>	
</div>
<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>