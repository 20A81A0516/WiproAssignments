<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration Form</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="post">
        Full name: <input type="text" name="fullname" required><br><br>
        E-mail: <input type="email" name="email" required><br><br>
        Password: <input type="password" name="password" required><br><br>
        Birthday (yyyy-mm-dd): <input type="date" name="birthday"><br><br>
        Gender: 
        <input type="radio" name="gender" value="Male">Male
        <input type="radio" name="gender" value="Female">Female<br><br>
        Profession: 
        <select name="profession">
            <option>Developer</option>
            <option>Designer</option>
            <option>Tester</option>
        </select><br><br>
        Married? <input type="checkbox" name="married" value="yes"><br><br>
        Note:<br>
        <textarea name="note" rows="4" cols="40"></textarea><br><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>