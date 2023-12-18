package org.dsi.basicservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SuccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        //int id = (int) req.getAttribute("id");
        HttpSession s = req.getSession();
        String name = (String) s.getAttribute("name");
        String course = (String) s.getAttribute("course");

        System.out.println(name);
        System.out.println(course);
//        resp.sendRedirect("https://www.google.com");
//        writer.println("<h2>Form submitted successfully from Id.... </h2>" + id);
        writer.println("<h2> " + name+" is learning " + course+"</h2>");

    }
}
