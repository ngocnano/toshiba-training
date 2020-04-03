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
<jsp:include page="header.jsp"/>
<meta charset="ISO-8859-1">
<title>Manager</title>
</head>
<body>

    <div  style="text-align: center;">
    <h2> <a href="product/">ProductManager</a></h2> <br>
    <h2> <a href="category/">CategoryManager</a></h2> <br>
     <h2><a href="customer/">CustomerManager</a></h2> <br>
     <h2> <a href="order/">OrderManager</a></h2>
     </div>
</body>
</html>