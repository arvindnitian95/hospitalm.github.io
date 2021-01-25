<%-- 
    Document   : showappointment
    Created on : Mar 15, 2020, 2:21:57 AM
    Author     : hp
--%>
<%@page import="java.util.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
   <!-- link and style for News sliding -->

  <!-- code for  All   -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script src="jquery-latest.pack.js" type="text/javascript"></script>
<script src="jcarousellite_1.0.1c4.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="style.css">
  <!-- image slider -->
   <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<title>Show Appointment</title>
        <style>
table, td, th {
  border: 1px solid black;
}
#table2 {
  border-collapse: collapse;
}
</style>

</head>
<body style="background-image: url(.jpg); background-size: cover;">  
                       <!-- code for 1st nav bar -->
                        <div class="onoffswitch3" style="background-color:  #33ffd6; width: 100%; height: 40px;">
                                 
                                  <label class="onoffswitch3-label" for="myonoffswitch3">
                                   <span class="onoffswitch3-inner">
                                  <span class="onoffswitch3-active">
                                  <marquee class="scroll-text" style="font-size: 20px">Avengers: Infinity War's Iron Spider Suit May Use Bleeding Edge Tech  <span class="glyphicon glyphicon-forward" style="color: red"></span> Russo brothers ask for fans not to spoil Avengers: Infinity War <span class="glyphicon glyphicon-forward" style="color: red"></span>  Bucky's Arm Miraculously Regenerates On Avengers: Infinity War Poster</marquee>
                                  <!-- <span class="onoffswitch3-switch"><span class="glyphicon glyphicon-remove"></span></span> -->
                                 <!-- </span>
                                   <span class="onoffswitch3-inactive"><span class="onoffswitch3-switch"></span></span>
                                  </span>
                                 </label> -->
                        </div>

 <!-- code for 2nd Nav bar -->                       
             <div id="container" style="margin-top: -10px;">
             	<ul>
             		<li>About us 
                          <ul>
                          	<li>Introduction</li>
                          	<li>The Founder</li>
                          	<li>Mission & Vission</li>
                          	<li>Charity Work</li>
                          	<li>Board of Trustees</li>
                          	<li>Management</li>
                          	<li>Awards & Accreditations</li>
                          	<li>Media/Press</li>
                          </ul>
             		</li>
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
                                	<li>Wards
                                             <ul>
                                             	<li>General Ward</li>
                                             	<li>ICU Ward</li>
                                              <li>OT</li>
                                             </ul>
                                	</li>
                                	<li>Diadnostic Wing
                                                    <ul>
                                                    	<li>Pathology</li>
                                                        <li>Colposcopy</li> 
                                                    	 <li>Radiology</li>
                                                    </ul>
                                	</li>
                                	<li>TMT</li>
                                	<li>EEG</li>
                                	<li>Physiotheraphy & Rehab</li>
                                	<li>Obesity & Pain clinic</li>
                                	<li>Pharmacy</li>
                                	<li>Ambulance</li>
                                </ul>
             		</li>
             		<li>Pateint
                               <ul>
                               	    <li>Accommodation</li>
                               	    <li>Find Doctor</li>
                               	    <li>Inpatients</li>
                               	    <li>Patient Edu. Broucher</li>
                               	    <li>Empanelled Corporates</li>
                               	    <li>Feedback</li>
                               	    <li>Rights </li>
                               </ul>
             		</li>
             		<li>Appointments
                                 <ul>
                                 	<li><a href="BookAppointment.html"> Book Appointment</a></li>
                                 	<li><a href=""> Check Appoint</a></li>
                                 </ul>
                    </li>
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
             		<li>Contact Us</li>
                        <li><a href="login.jsp"> LogIn</a></li>
             	</ul>
             </div>

<!-- Here code News Slider  -->
<br><br><br><br>
<table  id="table2" width="98%" align="center" style="border:2px solid #000000;">
<tr>
<td colspan=13 align="center"
style="background-color:ffeeff">
<h1 style="color:blue; text-align: center;font-weight:bold; ">Appointment Record</h1></td>
</tr>
<tr style="background-color:efefef;" border: 2px; >
<td><b>Patient Id</b></td>
<td><b>Patient Name</b></td>
<td><b>Last name</b></td>
<td><b>FatherName</b></td>
<td><b>Mobile</b></td>
<td><b>Gender</b></td>
<td><b>Doctor Name</b></td>
<td><b>City</b></td>
<td><b>District</b></td>
<td><b>State</b></td>
<td><b>Country</b></td>
<td><b>Date</b></td>
<td><b>Subject</b></td>

</tr>
<%
int count=0;
String color = "#F9EBB3";


if(request.getAttribute("empList")!=null)
{
ArrayList al = (ArrayList)request.getAttribute("empList");
Iterator itr = al.iterator();


while(itr.hasNext()){

if((count%2)==0){
color = "#eeffee";
}
else{
color = "#F9EBB3";
}
count++;
ArrayList empList = (ArrayList)itr.next();
%>
<tr style="background-color:<%=color%>;">
<td><%=empList.get(0)%></td>
<td><%=empList.get(1)%></td>
<td><%=empList.get(2)%></td>
<td><%=empList.get(3)%></td>
<td><%=empList.get(4)%></td>
<td><%=empList.get(5)%></td>
<td><%=empList.get(6)%></td>
<td><%=empList.get(7)%></td>
<td><%=empList.get(8)%></td>
<td><%=empList.get(9)%></td>
<td><%=empList.get(10)%></td>
<td><%=empList.get(11)%></td>
<td><%=empList.get(12)%></td>
</tr>
<%
}
}
%>
<%
if(count==0){
%>
<tr>
<td colspan=8 align="center"
style="background-color:eeffee"><b>No Record</b></td>
</tr>
<%
}
%>
</table>
     

</body>
</html>