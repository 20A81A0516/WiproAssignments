package com.student.registration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GradeServlet")
public class GradeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = (String) request.getAttribute("studentName");
        int marks = (Integer) request.getAttribute("studentMarks");
        
        String grade = calculateGrade(marks);
       
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Grade Result</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 20px; }");
        out.println(".container { max-width: 500px; margin: 0 auto; padding: 20px; text-align: center; }");
        out.println("h2 { color: #4CAF50; }");
        out.println(".result { margin: 20px 0; font-size: 18px; }");
        out.println(".grade { font-weight: bold; font-size: 24px; color: #2196F3; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Grade Result</h2>");
        out.println("<div class='result'>");
        out.println("Student: <strong>" + name + "</strong><br>");
        out.println("Marks: <strong>" + marks + "</strong><br>");
        out.println("Grade: <span class='grade'>" + grade + "</span>");
        out.println("</div>");
        out.println("<a href='marksForm.html'>Calculate Another</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    
    private String calculateGrade(int marks) {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        if (marks >= 40) return "E";
        return "F";
    }
}