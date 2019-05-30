
<%-- 
    Document   : Greetings
    Created on : May 29, 2019, 2:52:50 PM
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
        <h1>Hello World!</h1>
        <%
            String s=request.getParameter("val");
            %>
           
            <%=
                s
            %>
            
    </body>
</html>
