package org.dsi.basicservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("user-name");
        System.out.println(name);
        // name is saved in the browser's cookie.
        Cookie c = new Cookie("user-name",name);

        res.addCookie(c);
        String id = "1605021";
//        req.setAttribute("user", "Alom"); //setAttribute kaj kore sudhu matro RequestDispatcher diye
        // onno ekta servlet k forward ba include korle.

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h3>Hello dear "+ name +"</h3>");
        // id is passing by url-rewriting
        out.println("<a href='CookieLesson?user-id="+id+"'>go to next page</a>");


        // Hidden Form field coding
        out.println("<form style=' margin-top: 10px' action='magicHiddenPage' method ='post'>"+
                "<input type = 'hidden' name = 'userName' value = " +name+
                ">"+
                "<input type = 'hidden' name = 'userId' value = " +id+
                ">"+
                "<button type='submit'>go to Hidden page</button>"+
                "</form>"

                );

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Servlet-3 doGet method called...");
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        writer.println("<h1>This Servlet is created by extending the HttpServlet Class...</h1>");


    }
}
