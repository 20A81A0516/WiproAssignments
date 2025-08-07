<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<html>
<head><title>Account Details</title></head>
<body>
    <h2>Account Details</h2>
    Account Number: ${account.accountNo} <br/>
    Name: ${account.name} <br/>
    Balance: ${account.balance} <br/>
    Account Type (from session): ${sessionScope.type} <br/><br/>

    <c:choose>
        <c:when test="${account.balance >= 5000}">
            <strong>Balance is Sufficient</strong>
        </c:when>
        <c:otherwise>
            <strong>Balance is Low</strong>
        </c:otherwise>
    </c:choose>
</body>
</html>
