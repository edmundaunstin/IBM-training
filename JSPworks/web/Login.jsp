<%-- 
    Document   : Login
    Created on : May 29, 2019, 2:58:51 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <center> <body bgcolor="lightgreen">
           <%
               String s="admin";
               String p="admin";
               String user=request.getParameter("user");
               String pass=request.getParameter("pass");
               String str="WRONG ENTRY";
               
               
               if(s.equals(user)&& p.equals(pass)){
                   
                    str="WELCOME" + user;
                  }  
               %>
            <h1>   <%=
                   str
                           %>
        
    </body>
</html>
