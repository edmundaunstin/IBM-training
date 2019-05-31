<%-- 
    Document   : UseBean_SetProperty
    Created on : May 30, 2019, 2:59:50 PM
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
        
        <jsp:useBean id="Employee" class="JavaPrograms.JavaBeanClass" scope="request"></jsp:useBean>
     <jsp:setProperty property="empId" value="123" name="Employee"></jsp:setProperty>
     <jsp:setProperty property="empName" value="Aunstin" name="Employee"></jsp:setProperty>
     <jsp:setProperty property="empDept" value="CSE" name="Employee"></jsp:setProperty>
     <jsp:setProperty property="empDeg" value="Manager" name="Employee"></jsp:setProperty>
    </body>
</html>
