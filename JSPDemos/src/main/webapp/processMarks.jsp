<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String name = request.getParameter("name");
    int marks = Integer.parseInt(request.getParameter("marks"));
    
    if(marks >= 40) {
        request.setAttribute("name", name);
        request.setAttribute("marks", marks);
%>
        <jsp:forward page="pass.jsp" />
<%
    } else {
        request.setAttribute("name", name);
        request.setAttribute("marks", marks);
%>
        <jsp:forward page="fail.jsp" />
<%
    }
%>