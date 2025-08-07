<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="product" class="com.jspdemos.servlets.Product" scope="request" />
<jsp:setProperty name="product" property="*" />

<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h2>Product Information</h2>
    <p><strong>Product ID:</strong> <jsp:getProperty name="product" property="id" /></p>
    <p><strong>Name:</strong> <jsp:getProperty name="product" property="name" /></p>
    <p><strong>Price:</strong> ₹<jsp:getProperty name="product" property="price" /></p>
    <p><strong>Quantity:</strong> <jsp:getProperty name="product" property="quantity" /></p>
</body>
</html>
