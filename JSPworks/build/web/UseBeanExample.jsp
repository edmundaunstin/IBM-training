<%@page import="JavaPrograms.JavaBeanClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Details of Employee..</h1>
	
	<%
	JavaBeanClass be = (JavaBeanClass)request.getAttribute("employee");
	%>
	E ID : <%= be.getEmpId() %><br/>
	Name : <%= be.getEmpName() %><br/>
	Dept : <%= be.getEmpDept() %><br/>
	Deg : <%= be.getEmpDeg() %><br/>    
        
 ----------------------------------------------------------------
 <jsp:useBean id="Employee" class="JavaPrograms.JavaBeanClass" scope="request"></jsp:useBean>
     <jsp:getProperty property="empId" name="Employee"></jsp:getProperty><br>
     <jsp:getProperty property="empName" name="Employee"></jsp:getProperty><br>
     <jsp:getProperty property="empDept" name="Employee"></jsp:getProperty><br>
     <jsp:getProperty property="empDeg" name="Employee"></jsp:getProperty><br>
 
 ------------------------------------------------------------------
 Emp ID : ${Employee . empId}<br>
 Emp Name : ${Employee . empName}<br>
 Emp Dept : ${Employee . empDept}<br>
 Emp Deg : ${Employee . empDeg}<br>
</body>
</html>
