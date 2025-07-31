<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Marks Form</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        form { max-width: 400px; margin: 0 auto; padding: 20px; border: 1px solid #ddd; border-radius: 5px; }
        h2 { color: #4CAF50; text-align: center; }
        label { display: block; margin-top: 15px; }
        input { width: 100%; padding: 8px; margin-top: 5px; box-sizing: border-box; }
        button { margin-top: 20px; padding: 10px 15px; background: #4CAF50; color: white; border: none; cursor: pointer; width: 100%; }
        button:hover { background: #45a049; }
    </style>
</head>
<body>
    <form action="processMarks.jsp" method="post">
        <h2>Student Marks Form</h2>
        <label for="name">Student Name:</label>
        <input type="text" id="name" name="name" required>
        
        <label for="marks">Marks Obtained:</label>
        <input type="number" id="marks" name="marks" min="0" max="100" required>
        
        <button type="submit">Submit</button>
    </form>
    
    <jsp:include page="footer.jsp" />
</body>
</html>