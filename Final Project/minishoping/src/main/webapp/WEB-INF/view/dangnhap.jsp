
<!DOCTYPE html>
<html>
    
<head>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@page isELIgnored="false" %>
    <style>
        @charset "UTF-8";

html,body{
	width: 100%;
	height: 100%;
	color: blue;
}
#bodylogin{
	display: flex;
	height: 100%;
	justify-content: center;
    align-items: center;
    background-color: rgb(2, 141, 165);
}
#left{
    
    width: 380px;
    height: 600px;
    background-image: url("resources/left.jpg");

}
#right{
   
    width: 440px;
    height: 600px;
    background-color: white;
}
.welcome{
    display: flex;
    justify-content: center;
}
#container{
    display: flex;
    background-color: brown;
    width: 820px;
    height: 600px;
}
#name{
	color: red;
	text-align: left;
	
}
a{
    text-decoration: none;
}
td{
    color: gray;
}
#form{
    display: flex;
    justify-content: center;
}
    </style>
<meta charset="UTF-8">
<title>Minishopping</title>
</head>

<body >
<c:url var="dangnhap" value="/" ></c:url>
 <div id="bodylogin"> 
     <div id="container">
         <div id="left">
             <div class="welcome">
                <h1>Welcome</h1> <br>
             </div>
             <div class="welcome">
                <h2>to shopingabc</h2>
             </div>
        </div>
        <div id="right">
            <h2 class="welcome" style="color: tomato;">Đăng nhập </h2>
            
            <div id="form">
                <form:form action="${dangnhap}" commandName="customer" id = "form" method="POST">
                    <table>

                       <tr> <td>ID Khách hàng</td> <td>
			<form:select path="idCustomer">
				<form:options items="${listCustomer}" itemValue="idCustomer" itemLabel="idCustomer"></form:options>
			</form:select>
	          <td></tr>
                       <tr><td></td></tr>
                       <tr><td>Lưu ý ID 1 là admin </td> <td> </td></tr>
                    </table>
                    <input type="submit" value="Đăng nhập" style="text-align: center; height: 50%;">
                </form:form>
            </div>
        </div>
     </div>
 </div>

</body>
</html>