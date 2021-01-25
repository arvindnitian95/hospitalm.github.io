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
        <title>Feedback connection page</title>
    </head>
    <body>
        <%
            String name= request.getParameter("name");
             String lastname=request.getParameter("lastname");
             String mobile=request.getParameter("mobile");
             String gmail=request.getParameter("gmail");
             String s =request.getParameter("comment");
             
        Connection conn=null;
        Statement st=null;
        
      try
      {
       Class.forName("com.mysql.jdbc.Driver");
       conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
       st=conn.createStatement();
         String qry= "INSERT INTO `feedback` (`fid`, `name`, `lastname` , `mobile` , `gmail` , `comment` ) VALUES (NULL , '"+name+"', '"+lastname+"', '"+mobile+"','"+gmail+"','"+s+"')";
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
