package org.dsi.basicservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HiddenForm extends HelloServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        System.out.println(name);
        String id = req.getParameter("userId");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<h1>In this page, Data is fetch by Hidden form</h1>");
        out.println("<h2>UserName : " +name+ "</h2>");
        out.println("<h2>Id : " +id+ "</h2>");
    }
}
