package org.dsi.basicservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CookieServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String name = req.getParameter("user-name");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        Cookie[] c = req.getCookies();
        boolean hasCookie = false;
        if(c!= null){
            for(Cookie cookie : c){
                System.out.println(cookie.getName() +" -> "+ cookie.getValue());
                if(cookie.getName().equals("user-name")){
                    out.println("<h2 style='color: blue'>Here data is receiving from the cookie</h2>");

                    out.println("<h3>Hello "+cookie.getValue()+", Welcome to Java Cookie lesson </h3>");
                    hasCookie = true;
                    break;
                }

            }
            if(!hasCookie){
                out.println("<h3>I don't know you!!!</h3>");
            }

        }

        String userId = req.getParameter("user-id");
        out.println("<h2 style='color: blue'>Here data is receiving from the query params of the url</h2>");
        out.println("<h3>Hello "+userId+", Welcome to Java Cookie lesson </h3>");

    }
}
