<%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: ১৮/১২/২৩
  Time: ৩:০৪ PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
    <h1>Welcome to JSTL Learning</h1>
<%--    out tag--%>
<%--    set tag --> variable value set--%>
    <c:set var="i" value="24" scope="application"></c:set>
    <h1><c:out value="${i}"></c:out> </h1>

<%--    if tag--%>
    <c:if test="${i>0 && i%2==0}">
        <h2> ${i} is an even number</h2>
    </c:if>

<%--    choose , when , otherwise tags--%>
    <c:choose>
        <c:when test="${i>0}">
            <h2>i is positive</h2>
        </c:when>
        <c:when test="${i<0}">
            <h2>i is negative</h2>
        </c:when>
        <c:otherwise>
            <h2>i is zero</h2>
        </c:otherwise>
    </c:choose>

<%--  forEach -> loop using jstl, --%>
    <c:forEach var="i" begin="1" end="5">
        <h3>value of i is ${i}</h3>
    </c:forEach>


<%--    url, param tag--%>
    <c:url var="myUrl" value="CookieLesson">
        <c:param name="user-id" value="zisun"></c:param>

    </c:url>
    <h1><c:out value="${myUrl}"></c:out></h1>
    <a href="${myUrl}">go to Cookie lesson</a>


<%--    redirect  tag--%>
<%--    <c:redirect url="ErrorPage.jsp" >--%>

<%--    </c:redirect>--%>


</body>
</html>
