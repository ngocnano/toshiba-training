<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/toshiba";%>
<%!String user = "root";%>
<%!String psw = "root";%>
<%
String time = request.getParameter("buoi");
String thu =request.getParameter("thu");
String work =request.getParameter("work");
//String city_name=request.getParameter("cityname");
//String email=request.getParameter("email");
if(time != null)
{
Connection con = null;
PreparedStatement ps = null;
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update staff set "+ thu + "=? where time LIKE '%" + time +"'" ;
ps = con.prepareStatement(sql);
ps.setString(1,work);
//ps.setString(2, thu);
//ps.setString(3, last_name);
//ps.setString(4, city_name);
//ps.setString(5, email);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
 %>
 <html>
<head>
<meta http-equiv="refresh" content="3;url=http://localhost:8080/Calendar/ViewCalendar.jsp">
</head>
<body>
     <br>
     <a href = "http://localhost:8080/Calendar/UpdateForm.jsp">Return Update</a>
     <p>
        Auto return calender before 3 second 
     </p>
     
</body>
</html>
 <%
}
else
{
out.print("There is a problem in updating Record.");
%>
 <html>
<head>
<meta http-equiv="refresh" content="3;url=http://localhost:8080/Calendar/ViewCalendar.jsp">
</head>
<body>
     <br>
     <a href = "http://localhost:8080/Calendar/UpdateForm.jsp">Return Update</a>
     <p>
        Auto return calender before 3 second 
     </p>
     
</body>
</html>
 <%
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>