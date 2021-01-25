<%-- 
    Document   : BookAppoint
    Created on : Mar 14, 2020, 6:03:41 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta charset="utf-8">
	<title>Book Appointment</title>
	<link rel="stylesheet" type="text/css" href="style.css">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
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
    	      <div id="container" style="margin-top: -20px;">
              <ul>
                <li><a href="index.html"> HOME</a></li>
                <li><a href="Aboutus.html"> About us</a></li>
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
                                  <li><a href="BookAppoint.jsp">Book Appointment</a></li>
                                  <li><a href="SearchAppoint.jsp" >Search Appoint</a> </li>
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


<h3 style="text-align: center;color: #ff0000; font-size: 40px;">Book An Appointment</h3>
<div class="row">
<div class="column">
  <form action="Appointconn.jsp" method="get">
    <label for="fname">Patient Name</label>
    <input type="text" id="fname" name="firstname"  placeholder="Enter First Name">
     <label for="fname">Last Name</label>
    <input type="text"  name="lastname" placeholder="Enter Last Name">

    <label for="lname">Father Name</label>
    <input type="text"  name="fname" placeholder="Enter Father Name">
    <label for="lname">Mobile Number</label>
    <input type="text"  name="mobile" placeholder="Enter Mobile Number">

    <label for="gender">Gender</label>
    <select  name="gender">
      <option name="gender">Male</option>
      <option name="gender">Female</option>
      <option name="gender">Transgender</option>
    </select>
     <label for="docmentor">Doctor</label>
    <select id="country" name="docmentor">
      <option name="docmentor">Dr. Abhinav</option>
      <option name="docmentor">Dr. khurana </option>
      <option name="docmentor">Dr. Sushil</option>
      <option name="docmentor">Dr. Akhilesh</option>
    </select>
</div>

<div class="column">
    <label for="city">City</label>
    <input type="text"  name="city" value="City" placeholder="Enter City">
     <label for="lname">District</label>
    <input type="text" name="district" placeholder="Enter District">
    <label for="lname">State</label>
    <input type="text"  name="state" placeholder="Enter State">
    <label for="country">Country</label>
    <select  name="country">
      <option name="country">India</option>
      <option name="country">Australia</option>
      <option name="country">Canada</option>
      <option name="country">USA</option>
    </select>
    <label for="date_of_appoint">Date of Appointment</label>
    <input type="Date" name="date_of_appoint" placeholder="Date">
    <br>
    <label for="subject">Subject</label>
    <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
    <input type="Submit" style="width: 400px; margin-left: 33.33%;">
  </form>
</div>

</div>

   </body>
</html>
