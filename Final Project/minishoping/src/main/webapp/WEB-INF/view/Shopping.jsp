<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Trang mua sắm</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>

<h1 style="text-align: center;">Xin chào ${customerName}</h1>
<h3>Product List</h3>
<c:if test="${!empty listProduct}">
    <c:url var="addShopping" value="/addShopping/" ></c:url>
    
	<table class="tg">
	<tr>
		<th width="80">Mã sản phẩm</th>
		<th width="120">Tên sản phẩm</th>
		<th width="120">Loại sản phẩm</th>
		<th width="120">Giá</th>
		<th width="120">Số lượng</th>
		<th width="120">Mô tả</th>
		<th width="60">Nhập số lượng cần mua</th>
	</tr>
	<c:forEach items="${listProduct}" var="product">
	    <form:form action="${addShopping}" commandName="orderTotal">
	    <td>
			<form:input path="idProduct" readonly="true" size="8" value="${product.idProduct}"/>
		</td> 
			<td>${product.nameProduct}</td>
			<td>
				<c:forEach items="${listCategory}"  var="category">
					<c:if test="${category.idCategory eq product.idCategory}"> <c:out value="${category.categoryName }"></c:out> </c:if>
				</c:forEach> 
			</td>
			<td>${product.price}</td>
			<td>${product.quantity}</td>
			<td>${product.description}</td>
		<td>
			<form:input path="quantity" />
		</td> 
		<td>
			<form:errors path="quantity" />
		</td> 
		
		    <td>
			<form:label path="idCustomer">
				<spring:message text="ID Customer"/>
			</form:label>
		</td>
		<td>
			<form:input path="idCustomer" readonly="true" size="3"  disabled="true"/>
			<form:hidden path="idCustomer" />
		</td> 
		<td>
            <input type="submit"
					value="<spring:message text="Mua"/>" />
		</td>
		
		</tr>
		</form:form>
	</c:forEach>
	</table>
	
</c:if>

<h3>Bảng order của bạn</h3>
<c:if test="${!empty listOrderTotal}">
	<table class="tg">
	<tr>
		<th width="80">Order ID</th>
		<th width="120">Customer Name</th>
		<th width="120">Product ID</th>
		<th width="120">Date</th>
		<th width="120">Total Money</th>
		<th width="120">Quantity</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOrderTotal}" var="orderTotal">
		<tr>
			<td>${orderTotal.idOrder}</td>
		<td>
				<c:forEach items="${listCustomer}"  var="customer">
					<c:if test="${customer.idCustomer eq orderTotal.idCustomer}"> <c:out value="${customer.customerName}"></c:out> </c:if>
				</c:forEach> 
			</td>
			<td>${orderTotal.idProduct}</td>
			<td>${orderTotal.date}</td>
			<td>${orderTotal.totalMoney}</td>
			<td>${orderTotal.quantity}</td>
			<td><a href="<c:url value='/deleteShopping/${orderTotal.idOrder}/'/>" onclick="return confirm('Do you want delete this record ?')">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
<h2 Style="text-align: center;"><a href="/minishoping/">Trở về trang quản lý</a></h2>
</body>
</html>