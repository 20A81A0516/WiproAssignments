<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Passed!</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        .container { max-width: 500px; margin: 0 auto; padding: 20px; text-align: center; }
        h2 { color: #4CAF50; }
        .message { margin: 20px 0; font-size: 18px; }
        .marks { font-weight: bold; color: #4CAF50; font-size: 24px; }
    </style>
</head>
<body>
    <div class="container">
        <h2>Congratulations!</h2>
        <div class="message">
            <%= request.getAttribute("name") %>, you have passed with <span class="marks"><%= request.getAttribute("marks") %> marks</span>.
        </div>
        <p>Well done on your achievement!</p>
    </div>
    
    <jsp:include page="footer.jsp" />
</body>
</html>