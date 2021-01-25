<%-- 
    Document   : adminlogout
    Created on : Mar 16, 2020, 1:27:43 AM
    Author     : hp
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="backnowork.js" type="text/javascript"></script>
<title>Logout</title>
</head>
<body> 
      
  
    <%
        String redirectURL = "login.jsp";
        response.sendRedirect(redirectURL);
    %>
</body>
</html>