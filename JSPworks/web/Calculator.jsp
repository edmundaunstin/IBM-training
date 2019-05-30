<%-- 
    Document   : Calculator
    Created on : May 29, 2019, 3:51:11 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <center> <body bgcolor="cyan">
            
  
           <%
               String s=request.getParameter("op");
               String val1=(String)request.getParameter("val1");
               String val2=(String)request.getParameter("val2");
               int a=0;
               if(s.equals("+"))
                   a=Integer.parseInt(val1)+Integer.parseInt(val2);
               else if(s.equals("-"))
                   a=Integer.parseInt(val1)-Integer.parseInt(val2);
               else if(s.equals("*"))
                   a=Integer.parseInt(val1)*Integer.parseInt(val2);
               else if(s.equals("/"))
                   a=Integer.parseInt(val1)/Integer.parseInt(val2);
               %>
               <%=
                   a
                           %>
               
    </body>
</html>
