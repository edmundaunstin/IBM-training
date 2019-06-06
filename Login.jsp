<%-- 
    Document   : Login
    Created on : May 29, 2019, 2:58:51 PM
    Author     : Home
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
               String user=request.getParameter("username");
               String pass=request.getParameter("pass");
               String str="WRONG ENTRY";
               
               
               if(s.equals(user)&& p.equals(pass)){
                   
                    str="WELCOME    " + user;
                  }  
               %>
            <h1>   <%=
                   str
                           %><br>
                           
                            <sql:setDataSource
	var="dbconnection"
	driver="oracle.jdbc.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe"
	user="hr"
	password="hr"/>
	<h1>Connected Successfully</h1>
                               
                              
        
                                           
                                           
                   <sql:query dataSource="${dbconnection}" var="rs">
                         select * from employees
                    </sql:query>
    
    <table border="1">
        <c:forEach var="row" items="${rs.rows}">
                   <tr>
                       <td> <c:out value="${row.employee_id}"/></td>
                       <td> <c:out value="${row.first_name}"/></td>
                       <td> <c:out value="${row.last_name}"/></td>
                       <td> <c:out value="${row.email}"/></td>
                       <td> <c:out value="${row.phone_number}"/></td>
                       <td> <c:out value="${row.hire_date}"/></td>
                       <td> <c:out value="${row.job_id}"/></td>
                       <td> <c:out value="${row.commission_pct}"/></td>
                       <td> <c:out value="${row.manager_id}"/></td>
                       <td> <c:out value="${row.department_id}"/></td>
                       </tr>
        </c:forEach>>
    </table>
    </body>
</html>
