<%-- 
    Document   : Registeruser
    Created on : Mar 16, 2020, 10:41:38 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
  	<meta charset="utf-8">
	<title>Registration Form</title>
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
</style>
  </head>
    <body class="bd">
    	    <!--  Body -->
            <div id="container" style="margin-top: 0px;">
              <ul>
                <li>HOME</li>
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
                                  <li>Book Appointment</li>
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
                <li>LogIn</li>
              </ul>
             </div>
                    
          
<!--  Log In Form  -->
      <div class="login-box" style="margin-top: 40px;">
      	<h2>Registeration Form</h2>

        <form action="Registrationconn.jsp" method="get">
             <p>UserName</p>
             <input type="text" id="" name="name" placeholder="enter your Email">
             <p>Password</p>
             <input type="Password" id="" name="pass" placeholder="enter your Password">
             <p>Gmail id</p>
             <input type="text" id="" name="gmail" placeholder="enter your Gmail id">
             <p>User Type</p>
             <select name="usertype">
             <option name="usertype">Admin</option> 
             <option name="usertype">Receptionist</option>
              </select>
          
             <input type="submit" value="Register" name="">
             <a href="#">Forgot Password</a>
           </form>
              
     </div>
   </body>
</html>
