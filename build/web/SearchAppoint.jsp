<%-- 
    Document   : SearchAppoint
    Created on : Mar 14, 2020, 6:34:27 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  	<meta charset="utf-8">
	<title>Search Appointment</title>
	<link rel="stylesheet" type="text/css" href="style.css">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">

  </head>
    <body style="background-image: url(d1.jpg); background-size: cover;">
<!-- code for 1st nav bar -->
                        <div class="onoffswitch3" style="background-color:  #33ffd6; width: 100%; height: 40px;">
                                 
                                  <label class="onoffswitch3-label" for="myonoffswitch3">
                                   <span class="onoffswitch3-inner">
                                  <span class="onoffswitch3-active">
                                  <marquee class="scroll-text" style="font-size: 20px" >Avengers: Infinity War's Iron Spider Suit May Use Bleeding Edge Tech  <span class="glyphicon glyphicon-forward" style="color: red"></span> Russo brothers ask for fans not to spoil Avengers: Infinity War <span class="glyphicon glyphicon-forward" style="color: red" ></span>  Bucky's Arm Miraculously Regenerates On Avengers: Infinity War Poster</marquee>
                        </div>

<!-- Code for 2nd Nav Bar -->
            <div id="container" style="margin-top: -10px;">
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
                                     <li><a href="SearchAppoint.jsp"> Search Appoint</a> </li>
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


 <div class="login-box" style="margin-top: 60px">
        <h2>Search Appointment</h2>

           <form method="post" name="frm" action="Appointregister">
             <p>Appointment Id</p>
             <input type="text"  name="id" placeholder="Appointment Id">
             <p>Mobile Number</p>
             <input type="Password"  name="mob" placeholder="Mobile Number">
             <br></br>
             <br>
             <input type="submit" value="Search" name="">
             <br>
             <p><a href="#"> Forgot Appointment Id</a></p>
           </form>
              
     </div>
   </body>
</html>
