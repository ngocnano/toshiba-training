<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>
            Home
        </title>
        <style>
            li{
                float: right;
                padding-right: 100px;
                padding-top: 15px;
                list-style: none;
                margin: 0;
                font-size: 150%;
                
            }
            a{
                text-decoration: none;
                color:gray;
            }
            #content{
                width: 100%;
                height: 100%;
                margin: 0;
                padding: 0px;
                border: 0;
               background-image: url(a3.jpg);
               background-repeat: no-repeat;
               background-position: right;

            }
            h3{
                text-align: left;
                color: seagreen;
            }

        </style>

    </head>
    <body style="margin: 0; padding: 0;">
            <div style="height: 100px; width: 100%; background-image: url(td.jpg); margin: 0; padding: 0;"> </div>
            <div style="height: 50px; width: 100%; margin: 0; padding: 0; align-content: right;">
                <ul>
                    <li><a href="http://localhost:8080/Calendar/ViewCalendar.jsp">Calendar</a> </li>
                    <li><a href="#">Information</a> </li>
                    
                </ul>
            </div>
            <div id="content">
                    <h3>Full name : Tran Minh Ngoc</h3>
                    <h3>University : PTIT</h3>
                    <h3>Faculty	 : Telecommunication</h3>
                    <div style="width: 800px; height: 500px;">
                        <p style="text-align: center; font-size: 150%; color: orange;">Hello,welcome to my website :)))</p>
                    </div>
            </div>
           
    </body>
</html>