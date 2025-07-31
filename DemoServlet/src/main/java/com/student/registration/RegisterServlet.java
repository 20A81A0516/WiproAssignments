package com.student.registration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Retrieve form data
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");
        
        // Display the submitted data
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Registration Details</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 20px; }");
        out.println("h2 { color: #4CAF50; }");
        out.println(".details { margin-top: 20px; }");
        out.println(".detail-row { margin-bottom: 10px; }");
        out.println(".label { font-weight: bold; display: inline-block; width: 150px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Registration Successful!</h2>");
        out.println("<div class='details'>");
        out.println("<div class='detail-row'><span class='label'>First Name:</span> " + firstName + "</div>");
        out.println("<div class='detail-row'><span class='label'>Last Name:</span> " + lastName + "</div>");
        out.println("<div class='detail-row'><span class='label'>Email:</span> " + email + "</div>");
        out.println("<div class='detail-row'><span class='label'>Phone:</span> " + phone + "</div>");
        out.println("<div class='detail-row'><span class='label'>Gender:</span> " + gender + "</div>");
        out.println("<div class='detail-row'><span class='label'>Course:</span> " + course + "</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}