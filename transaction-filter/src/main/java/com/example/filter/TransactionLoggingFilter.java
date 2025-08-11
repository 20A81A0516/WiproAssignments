package com.example.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLoggingFilter implements Filter {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String amount = request.getParameter("amount");
        if (amount == null || amount.trim().isEmpty()) {
            amount = "N/A";
        }

        String ip = request.getRemoteAddr();
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpReq = (HttpServletRequest) request;
            String forwarded = httpReq.getHeader("X-Forwarded-For");
            if (forwarded != null && !forwarded.isBlank()) {
                ip = forwarded.split(",")[0].trim();
            }
        }

        String timestamp = LocalDateTime.now().format(formatter);

        System.out.println("[" + timestamp + "] Transaction Request from IP: " + ip + " | Amount: Rs." + amount);

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}





//[2025-08-10 17:09:07] Transaction Request from IP: 0:0:0:0:0:0:0:1 | Amount: Rs.1500