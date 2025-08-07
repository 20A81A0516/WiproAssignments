package com.student.registration;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] selectedItems = request.getParameterValues("item");

        if (selectedItems != null) {
            for (String item : selectedItems) {
                Cookie cookie = new Cookie(item, item);
                cookie.setMaxAge(24 * 60 * 60); // valid for 1 day
                response.addCookie(cookie);
            }
        }

        response.setContentType("text/html");
        response.getWriter().println("<h3>Items added to cart!</h3>");
        response.getWriter().println("<a href='view'>View Cart</a>");
    }
}

