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
       
<title>Hospital Management</title>
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
  height: 200px;
  padding: 10px;
  text-align: center;
  color: white;
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


.row{
width: 100%;
}
.columns{
  width: 25%;
  border-right: 2px solid red;
  text-align: center;
  height: 100px;
}
.columns:hover{
  background-color: cyan;
}
.c{
  width: 33.33%;
}

  </style>
</head>
<body>
<header>
	<div style="width: 350px; color: black; margin-top: 0px;"> <h2  style="margin-left: 80px;margin-top: -20px"><strong style="font-size: 50px;" > S S</strong> <br> Hospital</h2></div>
	<div style="width: 850px; float: right; margin-top:0px"> 
    
     		<h6 style="color: black; margin-top: -100px;font-size: 20px;font-weight: bold;margin-left: -70px">Shiv Shakti Hospital Gohan Jalaun U.P-285123</h6>
     		<h6 style="margin-top: 0px; color: black;font-size: 20px;font-weight: bold;margin-left: -70px">शिव शक्ति अस्पताल गोहन जालौन,उत्तर प्रदेश-285123</h6>
     		<div class="h">
     		 	<ul style="margin-top: 0px; margin-left:-200px" >
                            <li><a href="">Home</a> </li>
     		 		<li>Patient
                        <ul>
                            <li><a href="Finddoctor.jsp"> Find doctor </a></li>
                            <li><a href="Feedback.jsp"> Feedback</a></li>
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
                                <li><a href="Aboutus.jsp"> About us </a> </li>
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
                                      <marquee class="scroll-text" style="font-size: 20px;color: red; margin-top: 0px"> <span class="flash">Important:</span> <a href="https://www.covid19india.org/" >Covid19-india Tracker</a>  <span class="glyphicon glyphicon-forward" style="color: blue"></span> <a href="https://www.indiatoday.in">Today Latest-News</a> <span class="glyphicon glyphicon-forward" style="color: blue"></span>  Bucky's Arm Miraculously Regenerates On Important: Infinity War Poster</marquee>
                                  <!-- <span class="onoffswitch3-switch"><span class="glyphicon glyphicon-remove"></span></span> -->
                                 <!-- </span>
                                   <span class="onoffswitch3-inactive"><span class="onoffswitch3-switch"></span></span>
                                  </span>
                                 </label> -->
                        </div>
</header>
<section>
  <nav>
  	<h3 style="margin-top: -10px; text-align: center;">ANNOUNCEMENTS</h3>
<div id="slider" style="margin-left: -20px">
      <div class="container">
        <div class="slide">
          <h3>Slide 1</h3>
         <span class="flash">New</span> <p>
             <a href="BookAppoint.jsp"> Book Appointment</a>
          </p><div class="s"></div>
        <span class="flash">New</span>  <p><a href="SearchAppoint.jsp"> Check Appointment</a></p> <div class="s"></div>
         <span class="flash">New</span> <p>Notice Regarding Corona Virus (Covid-19)</p><div class="s"></div>
         <span class="flash">New</span> <p>Notice Regarding Corona Virus (Covid-19)</p><div class="s"></div>
        </div>
        <div class="slide">
          <h3>Slide 2</h3>
         <span class="flash">New</span> <p>
             COVID-19 Tracker | India
             <a href="https://www.covid19india.org/">https://www.covid19india.org/ </a>
          </p>
        </div>
        <div class="slide">
          <h3>Slide 3</h3>
        <p class="flash">New</p>  <p>
            Her birthday calculates past a juice! 
          </p>
        </div>
        <div class="slide">
          <h3>Slide 4</h3>
         <p class="flash">New</p> <p>
            A distributed actor pilots the null pencil. The wild wolfs a damp cage inside the breach. 
          </p>
        </div>
        <div class="slide">
          <h3>Slide 5</h3>
        <p class="flash">New</p>  <p>
            The suspected book hums opposite the unacceptable urge. The warning goodbye searches the substitute. 
          </p>
        </div>
      </div>
    </div>

  </nav>
  
  <article>
   
 <div class="bs-example" style="margin-top: -20px">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Carousel indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <!-- Wrapper for carousel items -->
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="d10.jpg" alt="First Slide">
            </div>
            <div class="carousel-item">
                <img src="d12.jpg" alt="Second Slide">
            </div>
            <div class="carousel-item">
                <img src="d14.jpg" alt="Third Slide" style="border-image-outset: 500px">
            </div>
        </div>
        <!-- Carousel controls -->
        <a class="carousel-control-prev" href="#myCarousel" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#myCarousel" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>
    </div>
</div>
    
  </article>
</section>
<div style="margin-top: 140px; width: 1000px; margin-left: 20px">
  <div style="height: 100px; background-color: #f2f2f2;width: 1350px;margin-left: -10px;border-bottom: 2px solid #99c2ff;">
	<div class="row">
		<div class="columns">
		  <div style="width: 50%"><i class="fa fa-graduation-cap" aria-hidden="true" style="font-size: 80px;"></i>
		  </div>
			<h4 style="margin-left: 30px;margin-top: -55px">Academics</h4>
			<p style="margin-left: 20px">Leading The Packs</p>
		</div>
		<div class="columns">
			<div style="width: 50%"><i class="fa fa-line-chart" aria-hidden="true" style="font-size: 70px;"></i>
		  </div>
			<h4 style="margin-left: 40px;margin-top: -55px">Research</h4>
			<p style="margin-left: 55px">The Hub of Treatments</p>
		</div>
		<div class="columns">
			<div style="width: 50%"><i class="fa fa-university" aria-hidden="true" style="font-size: 70px;"></i>
		  </div>
			<h4 style="margin-left: 30px;margin-top: -55px">Facilities</h4>
			<p style="margin-left: 40px">The Nurture Greatness</p>
		</div>
		<div class="columns">
			<div style="width: 50%"><i class="fa fa-asl-interpreting" aria-hidden="true" style="font-size: 80px;"></i>
		  </div>
			<h4 style="margin-left: 30px;margin-top: -55px">Culture</h4>
			<p style="margin-left: 20px">The S S Way</p>
		</div>
	</div>
</div>






<div style="width: 1350px;margin-left: -25px">
	   <div class="row" style="margin-left: 25px">
	   	  <div class="c" style="width: 33.33%">
	   	  	     <!--  News Slider -->
	               <h3 style="margin-top: 20px; text-align: center;">News And Events</h3>
                       <div id="slider" style="margin-left: -20px; background-color:  #ffe6ff" >
                           <div class="container">
                           <div class="slide">
                              <h3>Slide 1</h3>
                       <p class="flash">New</p> <p>All Classes and Examinations shall Remain Suspended till 31st March</p>
                           <p class="flash">New</p>  <p>Notice Regarding Corona Virus (Covid-19)</p>
                           <p class="flash">New</p>  <p>Notice Regarding Hanta Virus (Covid-19)</p>
                       </div>
                     <div class="slide">
                      <h3>Slide 2</h3>
                    <p class="flash">New</p>  <p> The lasting astronomer balances 
                        the counter reminder. The trap hires the paradox.</p>
                      </div>
                  <div class="slide">
                  <h3>Slide 3</h3>
                <p class="flash">New</p>   <p>
                  Her birthday calculates past a juice! The envy succeeds across an evident jelly. 
                  </p>
                  </div>
                   <div class="slide">
                    <h3>Slide 4</h3>
                  <p class="flash">New</p>  <p>
                    A distributed actor pilots the null pencil. The wild wolfs a damp cage inside the breach. 
                    </p>
                   </div>
                   <div class="slide">
                  <h3>Slide 5</h3>
                <p class="flash">New</p>  <p>
                    The suspected book hums opposite the unacceptable urge. The warning goodbye searches the substitute. 
                    </p>
                   </div>
                 </div>
                 </div>
	   	     </div>

	   	       <div class="c" style="width: 33.33%">
	   	  	     <!--  News Slider -->
	               <h3 style="margin-top: 20px; text-align: center;">Notifications</h3>
                       <div id="slider" style="margin-left: -20px;background-color:  #ffe6ff">
                           <div class="container">
                           <div class="slide">
                              <h3>Slide 1</h3>
                           <p>Notice Regarding Corona Virus (Covid-19)</p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                       </div>
                     <div class="slide">
                      <h3>Slide 2</h3>
                      <p>
                        The lasting astronomer balances the counter reminder.  
                      </p>
                      </div>
                  <div class="slide">
                  <h3>Slide 3</h3>
                   <p>
                  Her birthday calculates past a juice! The envy succeeds across an evident jelly. 
                  </p>
                  </div>
                   <div class="slide">
                    <h3>Slide 4</h3>
                    <p>
                    A distributed actor pilots the null pencil. The wild wolfs a damp cage inside the breach. 
                    </p>
                   </div>
                   <div class="slide">
                  <h3>Slide 5</h3>
                  <p>
                    The suspected book hums opposite the unacceptable urge. The warning goodbye searches the substitute. 
                    </p>
                   </div>
                 </div>
                 </div>
	   	     </div>
              <div class="c" style="width: 33.33%">
	   	  	     <!--  News Slider -->
	               <h3 style="margin-top: 20px; text-align: center;">News And Events</h3>
                       <div id="slider" style="margin-left: 0px; background-color:  #ffe6ff">
                           <div class="container">
                           <div class="slide">
                              <h3>Slide 1</h3>
                           <p>
                              Notice Regarding Corona Virus (Covid-19) 
                           </p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                             <p>Notice Regarding Corona Virus (Covid-19)</p>
                       </div>
                     <div class="slide">
                      <h3>Slide 2</h3>
                      <p>
                        The lasting astronomer balances the counter reminder. The trap hires the paradox. 
                      </p>
                      </div>
                  <div class="slide">
                  <h3>Slide 3</h3>
                   <p>
                  Her birthday calculates past a juice! The envy succeeds across an evident jelly. 
                  </p>
                  </div>
                   <div class="slide">
                    <h3>Slide 4</h3>
                    <p>
                    A distributed actor pilots the null pencil. The wild wolfs a damp cage inside the breach. 
                    </p>
                   </div>
                   <div class="slide">
                  <h3>Slide 5</h3>
                  <p>
                    The suspected book hums opposite the unacceptable urge. The warning goodbye searches the substitute. 
                    </p>
                   </div>
                 </div>
                 </div>
	   	     </div>

	   </div> 
	  </div>
<div style="width: 1350px; height: 500px; margin-left: -20px;">
	<h2 style="color: blue; font-weight: bold; font-size: 40px">Upcoming Events<p style="width: 75%;float: right; height: 3px;background-color: gray;"></p> </h2>
	    <div class="bd-example">
  <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="d9.jpg" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
          <h1 style="font-size: 80px;font-weight: bold; ">Hospital</h1>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
        </div>
      </div>
      <div class="carousel-item">
        <img src="d18.jpg" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
          <h1 style="font-size: 80px;font-weight: bold;">Treatments</h1>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
      </div>
      <div class="carousel-item">
        <img src="d16.jpg" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
          <h1 style="font-size: 80px;font-weight: bold;">TECHNOLOGY</h1>
          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
        </div>
      </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>


</div> 

</div>
<footer>
	<div style="width: 1350px">
     <div class="row">
     	<div class="c" style="width: 33.33%">
     		<ul> 
     			<h1 style="font-weight: bold;color: blue ">S S Hospital</h1>
     			<p>Shiv Shakti</p>
     			<p>Gohan ,jalaun,Uttar-pradesh-285123</p>
     			<p>Contact No. 9098260397</p>
     			<p>Arvindmca95@gmail.com</p>
     		</ul>
     	</div>
     	<div class="c" style="width: 33.33%">
     		<ul>
                    <h3><a href="Aboutus.jsp"> About us</a> </h3>
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
                        <p><a href="login.jsp"> Admin</a> </p>
                         <p><a href="BookAppoint.jsp"> Book Appointment</a> </p>
     		</ul>
     	</div>
     </div>
 </div>
</footer>

<div style="background-color: black;height: 60px;width: 1350px;margin-top: -20px">
	<h3 style="color: white;text-align: center;">Copyright@2020 | Developed by Arvind Kumar & Sunil Dhakad </h3>
</div>

</body>
</html>