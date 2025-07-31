package com.student.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

    private static final Map<String, Double> PRICE_LIST = new HashMap<>();
    static {
        PRICE_LIST.put("Pen", 10.0);
        PRICE_LIST.put("Notebook", 45.0);
        PRICE_LIST.put("Pencil", 5.0);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String product = request.getParameter("product");
        Double price = PRICE_LIST.get(product);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (product == null || price == null) {
            out.println("<html><body>");
            out.println("<h3>Invalid product selection.</h3>");
            out.println("<a href='product.html'>Go back</a>");
            out.println("</body></html>");
            return;
        }

        out.println("<html><body>");
        out.println("<h2>Enter Quantity</h2>");
        out.println("<form method='post' action='OrderServlet'>");

        out.println("<input type='hidden' name='product' value='" + product + "'/>");
        out.println("<input type='hidden' name='price' value='" + price + "'/>");

        out.println("<label>Quantity: </label>");
        out.println("<input type='number' name='qty' min='1' value='1' required/>");
        out.println("<br><br><input type='submit' value='Place Order'/>");
        out.println("</form>");

        out.println("<p><a href='product.html'>Choose another product</a></p>");
        out.println("</body></html>");
    }
}