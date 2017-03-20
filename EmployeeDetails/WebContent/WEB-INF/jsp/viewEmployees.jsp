<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import= "java.util.ArrayList" %>
<%@page import= "au.com.optus.dto.EmployeeBean" %>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="org.codehaus.jackson.map.ObjectMapper"%>    
    
<html>
 <head>
  <title>Employee Details</title>
 </head>
<body>
<% 
out.println((String)request.getAttribute("empList"));
%>
</body>
</html> 