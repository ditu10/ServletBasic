package org.dsi.basicservlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Servlet2 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet-2 service method called...");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>This Servlet is created by extending the GenericServlet class...</h1>");
        writer.println("<p>ServletConfig : " + getServletConfig().toString() +"</p>");
    }
}
