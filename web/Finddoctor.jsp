<%-- 
    Document   : Finddoctor.jsp
    Created on : Mar 17, 2020, 9:25:51 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="style.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Find Doctor</title>
  <!-- code for search panel box -->
  <style type="text/css">
    .login-box {
  width: 400px;
  height: 500px;
  position: absolute;
  overflow: hidden;
  top: 50%;
  left: 50%;
  transform: translate(-120%,-30%);
  color: white;
  box-sizing: border-box;
  background: rgba(0,0,0,0.5);
  padding: 40px;
}
 h2 {
  margin: 0;
  padding: 0 0 20px;
  font-weight: bold;
  color: #ffffff;
/*  float: left;
  font-size: 40px;
  border-bottom: 6px solid #4caf50;
  margin-bottom: 50px;
  padding: 13px 0; */
}
.login-box p{
  margin: 20;
  padding: 20;
  font-weight: bold;
  color: #ffffff;
  /*  width: 100%;
  overflow: hidden;
  font-size: 20px;
  padding: 8px 0;
  margin: 8px 0;
  border-bottom: 1px solid #4caf50;  */
}
.login-box input,select{
  margin-bottom: 20px;
  width: 100%;
  /*
  width: 26px;
  float: left;
  text-align: center; */
}
.login-box input[type=text],
.login-box input[type=password]
{
  border: none;
  border-bottom: 1px solid #ffffff;
  background-color: transparent;
  outline: none;
  height: 40px;
  color: #ffffff;
  display: 16px;
}
::placeholder{
  color: #ffffff;
}
.login-box select
{
  margin-top: 20px;
  padding:  10px 0;
}
.login-box input[type=submit]
{
  border: none;
  height:  40px;
  outline: none;
  color: #fff;
  font-size: 15px;
  background-color: tomato;
  cursor: pointer;
  border-radius: 20px;
}
.login-box input[type=submit]:hover{
  background-color: cyan;
  color: #ffffff;
} 
.login-box a
{
  color: #ffffff;
  text-decoration: none;
  font-size: 14px;
    font-weight: bold;

}
  </style>
 <!-- style for Card -->
  <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  font-size:  18px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #4d94ff;
  color: red;
  padding: 12px 20px;
  border: none;
  border-radius: 20px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: white;
}
::placeholder{
  color: red;
}
.container {
  border-radius: 5px;
  background-color: red;
  padding: 20px;
}
.column {
  margin-top: 20px;
  float: left;
  width: 50%;
  padding: 10px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

</style> 
</head>
<body style="background-image: url(2.jpg); background-size: cover;">
	  <div id="container" style="margin-top: 0px;">
             	<ul>
                <li>Home</li>
             		<li>About us 
                          <ul>
                          	<li>Introduction</li>
                          	<li>The Founder</li>
                          	<li>Mission & Vission</li>
                          </ul>
             		</li>
             		
             		<li>Appointments
                                 <ul>
                                 	<li><a href="BookAppointment.html"> Book Appointment</a></li>
                                 	<li><a href=""> Check ur Appoint</a></li>
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
             		<li><a href="Login.html"> LogIn</a></li>
             	</ul>
             </div>
 <!--body -->
<br><br><br><br>
 <div>
   <h2  style="text-align: center; color: whilte; font-size: 50px;">FIND THE RIGHT DOCTOR</h2>
 </div>
<div class="row">
<div class="column">
       <div class="login-box">
        <h2 style="font-size: 30px;">Search Doctor's</h2>

           <form action="">
             <p>Specialisation</p>
                <select id="Specialisation" name="Specialisation">
                <option value="australia">Andrology</option>
                <option value="australia">Audiology and Speech Theorapy</option>
                <option value="canada">Blood bank</option>
                <option value="usa">Cardiology</option>
                 <option value="australia">Cosmetology</option>
                <option value="australia">Dermatology</option>
                <option value="canada">ENT Surgery</option>
                <option value="usa">Gynaecology</option>
                </select>
             <p>Doctor's Name</p>
               <select id="DoctorName" name="Doctor">
                <option value="australia">Dr. Avasthi</option>
                <option value="australia">Dr. Sri Ram</option>
                <option value="canada">Dr. Abhimanyu</option>
                <option value="usa">Dr. Keshav</option>
                <option value="australia">Dr. Shyam Babu</option>
                <option value="australia">Dr. Raja Ram</option>
                <option value="canada">Dr. Akhilesh</option>
                <option value="usa">Dr. Krishna</option>
                </select>
               <br><br><br><br>
             <input type="submit" value="Search" name="">
           </form>
              
     </div>
</div>

<div class="column">

<div class="card">
  <img src="Arvind.jpg" alt="John" style="width:100%; height: 300px;">
     <h1 style="color: cyan">OPD SCHEDULE</h1>
  <table style="width: 100%;color: white">
    <tr">
      <th style="color: red">Day</th>
      <th style="color: red">Time</th>
    </tr>
    <tr>
      <td>Monday</td>
      <td>2 PM - 4 PM</td>
    </tr>
    <tr>
      <td>Tuesday</td>
      <td>2 PM - 4 PM</td>
    </tr>
    <tr>
      <td>Wednesday</td>
      <td>2 PM - 4 PM</td>
    </tr>
    <tr>
      <td>Thursday</td>
      <td>2 PM - 4 PM</td>
    </tr>
    <tr>
      <td>Friday</td>
      <td>2 PM - 4 PM</td>
    </tr>
    <tr>
      <td>Saturday</td>
      <td>2 PM - 4 PM</td>
    </tr>
  </table>
   <div class="Profile">
     <h3 style="color: cyan;">PROFILE</h3>
     <p style="color: white">Dr. Gaiwal is associated with Lilavati Hospital since 2006 with more than 15 years of experience as an anaesthsiologist</p>
     <br><br>
     <p style="color: white">She is a certified faculty for American Heart Association's CPCR</p>
   </div>
   <div class="interest">
    <h3 style="color: cyan">INTEREST</h3>
    <ul style="color: white">
      <li>paediatric Anaesthesia </li>
       <li>Acute Pain management</li>
    </ul>
  <p style="color: cyan">Harvard University</p>
  <div style="margin: 24px 0;">
    <a href="#"><i class="fa fa-dribbble"></i></a> 
    <a href="#"><i class="fa fa-twitter"></i></a>  
    <a href="#"><i class="fa fa-linkedin"></i></a>  
    <a href="#"><i class="fa fa-facebook"></i></a> 
  </div>
  <p><button>Contact</button></p>
</div>

</div>

</div>

   

</body>
</html>