<%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: ১৭/১২/২৩
  Time: ৪:০৫ PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page errorPage="ErrorPage.jsp " %>
<html>
<head>
    <title>About JSP</title>
</head>
<body>
    <%
        String name = "unknown";
        Cookie[] cookies = request.getCookies();
        for(Cookie c: cookies){
            if(c.getName().equals("user-name")){
                name = c.getValue();
            }
        }
    %>
<%--    <%--%>
<%--        out.println("How are you Mr. "+name);--%>
<%--    %>--%>

<%--    <%@include file="Header.jsp"%>--%>
    <h1>JSP means Java Servlet page</h1>
    <p>How are you Mr.<%=name%></p>
    <%!
        int n = 10;
        int m = 5;
        int d = n/m;
    %>
    <p>Division is : <%= d%></p>

</body>
</html>
