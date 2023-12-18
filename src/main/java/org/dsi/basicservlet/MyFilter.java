package org.dsi.basicservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
        System.out.println("Filter is initializing");
    }

    @Override
    public void destroy() {
        System.out.println("filter is destroying");
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession s = req.getSession();
        String name = (String) s.getAttribute("name");
        if(name!=null){
            chain.doFilter(request,response);
        }
        else{
            System.out.println("User is not registered!!");
            response.getWriter().println("Please Fill up the form first!!");
        }

    }
}
