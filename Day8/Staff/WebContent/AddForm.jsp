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
      <table border="1">
         <c:if test="${staff != null}">
             <h1>update</h1>
             <form action="update" method="post">
			  ID staff <c:out value='${staff.getID()}' /> <br>
					</c:if>
		<c:if test="${staff == null}">
			<form action="insert" method="post">
				Enter ID staff <input type="text" name="id" size="50"> <br>
		</c:if>
				Enter name staff <input type="text" name="name" size="50"> <br>
				Enter age staff <input type="text" name="age" size="50"><br>
				Sex staff <select name="sex">
					<option value="male">male</option>
					<option value="femal">femal</option>
				</select> <br> 
				Enter email staff <input type="text" name="email" size="50"><br> 
				<input type="submit">
				</form>
		</table>
	</center>
        
       
        
    

</body>
</html>