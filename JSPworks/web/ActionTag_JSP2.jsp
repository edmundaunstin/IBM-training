<%-- 
    Document   : ActionTag_JSP1
    Created on : May 30, 2019, 11:29:50 AM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h2>Hello World!  to  s</h2><br>
        <%
            String s=request.getParameter("user");
            %>
        <jsp:include page="ActionTag_JSP3.jsp"></jsp:include>
        <h2>END WORLD !<br>
    </body>
</html>
6