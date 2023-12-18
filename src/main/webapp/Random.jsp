<%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: ১৭/১২/২৩
  Time: ৫:০৪ PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Random, java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Random</title>
</head>
<body>
    <h2>Welcome to the Random numbers world!..</h2>
    <%
        Random r = new Random();
        int n = r.nextInt(10);
    %>
    <h3>Random number : <%= n%></h3>

</body>
</html>
