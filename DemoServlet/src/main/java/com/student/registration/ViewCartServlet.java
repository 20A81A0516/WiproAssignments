package com.student.registration;
   

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        response.setContentType("text/html");
        response.getWriter().println("<h2>Your Cart Items:</h2>");

        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                if (!"JSESSIONID".equals(c.getName())) {
                    response.getWriter().println("<li>" + c.getValue() + "</li>");
                }
            }
        } else {
            response.getWriter().println("<p>No items in cart</p>");
        }
    }
}
