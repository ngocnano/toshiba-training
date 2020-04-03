<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@page isELIgnored="false" %>
<html>
<head>
<title>Product</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>

<c:url var="addProduct" value="/add/" ></c:url>

<form:form action="${addProduct}" commandName="product">
<table>
	<c:if test="${!empty product.nameProduct}">
	<tr>
		<td>
			<form:label path="idProduct">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="idProduct" readonly="true" size="8"  disabled="true" />
			<form:hidden path="idProduct" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="nameProduct">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="nameProduct" />
		</td> 
		<td>
			<form:errors path="nameProduct" />
		</td> 
	</tr>

	<tr>
		<td>
			<form:label path="idCategory">
				<spring:message text="Category"/>
			</form:label>
		</td>
		<td>
			<form:select path="idCategory">
				<form:options items="${listCategory}" itemValue="idCategory" itemLabel="categoryName"/>
			</form:select>
		</td>
		<td>
			<form:errors path="idCategory" />
		</td>
		</tr>
		<tr>
		<td>
			<form:label path="price">
				<spring:message text="Price"/>
			</form:label>
					<td>
			<form:input path="price" />
		</td>
		<td>
			<form:errors path="price" />
		</td>
			
		
	</tr>
		<tr>
		<td>
			<form:label path="Quantity">
				<spring:message text="Quantity"/>
			</form:label>
		</td>
		<td>
			<form:input path="quantity" />
		</td> 
		<td>
			<form:errors path="quantity" />
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="Description">
				<spring:message text="Description"/>
			</form:label>
					<td>
			<form:input path="description" />
		</td>
		<td>
			<form:errors path="description" />
		</td>
			
		
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty product.nameProduct}">
				<input type="submit"
					value="<spring:message text="Edit Product"/>" />
			</c:if>
			<c:if test="${empty product.nameProduct}">
				<input type="submit"
					value="<spring:message text="Add Product"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<h3>Product List</h3>
<c:if test="${!empty listProduct}">
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="120">Category</th>
		<th width="120">Price</th>
		<th width="120">Quantity</th>
		<th width="120">Description</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listProduct}" var="product">
		<tr>
			<td>${product.idProduct}</td>
			<td>${product.nameProduct}</td>
			<td>
				<c:forEach items="${listCategory}"  var="category">
					<c:if test="${category.idCategory eq product.idCategory}"> <c:out value="${category.categoryName }"></c:out> </c:if>
				</c:forEach> 
			</td>
			<td>${product.price}</td>
			<td>${product.quantity}</td>
			<td>${product.description}</td>
			<td><a href="<c:url value='/edit/${product.idProduct}' />" >Edit</a></td>
			<td><a href="<c:url value='delete/${product.idProduct}'/>" onclick="return confirm('Do you want delete this record ?')">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
<h2 Style="text-align: center;"><a href="/minishoping/">Trở về trang quản lý</a></h2>
</body>
</html>