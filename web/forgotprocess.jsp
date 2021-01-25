<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%! String name; 
String password;
String usertype;
%>
<%
Connection con= null;
PreparedStatement ps = null;
ResultSet rs = null;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/hospital";
String user = "root";
String dbpsw = "";

String sql = "select * from userdetail where name=? and gmail=? and usertype=?";

String name = request.getParameter("name");
String gmail = request.getParameter("gmail");
String usertype = request.getParameter("usertype");

if((!(name.equals(null) || name.equals("")) && !(gmail.equals(null) || gmail.equals(""))) && !usertype.equals("select"))
{
try{
Class.forName(driverName);
con = DriverManager.getConnection(url, user, dbpsw);
ps = con.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, gmail);
ps.setString(3, usertype);
rs = ps.executeQuery();
if(rs.next())
{ 
    name= rs.getString("name");
gmail= rs.getString("gmail");
usertype = rs.getString("usertype");
if(name.equals(name) && gmail.equals(gmail) && usertype.equals(usertype))
{
session.setAttribute("name",name);
session.setAttribute("usertype", usertype); 
response.sendRedirect("forgotpasswordshow.jsp"); 
} 
}
else
response.sendRedirect("error.jsp");
rs.close();
ps.close(); 
}
catch(SQLException sqe)
{
out.println(sqe);
} 
}
else
{
%>
<center><p style="color:red">Error In Login</p></center>
<% 
getServletContext().getRequestDispatcher("/index.html").include(request, response);
}
%>
</body>
</html>