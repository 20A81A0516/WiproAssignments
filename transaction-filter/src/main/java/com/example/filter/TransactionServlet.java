package com.example.filter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String amount = req.getParameter("amount");
        if (amount == null || amount.trim().isEmpty()) {
            amount = "0";
        }

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><body>");
            out.println("<h3>Transaction of Rs." + amount + " processed successfully.</h3>");
            out.println("</body></html>");
        }
    }
}



//http://localhost:8080/transaction-filter/
//http://localhost:8080/transaction-filter/transaction?amount=1500

