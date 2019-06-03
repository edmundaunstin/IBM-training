<%-- 
    Document   : DataBaseInsertion
    Created on : Jun 3, 2019, 10:20:12 AM
    Author     : Home
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="dbconnection" driver="oracle.jdbc.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe" user="hr" password="hr"/> 
	<sql:update dataSource="${dbconnection}" var="c">
	INSERT INTO employees
	(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
    values(300,'Tommy','VC','HF','616161616','7-NOV-2017','IT_PROG',2000.0,0.5,103,60)
    </sql:update>
    <h1>Inserted new Record</h1>
    </body>
</html>
