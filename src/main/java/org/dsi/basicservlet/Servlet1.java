package org.dsi.basicservlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Servlet1 implements Servlet {
    //Life cycle Methods
    ServletConfig conf;

    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Creating Servlet-1 Object..");
    }

    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet-1 service method called...");
        // set the content type of the response
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>This Servlet is created by implementing the Servlet interface....</h1>");
        writer.println("<p>Date & Time: "+ new Date().toString()+"</p>");

        writer.println("<form action='servlet3' method = 'post' > ");
        writer.println("<input type='text' name = 'user-name'></input>");
        writer.println("<button type='submit'>OK</button>");
        writer.println("</form>");

    }

    public void destroy(){
        System.out.println("Destroying the Servlet-1 Object");
    }

    public ServletConfig getServletConfig(){
        return this.conf;
    }
    public String getServletInfo(){
        return "This servlet is created by Ditu";
    }

}
