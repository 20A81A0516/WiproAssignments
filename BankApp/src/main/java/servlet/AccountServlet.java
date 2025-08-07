package servlet;

import model.AccountBean;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int accountNo = Integer.parseInt(request.getParameter("accountNo"));
        String name = request.getParameter("name");
        double balance = Double.parseDouble(request.getParameter("balance"));

        AccountBean acc = new AccountBean();
        acc.setAccountNo(accountNo);
        acc.setName(name);
        acc.setBalance(balance);

        request.setAttribute("account", acc);
        HttpSession session = request.getSession();
        session.setAttribute("type", "Savings");

        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.forward(request, response);
    }
}
