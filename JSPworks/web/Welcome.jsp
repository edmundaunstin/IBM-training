<%-- 
    Document   : Welcome
    Created on : May 29, 2019, 1:58:13 PM
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
            String s="AUNSTIN";
            System.out.println("HELLO");
            display();
        %>
        <br>
        <%=
            s
        %>
        
        <%!
            String str="HELLO>>>>>>>>>>>>>>>";
           
            
            public void display(){
                System.out.println(str);
            }
         %>

    </body>
</html>
