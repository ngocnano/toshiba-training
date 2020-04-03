<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
//String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "toshiba";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lịch làm việc</title>
<style>
        div{
            
            width: 1400px;
            height: 600px;
            margin: 0 auto;
        }
        #id{ 
            text-align: center;
            background-color: rgb(12, 235, 235);
            width: 100px;
            color: white;
        }
        #id1{ 
            background-color: rgb(12, 235, 235);
            width: 100px;
            height: 50px;
        }
        #bang{
            margin: auto;
        }
          #id2{ 
            text-align: center;
            color:  black;
            }
    </style>
</head>
<body background="a2.jpg">

<h1 style="text-align: center;">Calendar</h1>
<table id="bang" border="1">
<tr>
                       <th id="id">Time</th>
                       <th id="id">Monday</th>
                       <th id="id">Tuesday</th>
                       <th id="id">Wednesday</th>
                       <th id="id">Thursday</th>
                       <th id="id">Friday</th>
                       <th id="id">Saturday</th>
                       <th id="id">Sunday</th>    
                   </tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from staff";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<th id="id1"><%=resultSet.getString("time") %></th>
<td id="id2"><%=resultSet.getString("thu2") %></td>
<td id="id2"><%=resultSet.getString("thu3") %></td>
<td id="id2"><%=resultSet.getString("thu4") %></td>
<td id="id2"><%=resultSet.getString("thu5") %></td>
<td id="id2"><%=resultSet.getString("thu6") %></td>
<td id="id2"><%=resultSet.getString("thu7") %></td>
<td id="id2"><%=resultSet.getString("chunhat") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>

</table>
<br>
 <h3 style="text-align: center;"><a href = "http://localhost:8080/Calendar/UpdateForm.jsp" style="color:rgb(233, 27, 27);">Click to change calendar</a></h3>
 <br>
 <h3 style="text-align: center;"><a href = "http://localhost:8080/Calendar/Home.jsp" style="color:rgb(233, 27, 27);">Click to back</a></h3>
</body>
</html>
