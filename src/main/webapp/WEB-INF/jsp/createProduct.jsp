<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Spring Boot Thymeleaf Hello World Example</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" th:href="@{/css/main.css}"
	href="../../css/main.css" />
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
	<form action="/catalogAdd" method="post">
		<div class="starter-template">
		<h1> Add Products ..</h1>		   
		   <table>
		   <tr>
		   <td>Product Name:<input type="text"  name ="productName"/></td>
		   <td>USOC:<input type="text"  name ="usoc" /></td>
		   <td>State Code:<input type="text"  name ="stateCode"/> </td>
		   <td>Region Code:<input type="text"  name ="regionCode" /></td>
		   <td>Availablity:<input type="radio" name="isAvailable" value ="Y" checked />Y<input type="radio" name="isAvailable" value ="N" />N</td>
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
<td><c:out value="${product.productname}"></c:out></td>
<td><c:out value="${product.satecode}"></c:out></td>
<td><c:out value="${product.regioncode}"></c:out></td>
<td><c:out value="${product.usoc}"></c:out></td>
<td><c:out value="${product.isAvailable}"></c:out></td>
</tr>
</c:forEach>
</table>
</div>
</form>	
</div>
<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>