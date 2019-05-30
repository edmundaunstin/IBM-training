<%-- 
    Document   : ActionTag_JSP1
    Created on : May 30, 2019, 11:29:50 AM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" scontent="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Hello World!</h1><br>
        <jsp:include page="ActionTag_JSP2.jsp">
            <jsp:param name="user" value="AUNSTIN"></jsp:param>
        </jsp:include>  <%--Instead of request Dispatcher--%>
        <h1>END WORLD !<br>s
    </body>
</html>
