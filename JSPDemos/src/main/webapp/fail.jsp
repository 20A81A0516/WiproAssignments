<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Try Again</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        .container { max-width: 500px; margin: 0 auto; padding: 20px; text-align: center; }
        h2 { color: #f44336; }
        .message { margin: 20px 0; font-size: 18px; }
        .marks { font-weight: bold; color: #f44336; font-size: 24px; }
        .encourage { margin-top: 20px; }
    </style>
</head>
<body>
    <div class="container">
        <h2>Sorry!</h2>
        <div class="message">
            <%= request.getAttribute("name") %>, you scored <span class="marks"><%= request.getAttribute("marks") %> marks</span> which is below passing.
        </div>
        <div class="encourage">
            <p>Don't worry! Try harder next time.</p>
            <p><a href="form.jsp">Try again</a></p>
        </div>
    </div>
    
    <jsp:include page="footer.jsp" />
</body>
</html>