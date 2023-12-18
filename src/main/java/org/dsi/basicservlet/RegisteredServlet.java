package org.dsi.basicservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class RegisteredServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        writer.println("<h1>Welcome to the Register Servlet</h1>");
        String name = req.getParameter("user_name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String course = req.getParameter("course");
        String condition = req.getParameter("condition");

        System.out.println("password: " + password);
        if(condition!= null){
            if(condition.equals("checked")){
                writer.println("<p>Name : " + name + "</p>");
                writer.println("<p>Email : " + email + "</p>");
                writer.println("<p>Gender : " + gender + "</p>");
                writer.println("<p>Course : " + course + "</p>");
                System.out.println("writing in condole");
                try {
                    Thread.sleep(5000); // Sleep for 5 seconds (5000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                HttpSession session = req.getSession();
                session.setAttribute("name",name);
                session.setAttribute("course",course);

                // include() and forward() method are checking...
//
//                RequestDispatcher rd = req.getRequestDispatcher("SuccessServlet");
//                req.setAttribute("id",707);
//                rd.forward(req, res);
////                rd.include(req,res);
//                System.out.println("printing");

            }
            else {

            }
        }else{
            writer.println("You must accept out terms & condition");
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.include(req, res);
        }

    }
}
