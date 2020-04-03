<!DOCTYPE html>
<html>
<head>
   <title>Up date</title>
</head>
<body>
<h1 style="align-content: center; color: black;">Update</h1>
        <form action="update-process.jsp" method="POST">
            Select day :
            <select name ="thu">
                <option value="thu2">Monday</option>
                <option value="thu3">Tuesday</option>
                <option value="thu4">Wednesday</option>
                <option value="thu5">Thursday</option>
                <option value="thu6">Friday</option>
                <option value="thu7">Saturday</option>
                <option value="chunhat">Sunday</option>
            </select>
            <br>
            Select time :
            <select name ="buoi">
                <option value="Morning">Morning</option>
                <option value="Afternoon">Afternoon</option>
                <option value="Evening">Evening</option>
            </select>
            <br>
            Enter the work :
            
            <input type="text" name="work" size="30" maxlength="100" value="empty"></input>
            <br>
            <input type="submit" value="submit">
        </form>
        <a href = "http://localhost:8080/Calendar/ViewCalendar.jsp" style="color:rgb(233, 27, 27);">Back</a>
</body>
</html>