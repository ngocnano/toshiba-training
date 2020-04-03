<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@page isELIgnored="false" %>
<html>
<head>
<title>Order</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>

<c:url var="addOrder" value="/addOrder/" ></c:url>

<form:form action="${addOrder}" commandName="orderTotal">
<table>
	<c:if test="${!empty orderTotal.idOrder}">
	<tr>
		<td>
			<form:label path="idOrder">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="idOrder" readonly="true" size="8"  disabled="true" />
			<form:hidden path="idOrder" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="date">
				<spring:message text="Date"/>
			</form:label>
		</td>
		
		<td>
			<form:input path="date" value="${orderTotal.date}"/>
		</td> 
		<td>
			<form:errors path="date" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="idCustomer">
				<spring:message text="Customer"/>
			</form:label>
		</td>
		<td>
			<form:select path="idCustomer">
				<form:options items="${listCustomer}" itemValue="idCustomer" itemLabel="customerName"/>
			</form:select>
		</td>
		<td>
			<form:errors path="idCustomer" />
		</td>
		</tr>

	<tr>
		<td>
			<form:label path="idProduct">
				<spring:message text="Product"/>
			</form:label>
		</td>
		<td>
			<form:select path="idProduct">
				<form:options items="${listProduct}" itemValue="idProduct" itemLabel="nameProduct"/>
			</form:select>
		</td>
		<td>
			<form:errors path="idProduct" />
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
		<td colspan="2">
			<c:if test="${!empty orderTotal.idOrder}">
				<input type="submit"
					value="<spring:message text="Edit Product"/>" />
			</c:if>
			<c:if test="${empty orderTotal.idOrder}">
				<input type="submit"
					value="<spring:message text="Add Product"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<h3>Product List</h3>
<c:if test="${!empty listOrderTotal}">
	<table class="tg">
	<tr>
		<th width="80">Order ID</th>
		<th width="120">Customer Name</th>
		<th width="120">Product Name</th>
		<th width="120">Date</th>
		<th width="120">Total Money</th>
		<th width="120">Quantity</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOrderTotal}" var="orderTotal">
		<tr>
			<td>${orderTotal.idOrder}</td>
			<td>${orderTotal.idCustomer}</td>
			<td>${orderTotal.idProduct}</td>
			<td>${orderTotal.date}</td>
			<td>${orderTotal.totalMoney}</td>
			<td>${orderTotal.quantity}</td>
			<td><a href="<c:url value='/editOrder/${orderTotal.idOrder}' />" >Edit</a></td>
			<td><a href="<c:url value='deleteOrder/${orderTotal.idOrder}'/>" onclick="return confirm('Do you want delete this record ?')">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>

<h2 Style="text-align: center;"><a href="/minishoping/">Trở về trang quản lý</a></h2>

</body>
</html>