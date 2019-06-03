<%-- 
    Document   : CDPage
    Created on : May 30, 2019, 3:56:43 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center><body bgcolor="lightred">
            <%
                String list[]=new String[5];
                list =request.getParameterValues("book");
                session.setAttribute("sss", list);
                
               
                
 
                %>
              
            
                <form action="GiftPage.jsp">
           <h1> <input type="checkbox"  name="cd">MOVIES<br>
           <h1> <input type="checkbox"  name="cd">GAME<br>
            <h1><input type="checkbox"  name="cd">MUSIC<br>
           <h1> <input type="checkbox"  name="cd">SERIES<br>
           <h1> <input type="checkbox"  name="cd">SOFTWARE<br>

            <input type="submit" value="NEXT" name="next"><br>
        </form>
    </body>
</html>
