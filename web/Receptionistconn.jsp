<%-- 
    Document   : data
    Created on : Mar 12, 2020, 6:48:31 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nurse detail Page</title>
    </head>
    <body>
        <%
            String name= request.getParameter("firstname");
             String lastname=request.getParameter("lastname");
             String mobile=request.getParameter("mobile");
             String gender=request.getParameter("gender");
             String gmail=request.getParameter("gmail");
             String city=request.getParameter("city");
             String district=request.getParameter("district");
             String state=request.getParameter("state");
             String country=request.getParameter("country");
              String dob= request.getParameter("dob");
             
        Connection conn=null;
        Statement st=null;
        
      try
      {
       Class.forName("com.mysql.jdbc.Driver");
       conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
       st=conn.createStatement();
          String qry= "INSERT INTO `receptionist` (`rid`, `name`, `lastname` ,`mobile` , `gender` , `gmail` , `city` , `district` , `state` , `country` , `dob`) VALUES (NULL , '"+name+"', '"+lastname+"', '"+mobile+"','"+gender+"','"+gmail+"','"+city+"','"+district+"','"+state+"','"+country+"','"+dob+"')";
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
