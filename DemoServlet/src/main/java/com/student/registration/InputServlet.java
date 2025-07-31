package com.student.registration;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        int marks = Integer.parseInt(request.getParameter("marks"));
        
        request.setAttribute("studentName", name);
        request.setAttribute("studentMarks", marks);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("GradeServlet");
        dispatcher.forward(request, response);
    }
}