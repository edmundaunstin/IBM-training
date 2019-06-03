<%-- 
    Document   : DemoCore2
    Created on : May 31, 2019, 3:02:57 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <C:set var="s" value="123" scope="session"/>
        <C:out value="${s}"/>
    </body>
</html>
