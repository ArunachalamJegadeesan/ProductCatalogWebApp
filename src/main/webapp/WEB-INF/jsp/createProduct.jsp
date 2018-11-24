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
		<h3> Add Product</h3>
		   <table class="table">
		   <thead>
		   <tr>
		   <th>Product Name:<form:input  path ="productName"/></th>
		   <th align="left"><form:errors path="productName" /></th>
		   <th>USOC:<form:input   path ="usoc" /></th>
		   <th align="left"><form:errors path="usoc" /></th>
		   <th>State Code:<form:input   path ="stateCode"/> </th>
		   <th align="left"><form:errors path="stateCode" /></th>
		   <th> Region Code:<form:input   path ="regionCode" /></th>
		   <th align="left"><form:errors path="regionCode" /></th>
		   <th>Availablity:<form:select  path="available">
		   <option value="Y">Y</option>
		   <option value="N">N</option>
		   </form:select> 
		   </tr>
		   </thead>
		   <tbody>
		   <tr>
		   <td><input type="submit"  class="btn btn-primary btn-md" value="Add Product" /></td>
		   </tbody>
		   </tr>
		   </table>		   		
		</div>
		<div class="starter-template">
		<h3> List of Products</h3>
		<table class = " table .table-striped">
		<thead>
		<tr>
		<td>Product Name</td>
		<td>State Code</td>
		<td>Region Code </td>
		<td>USOC </td>
		<td>Availablity</td>
		</tr>
		<thead>
		<tbody>
<c:forEach var="product" items="${products}">
<tr>
	<td><c:out value="${product.productName}"></c:out></td>
	<td><c:out value="${product.stateCode}"></c:out></td>
	<td><c:out value="${product.regionCode}"></c:out></td>
	<td><c:out value="${product.usoc}"></c:out></td>
	<td><c:out value="${product.available}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</form:form>	
</div>
<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>