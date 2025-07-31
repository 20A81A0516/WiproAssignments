package com.student.registration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String product = request.getParameter("product");
        String priceStr = request.getParameter("price");
        String qtyStr = request.getParameter("qty");

        double price = 0.0;
        int qty = 0;
        boolean ok = true;

        try {
            price = Double.parseDouble(priceStr);
            qty = Integer.parseInt(qtyStr);
        } catch (Exception e) {
            ok = false;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (!ok || product == null || qty <= 0) {
            out.println("<html><body>");
            out.println("<h3>Invalid order data.</h3>");
            out.println("<a href='product.html'>Start again</a>");
            out.println("</body></html>");
            return;
        }

        double total = price * qty;

        out.println("<html><body>");
        out.println("<h2>Receipt</h2>");
        out.println("<p>Product: " + product + "</p>");
        out.println("<p>Unit Price: " + price + "</p>");
        out.println("<p>Quantity: " + qty + "</p>");
        out.println("<hr>");
        out.println("<h3>Total: " + total + "</h3>");
        out.println("<p><a href='product.html'>New order</a></p>");
        out.println("</body></html>");
    }
}