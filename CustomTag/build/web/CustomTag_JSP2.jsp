<%-- 
    Document   : CustomTag_JSP2
    Created on : Jun 3, 2019, 3:32:42 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="WEB-INF/tlds/greeting.tld" prefix="myapp"%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <myapp:greeting name="AUNSTIN" />
    </body>
</html>
