<%-- 
    Document   : ComputerPage
    Created on : May 30, 2019, 4:01:01 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <<center><body bgcolor="lightgreen">
            
            <%
                String list[]=new String[5];
                list =request.getParameterValues("gift");
                
              //  session.setAttribute("ShoppingList", list);

                %>
            
            
        <form action="BackGroundJSP.jsp">
           <h1> <input type="checkbox"  name="computer">LAPTOPS<br>
           <h1> <input type="checkbox"  name="computer">DESKTOP<br>
            <h1><input type="checkbox"  name="computer">CPU<br>
           <h1> <input type="checkbox"  name="computer">PENDRIVE<br>
           <h1> <input type="checkbox"  name="computer">KEYBOARD<br>
            
            <input type="submit" value="NEXT" name="next"><br>
        </form>
    </body>
</html>
