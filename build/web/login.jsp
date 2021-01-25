<%-- 
    Document   : login
    Created on : Mar 14, 2020, 2:49:11 PM
    Author     : hp
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
  	<meta charset="utf-8">
	<title>Login Form</title>
	<link rel="stylesheet" type="text/css" href="style.css">
    <style type="text/css">
*{
  margin: 0px;
  padding: 0px;
}
#container ul{
  list-style: none;

}   
#container ul li{
  background-color:#a6a6a6;
  width: 149px;
  border: 1px solid white;
  height: 50px;
  line-height: 50px;
  text-align: center;
  float: left;
    color: black;
    font-size: 20px;
    position: relative;
}
#container ul li:hover{
  background-color: cyan;
}
#container ul ul {
  display: none;
}
#container ul li:hover > ul{
  display: block;
}
#container ul ul ul{
  margin-left: 150px;
  top: 0px;
position: absolute;
}
#container ul ul li{
    visibility: visible;
z-index: 100;
}
</style>
<!-- this code for No Back button work After logout -->
<script>
    history.pushState(null, null, null);
    window.addEventListener('popstate', function () {
        history.pushState(null, null, null);
    });
</script>
  </head>
    <body class="bd">
    	    <!--  Body -->
            <div id="container" style="margin-top: 0px;">
              <ul>
                  <li><a href="index.jsp" style="color:black"> HOME</a> </li>
                  <li><a href="Aboutus.html" style="color:black"> About us</a> </li>
                <li>Facilities
                                <ul>
                                  <li>Health CheckUp
                                                    <ul>
                                                      <li>Basic Package</li>
                                                      <li>Cardiac Package</li>
                                                      <li>Comprehensive</li>
                                                      <li>Super Package</li>
                                                      <li>Women Special</li>
                                                    </ul> 
                                  </li>
                                  <li>Intensive Care
                                                    <ul>
                                                      <li>ICCU</li>
                                                      <li>ICU</li>
                                                      <li>Neonatal ICU</li>
                                                      <li>Paediatric ICU</li>
                                                    </ul>
                                  </li>
                                  <li>OT Comlexes</li>
                                  <li>Wards
                                             <ul>
                                              <li>General Ward</li>
                                              <li>Semi Private Ward</li>
                                              <li>Private Ward</li>
                                              <li>Deluxe Room</li>
                                              <li>Super Delux</li>
                                             </ul>
                                  </li>
                                  <li>Diadnostic Wing
                                                    <ul>
                                                      <li>Pathology</li>
                                                        <li>Colposcopy</li> 
                                                       <li>Radiology</li>
                                                    </ul>
                                  </li>
                                  <li>EEG</li>
                                  <li>Obesity & Pain clinic</li>
                                  <li>Pharmacy</li>
                                  <li>Ambulance</li>
                                </ul>
                </li>
                <li>Pateint
                               <ul>
                                   <li>Empannelled Insurance</li>
                                   <li><a href="finddoctor.html" style="color:black">Find Doctor</a> </li>
                                    <li>Feedback</li>
                                    <li>Rights & Responsibility</li>
                               </ul>
                </li>
                <li>Appointments
                                 <ul>
                                     <li><a href="BookAppoint.jsp" style="color:black"> Book Appointment</a> </li>
                                     <li><a href="SearchAppoint.jsp" style="color:black">Search Appoint</a> </li>
                                 </ul>
                    </li>
                     <li>Contact Us</li>
                <li>Academics
                                <ul>
                                   <li>Careers</li>
                                   <li>CME</li>
                                   <li>DNB</li>
                                   <li>LHMT</li>
                                   <li>MUHS Fellowship</li>
                                   <li>Nurses</li>
                                   <li>Research</li>
                                </ul>
                </li>
                <li>Department
                                <ul>
                                  <li>Medicine
                                        <ul>
                                          <li>Internal Medicine</li>
                                          <li>Endocrinology / Diabetes</li>
                                          <li>Gastroenterology</li>
                                          <li>Oncology</li>
                                          <li>Nephrology</li>
                                          <li>Psychiatry</li>
                                          <li>Cardiology</li>
                                          <li>Neurology</li>
                                          <li>Dermatology</li>
                                        </ul>
                                  </li>
                                  <li>Surgical
                                          <ul>
                                            <li>Plastic & Microvascular Surgery</li>
                                            <li>General Surgery</li>
                                            <li>Laparoscopic Surgery</li>
                                            <li>Urosurgery</li>
                                            <li>Onco Surgery</li>
                                            <li>Dentistry</li>
                                            <li>ENT</li>
                                            <li>Ophthalmic</li>
                                            <li>Orthopaedics</li>
                                            <li>Pediatrics</li>
                                            <li>Obstetrics & Gynecology</li>
                                          </ul>
                                  </li>
                                </ul>
                </li>
              </ul>
             </div>
                    
          
<!--  Log In Form  -->
<%
 
Connection con= null;
PreparedStatement ps = null;
ResultSet rs = null;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/hospital";
String user = "root";
String password = "";

String sql = "select usertype from userdetail";

try {
Class.forName(driverName);
con = DriverManager.getConnection(url, user, password);
ps = con.prepareStatement(sql);
rs = ps.executeQuery(); 
%>
      <div class="login-box">
      	<h2>Login Form</h2>

        <form action="logincontroller.jsp" method="GET">
             <p>Name</p>
             <input type="text" id="" name="name" placeholder="enter your Email">
             <p>Password</p>
             <input type="Password" id="" name="password" placeholder="enter your Password">
             
             <p>Select UserType</p>
             <p><select name="usertype">
             <option value="select">select</option>
             <%
             while(rs.next())
              {
                String usertype = rs.getString("usertype");
                %>
                <option value=<%=usertype%>><%=usertype%></option>
               <% 
               }
                }
            catch(SQLException sqe)
            {
             out.println("home"+sqe);
             }
            %>
               </select>
                </p>
            
             <p></p>
             <input type="submit" value="Sign In">
             <a href="#">Forgot Password</a>
           </form>
         
     </div>
   </body>
</html>
