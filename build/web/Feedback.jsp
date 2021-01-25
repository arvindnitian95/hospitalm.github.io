<%-- 
    Document   : mainpage
    Created on : May 7, 2020, 9:33:44 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
<title>Feedback Form</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="style.css">
<meta name="viewport" content="width=device-width, initial-scale=1">  
<script type="text/javascript" src="sc.js"></script>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
      * {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color:#f2f2f2;
  padding: 30px;
  text-align: left;
  font-size: 35px;
  color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 30%;
  height: 300px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: #777;
  height: 300px;
  padding: 10px;
  text-align: center;
  color: white;
  margin-top: 100px;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
/* nav bar */
.h ul{
	list-style: none;
}
.h ul li{
	float: left;
	background-color: b;
	width: 144px;
	border: 0px solid white;
	border-radius: 0px;
	height: 50px;
	line-height: 50px;
	text-align: center;
    color: black;
    font-size: 20px;
    position: relative;
}
.h ul li:hover{
background-color: cyan;
visibility: visible;
        z-index: 100;
}
.h ul ul{
	display: none;
}
.h ul li:hover  > ul{
	display: block;
}
.h ul ul {
	margin-left: 0px;
	top: 48px;
position: absolute;
}
.h ul ul li{
	border: 1px solid black;
	width: 150px;
	background-color: white;
       visibility: visible;
        z-index: 100;
} 
.h ul ul ul{
    margin-left: 150px;
    top: 0px;
    position: absolute;
}

/* image slider code */
.carousel{
    background: #2f4357;
    margin-top: 0px;
}
.carousel-item{
    text-align: center;
    min-height: 280px; /* Prevent carousel from being distorted if for some reason image doesn't load */
    height: 410px;
  }
.bs-example{
  margin: 0px;
  width: 970px;
  margin-left: -30px;
}

/*  text blinking */

/*Be sure to look into browser prefixes for keyframes and annimations*/
.flash {
   animation-name: flash;
    animation-duration: 0.4s;
    animation-timing-function: linear;
    animation-iteration-count: infinite;
    animation-direction: alternate;
    animation-play-state: running;
}

@keyframes flash {
    from {color: red;}
    to {color: blue;}

}
.s{
  height: 2px;
 background-color: gray;
  width: 400px;
}


/* News Slider Code */
#slider,  #slider .slide{
  width: 400px;
  height: 360px;

}
#slider {
  overflow: hidden;
  margin: 0 auto;
  font-size: 1.2em;
  background: white;
   border-bottom: 2px solid black;
}
#slider .container {
  position: relative;
  bottom: 0;
  right: 0;
  animation: slide-animation 20s infinite;
}
#slider .slide {
  position: relative;
  box-sizing: border-box;
  padding: 10px 20px;
}

/* [ANIMATION] */
@keyframes slide-animation {
  0% { 
    opacity: 0;
    bottom: 0;
  }
  11% {
    opacity: 1;
    bottom: 0; 
  }
  22% { bottom: 100%; }
  33% { bottom: 100%; }
  44% { bottom: 200%; }
  55% { bottom: 200%; }
  66% { bottom: 300%; }
  77% { bottom: 300%; }
  88% {
    opacity: 1;
    bottom: 400%; 
  }
  100% {
    opacity: 0;
    bottom: 400%;
  }
}

/* [DOES NOT MATTER] */
html, body {
  font-family: arial;
  background: white;
}
h1 {
  text-align: center;
  font-weight: bold;
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
.c{
  width: 33.33%;
}

  </style>
</head>
<body>
<header>
	<div style*="width: 350px; color: black; margin-top: 0px;"> <h2  style="margin-left: 80px;margin-top: -20px; color:red;  "><strong style="font-size: 50px;" > S S</strong> <br> Hospital</h2></div>
	<div style="width: 850px; float: right; margin-top:0px"> 
    
     		<h6 style="color: black; margin-top: -100px;font-size: 20px;font-weight: bold;margin-left: -70px">Shiv Shakti Hospital Gohan Jalaun U.P-285123</h6>
     		<h6 style="margin-top: 0px; color: black;font-size: 20px;font-weight: bold;margin-left: -70px">शिव शक्ति अस्पताल गोहन जालौन,उत्तर प्रदेश-285123</h6>
     		<div class="h">
     		 	<ul style="margin-top: 0px; margin-left:-200px" >
                            <li><a href="index.jsp">Home</a> </li>
     		 		<li>Patient
                        <ul>
                            <li><a href="Finddoctor.jsp"> Find doctor </a></li>
                            <li><a href="Feedback.jsp"> Feedback</a> </li>
                           <li>Rights</li>
                           <li>Photo Gallery</li>
                           <li>Appointment
                               <ul>
                                   <li><a href="BookAppoint.jsp"> Book</a> </li>
                                   <li><a href="SearchAppoint.jsp"> Check</a> </li>
                               </ul>
                           </li>
                        </ul>   
     		 		</li>
                                <li><a href="Aboutus.html"> About us </a> </li>
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
     		 		<li> Department
     		 			<ul>
                                            <li> Medicine
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
     		 		<li> Contact us</li>
                                <li><a href="login.jsp"> Log In</a> </li>
     		 	</ul> 
     		 </div>  
	</div>
	<div style="height: 2px; width: 105%; background-color: black; margin-left: -35px;margin-top: 40px"></div>
	<!-- code for 1st nav bar -->
                        <div class="onoffswitch3" style="width: 105%; height: 20px;margin-left: -30px; margin-top: -10px">
                                 
                                  <label class="onoffswitch3-label" for="myonoffswitch3">
                                   <span class="onoffswitch3-inner">
                                  <span class="onoffswitch3-active">
                                  <marquee class="scroll-text" style="font-size: 20px;color: red; margin-top: 0px"> <span class="flash">Important:</span>   Infinity War's Iron Spider Suit May Use Bleeding Edge Tech  <span class="glyphicon glyphicon-forward" style="color: blue"></span> Russo brothers ask for fans not to spoil Important: Infinity War <span class="glyphicon glyphicon-forward" style="color: blue"></span>  Bucky's Arm Miraculously Regenerates On Important: Infinity War Poster</marquee>
                                  <!-- <span class="onoffswitch3-switch"><span class="glyphicon glyphicon-remove"></span></span> -->
                                 <!-- </span>
                                   <span class="onoffswitch3-inactive"><span class="onoffswitch3-switch"></span></span>
                                  </span>
                                 </label> -->
                        </div>
</header>
<section>
  <nav>
  	<h3 style="margin-top: -10px; text-align: center;">Follow On</h3>
<div id="slider" style="margin-left: -20px">
      <div class="container">
        <div class="slide">
          <h3>Facebook</h3>
         <span class="flash">New</span> <p>
             <a href="https://www.facebook.com/profile.php?id=100006448387819">facebook</a> 
          </p><div class="s"></div>
        <span class="flash">New</span>  <p>All Classes and Examination shall Remain Suspended Till 31st March</p> <div class="s"></div>
         <span class="flash">New</span> <p>Notice Regarding Corona Virus (Covid-19)</p><div class="s"></div>
        </div>
        <div class="slide">
          <h3>Twitter</h3>
         <span class="flash">New</span> <p>
             COVID-19 Tracker | India
             <a href="https://www.covid19india.org/">https://www.covid19india.org/ </a>
          </p>
        </div>
        <div class="slide">
          <h3>LinkedIn</h3>
        <p class="flash">New</p>  <p>
            <a href="https://www.linkedin.com/in/arvind-kumar-041527194">linkedin</a> 
          </p>
        </div>
        <div class="slide">
          <h3>Instagram</h3>
         <p class="flash">New</p> <p>
             <a href="https://www.instagram.com/aarvindkushwaha95/">Instagram</a>
          </p>
        </div>
        <div class="slide">
          <h3>Telegram</h3>
        <p class="flash">New</p>  <p>
            The suspected book hums opposite the unacceptable urge. The warning goodbye searches the substitute. 
          </p>
        </div>
      </div>
    </div>

  </nav>
  
  <article>
      <form action="Feedbackconn.jsp" method="get" >
          <h3 style="text-align:center">Your Feedback</h3>
   <div class="row">
<div class="column">
  <form action="Appointconn.jsp" method="get">
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="name"  placeholder="Enter First Name"><br><br>
        
    <label for="fname">Last Name</label>
    <input type="text"  name="lastname" placeholder="Enter Last Name"><br><br>
    
    <label for="fname">Contact</label>
    <input type="text"  name="mobile" placeholder="Enter Mobile Number"><br><br>
    
     <label for="fname">Gmail Id</label>
    <input type="gmail"  name="gmail" placeholder="Enter Gmail id">

</div>
       
<div class="column">
    
    <label for="comment">Comments</label>
    <textarea id="comment" name="comment" placeholder="Write something.." style="height:200px"></textarea>
    <input type="Submit" style="width: 400px; margin-left: -150px;">
  </form>
</div>

</div>

  </article>
</section>






<footer>
	<div style="width: 1350px; margin-top: 100px; height: 250px">
     <div class="row">
     	<div class="c" style="width: 33.33%">
     		<ul> 
     			<h1 style="font-weight: bold;color: blue ">S S Hospital</h1>
     			<p>Shiv Shakti Hospital</p>
     			<p>Gohan ,jalaun,Uttar-pradesh-285123</p>
     			<p>Contact No. 9098260397</p>
     			<p>Arvindmca95@gmail.com</p>
     		</ul>
     	</div>
     	<div class="c" style="width: 33.33%">
     		<ul>
     			<h3>About us</h3>
     			<p>Gallery</p>
     			<p>Library</p>
     			<p>Department</p>
     			<p>Event Calender</p>
     		</ul>
     	</div>
     	<div class="c" style="width: 33.33%">
     		<ul>
     			<h3>Contact Us</h3>
     			<p>Patient Corner</p>
     			<p>Courses</p>
     			<p>Fee Structure</p>
     		</ul>
     	</div>
     </div>
 </div>
</footer>

<div style="background-color: black;height: 60px;width: 1350px;margin-top: -20px">
	<h3 style="color: white;text-align: center;">Copyright@2020 | Developed by Arvind Kumar </h3>
</div>

</body>
</html>