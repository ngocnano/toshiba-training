<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
 <c:url var="addCustomer" value="/addCustomer/" ></c:url>

<form:form action="${addCustomer}" commandName="customer">
<table>
	<c:if test="${!empty customer.customerName}">
	<tr>
		<td>
			<form:label path="idCustomer">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="idCustomer" readonly="true" size="8"  disabled="true" />
			<form:hidden path="idCustomer" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="customerName">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerName" />
		</td> 
		<td>
			<form:errors path="customerName" />
		</td> 
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty customer.customerName}">
				<input type="submit"
					value="<spring:message text="Edit Customer"/>" />
			</c:if>
			<c:if test="${empty customer.customerName}">
				<input type="submit"
					value="<spring:message text="Add Customer"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
     
     <h3>Customer List</h3>
<c:if test="${!empty listCustomer}">
	<table class="tg">
	<tr>
		<th width="80">Customer ID</th>
		<th width="120">Customer Name</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listCustomer}" var="customer">
		<tr>
			<td>${customer.idCustomer}</td>
			<td>${customer.customerName}</td>
			
			<td><a href="<c:url value='/editCustomer/${customer.idCustomer}' />" >Edit</a></td>
			<td><a href="<c:url value='deleteCustomer/${customer.idCustomer}'/>" onclick="return confirm('Do you want delete this record ?')">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
     <h2 Style="text-align: center;"><a href="/minishoping/">Trở về trang quản lý</a></h2>
</body>
</html>