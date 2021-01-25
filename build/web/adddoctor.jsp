<%-- 
    Document   : index
    Created on : Mar 12, 2020, 9:36:26 PM
    Author     : hp
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("com.mysql.jdbc.Driver");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
  	<meta charset="utf-8">
	<title>AddDoctor</title>
	<link rel="stylesheet" type="text/css" href="style.css">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 <style type="text/css">
*{
  margin: 0px;
  padding: 0px;
}
#container ul{
  list-style: none;

}   
#container ul li{
  background-color: #a6a6a6;
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
  background-color: green;
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
</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  font-size: 15px;
  padding: 10px;
  border: 2px solid #ccccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: cyan;
  color: red;
  padding: 12px 20px;
  border: none;
  border-radius: 20px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color:  cyan;
}
::placeholder{
  color: black;
  border: 5px;
}
.container {
  border-radius: 5px;
  background-color: black;
  padding: 20px;
}
.column {
  float: left;
  width: 50%;
  padding: 30px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

</style>

  </head>
    <body style="background-image: url(Bil.jpeg); background-size: cover;">
    	      <div id="container" style="margin-top: 0px;">
              <ul>
                <li><a href="index.html"> HOME</a></li>
                <li><a href=""> About us</a>
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
                                    <li>Accommodation</li>
                                    <li>Empannelled Insurance</li>
                                    <li>Find Doctor</li>
                                    <li>Inpatients</li>
                                    <li>Patient Edu. Broucher</li>
                                    <li>Tarrif</li>
                                    <li>Empanelled Corporates</li>
                                    <li>Feedback</li>
                                    <li>Floor Directory</li>
                                    <li>Rights & Responsibility</li>
                               </ul>
                </li>
                <li>Appointments
                                 <ul>
                                  <li><a href="BookAppointment.html">Book Appointment</a></li>
                                  <li>Check ur Appoint</li>
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
                <li><a href="LogIn.html">LogIn</a></li>
              </ul>
             </div>
  <!-- form Created -->


<h3 style="text-align: center;color: #ff0000; font-size: 40px;">Add Doctor</h3>
<div class="row">
 <form action="Doctorconn.jsp" method="get">
<div class="column">
        
       
    <label for="fname">Doctor Name</label>
    <input type="text" id="fname" name="firstname" value="" placeholder="Doctor Name">
     <label for="fname">Last Name</label>
    <input type="text" id="lname" name="lastname" placeholder="Doctor Last Name">

    <label for="lname">Mobile Number</label>
    <input type="text" id="Mobile" name="mobile" placeholder="Mobile Number">
    <label for="Rno">Registration Number</label>
    <input type="text" id="Rno" name="Registration" placeholder="Registration Number">

    <label for="Gender">Gender</label>
    <select id="gen" name="Gender">
      <option name="Gender">Male</option>
      <option name="Gender">Female</option>
      <option name="Gender">Transgender</option>
    </select>
     <label for="Spec">Specialisation</label>
    <select id="Spec" name="special">
      <option name="special">Dr. Abhinav</option>
      <option name="special">Dr. khurana </option>
      <option name="special">Dr. Sushil</option>
      <option name="special">Dr. Akhilesh</option>
    </select>
</div>
     
     <div class="column">   
    <label for="lname">City</label>
    <input type="text" id="lname" name="city" value="" placeholder="City">
     <label for="lname">District</label>
    <input type="text" id="lname" name="district" placeholder="District">
    <label for="lname">State</label>
    <input type="text" id="lname" name="state" placeholder="State">
    <label for="country">Country</label>
    <select id="country" name="country">
      <option name="country">India</option>
      <option name="country">Australia</option>
      <option name="country">Canada</option>
      <option name="country">USA</option>
    </select>
     <label for="DOCTYPE">Job profile Type</label>
    <select id="DOCTYPE" name="jobtype">
      <option name="jobtype">Trainee</option>
      <option name="jobtype">Permanent</option>
      <option name="jobtype">Visiting</option>
     
    </select>
    <br><br>
    <label for="country">Date of Birth</label>
    <input type="date" name="dob" placeholder="date">

</div>
     <input type="submit" value="submit" style="width: 400px; margin-left: 33.33%;" />    
 </form>

    

</div>

   </body>
</html>
