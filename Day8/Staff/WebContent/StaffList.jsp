<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <center>
        <h1>Staff Management</h1>
        <h2>
           <a href="new">Add New Staff</a>
            &nbsp;&nbsp;&nbsp;
            <a href="list">List All Staff</a>
        </h2>
    </center>
<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Staff</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Sex</th>
                <th>Email</th>
                <th>Action</th>
                
            </tr>
            <c:forEach var="Staff" items="${listStaff}">
                <tr>
                    <td>${Staff.getID()}</td>
                    <td>${Staff.getName()}</td>
                    <td>${Staff.getAge()}</td>
                    <td>${Staff.getSex()}</td>
                    <td>${Staff.getEmail()}</td>
                    <td>
                    <form action = "Controler">
                        <a href="edit?id=<c:out value='${Staff.getID()}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=<c:out value='${Staff.getID()}' />">Delete</a> 
                        </form>                    
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>   
</body>
</html>