<%-- 
    Document   : Registrationconn
    Created on : Mar 16, 2020, 10:57:40 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
<%-- 
    Document   : data
    Created on : Mar 12, 2020, 6:48:31 PM
    Author     : hp
--%>


<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name= request.getParameter("name");
             String password=request.getParameter("pass");
             String gmail=request.getParameter("gmail");
             String usertype=request.getParameter("usertype");
             
        Connection conn=null;
        Statement st=null;
        
      try
      {
       Class.forName("com.mysql.jdbc.Driver");
       conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
       st=conn.createStatement();
          String qry= "INSERT INTO `userdetail` (`uid`, `name`, `password` ,`gmail` , `usertype`) VALUES (NULL , '"+name+"', '"+password+"', '"+gmail+"','"+usertype+"')";
       st.executeUpdate(qry);
       
       out.print("Data is Successfully inserted");
      }
      catch(Exception ex)
      {
      out.print(ex.getMessage());
      }
            %>
    </body>
</html>
