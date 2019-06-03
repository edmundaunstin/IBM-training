<%-- 
    Document   : GiftPage
    Created on : May 30, 2019, 3:58:35 PM
    Author     : Home
--%>
<%@page include = "java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center><body bgcolor="lightyellow">
            
             <%
                String q[]=(String[])session.getAttribute("sss");
                
                String list[];
                list =request.getParameterValues("cd");
                
                String[] sss=q.addAll(list); 
                                                                                                                                                                                                                                                     %>
            
            
            
        <form action="ComputerPage.jsp">
           <h1> <input type="checkbox"  name="gift">TOYS<br>
           <h1> <input type="checkbox"  name="gift">BOOKS<br>
            <h1><input type="checkbox"  name="gift">CUPS<br>
           <h1> <input type="checkbox"  name="gift">PHOTO FRAMES<br>
           
            
            <input type="submit" value="NEXT" name="next"><br>
        </form>
    </body>
</html>
