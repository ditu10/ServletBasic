package org.dsi.basicservlet;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
//        out.println("<h1 style='color: red'>" + message + "</h1>");
        out.println("</body></html>");
        RequestDispatcher rd0 = request.getRequestDispatcher("Header.jsp");
        rd0.include(request,response);
        RequestDispatcher rd = request.getRequestDispatcher("Hello.jsp");
        rd.include(request, response);
        RequestDispatcher rd2 = request.getRequestDispatcher("Random.jsp");
        rd2.include(request, response);


    }

    public void destroy() {
        System.out.println("destroy...");
    }
}