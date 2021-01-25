<%-- 
    Document   : Admin
    Created on : Mar 14, 2020, 3:28:43 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  	<meta charset="utf-8">
	<title>Admin Portal</title>
	<link rel="stylesheet" type="text/css" href="style.css">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <!-- style for Card -->
  <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  font-size:  18px;
  padding: 12px;
  border: 4px solid #ccccc;
  border-radius: 10px;
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
  color: white;

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
  width: 33.33%;
  padding: 10px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

</style>  
<!-- code for cards -->
<style type="text/css">
  .card {
    background-color:  grey;
 /* box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.8); */
  max-width: 400px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.title {
  color: white;
  font-size: 18px;
}

button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: tomato;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

a {
  text-decoration: none;
  font-size: 22px;
  color: white;
}

button:hover, a:hover {
  opacity: 0.5;
  color: cyan;
}

</style>
 
  </head>
    <body style="background-image: url(23.jpg); background-size: cover;">
                         <!-- code for 1st nav bar -->
                        <div class="onoffswitch3" style="background-color:  #33ffd6; width: 100%; height: 40px;">
                                 
                                  <label class="onoffswitch3-label" for="myonoffswitch3">
                                   <span class="onoffswitch3-inner">
                                  <span class="onoffswitch3-active">
                                  <marquee class="scroll-text" style="font-size: 20px" >Avengers: Infinity War's Iron Spider Suit May Use Bleeding Edge Tech  <span class="glyphicon glyphicon-forward" style="color: red"></span> Russo brothers ask for fans not to spoil Avengers: Infinity War <span class="glyphicon glyphicon-forward" style="color: red" ></span>  Bucky's Arm Miraculously Regenerates On Avengers: Infinity War Poster</marquee>
                        </div>

    
 <!-- code for 2nd Nav Bar -->     
    	     <div id="container" style="margin-top: -15px">
    		        <ul>
    		   	              <li>Doctors
                                       <ul>
                                           <li><a href="adddoctor.jsp"> Add Doctor</a></li>
                                           <li><a href="Doctorlist.jsp" >Doctorlist</a> </li>
                                        </ul>
                          </li>
    		   	             <li>Receptionist
                                        <ul>
                                            <li><a href="addReceptionist.jsp" > Add Receptionist</a> </li>
                                            <li><a href="Receptionistlist.jsp"> Receptionist List</a> </li>
                                        </ul>
                         </li>
    		   	             <li>Nurses
                                  <ul>
                                      <li><a href="addnurse.jsp"> Add Nurse</a> </li>
                                      <li><a href="Nurselist.jsp"> Nurse List</a> </li>
                                  </ul>
                         </li>
    		          <li>Patient
                                   <ul>
                                       <li><a href="addPatient.jsp"> Add Patient</a> </li>
                                       <li><a href="Patientlist.jsp"> Patient List</a> </li>
                                       <li><a href="Inpatientlist.jsp"> In Patient</a> </li>
                                       <li><a href="Outpatientlist.jsp"> Out Patient</a> </li>
                                   </ul>
                          </li>
    		           <li>Appointment
                                     <ul>
                                         <li><a href="BookAppoint.jsp"> Book Appointment</a> </li>
                                         <li><a href="Appointmentlist.jsp">Show Appointment</a></li>
                                     </ul> 
                          </li>
                          <li><a href="Feedbacklist.jsp"> Feedback</a> </li>
                           <li><a href="Registeruser.jsp">New User</a></li>
                          <li><a href="login.jsp">Logout</a></li>
    		       </ul>
    	     </div>
  <!-- form Created -->
  <br>
  <br>
<h1 style="color: red">Welcome <%=session.getAttribute("name")%></h1>

  <div class="row">
<div class="column">
    <div class="card">
                     <i class="fa fa-user-md" style="font-size:90px;color:red"></i>
                      <br>
                 <h1 style="color: black">Doctor</h1>
                  
                <div style="margin: 24px 0;">
                <a href="#"><i class="fa fa-dribbble"></i></a> 
                <a href="#"><i class="fa fa-twitter"></i></a>  
                <a href="#"><i class="fa fa-linkedin"></i></a>  
               <a href="#"><i class="fa fa-facebook"></i></a> 
               </div>
                <table style="width: 100%; border-color: 3px solid black; ">
                     <tr>
                     <form method="post" name="frm" action="adddoctor.jsp" > <th><button>Add Doctor</button> </th></form>
                     <form method="post" name="frm" action=".jsp" > <th><button>Delete Doctor </button> </th></form>
                     </tr>
                   </table>
                 <form method="post" name="frm" action="Doctorlist.jsp" ><p><button>View Doctor's List</button></p></form>
          </div>
    </form>
</div>
<div class="column">
             <div class="card">
                             <i class="fa fa-wheelchair" style="font-size:80px;color:red"></i>
                            <br>
                 <h1 style="color: black">Patient</h1>
    
    
                <p style="color: black">Harvard University</p>
                <div style="margin: 24px 0;">
                <a href="#"><i class="fa fa-dribbble"></i></a> 
                <a href="#"><i class="fa fa-twitter"></i></a>  
                <a href="#"><i class="fa fa-linkedin"></i></a>  
               <a href="#"><i class="fa fa-facebook"></i></a> 
               </div>
               <table style="width: 100%; border-color: 3px solid black; ">
                     <tr>
                     <form method="post" name="frm" action="addPatient.jsp" > <th><button>Add Patient</button> </th></form>
                     <form method="post" name="frm" action=".jsp" >  <th><button>Delete Patient</button> </th></form>
                     </tr>
                   </table>
                <form method="post" name="frm" action="Patientlist.jsp" > <p><button>View Patient List</button></p></form>
          </div>
    </form>
</div>

<div class="column">
             <div class="card">
              <i class="fa fa-phone" style="font-size:80px;color:red"></i>
                 <h1 style="color: black">Receptionist</h1>
    
    
                <p style="color: black">Harvard University</p>
                <div style="margin: 24px 0;">
                <a href="#"><i class="fa fa-dribbble"></i></a> 
                <a href="#"><i class="fa fa-twitter"></i></a>  
                <a href="#"><i class="fa fa-linkedin"></i></a>  
               <a href="#"><i class="fa fa-facebook"></i></a> 
               </div>
               <table style="width: 100%; border-color: 3px solid black; ">
                     <tr>
                     <form method="post" name="frm" action="addReceptionist.jsp" > <th><button>Add Receptionist</button> </th></form>
                     <form method="post" name="frm" action=".jsp" >  <th><button>Delete Receptionist</button> </th></form>
                     </tr>
                   </table>
                <form method="post" name="frm" action="Receptionistlist.jsp" > <p><button>View Receptionist List</button></p></form>
          </div>
    </form>
</div>


<div class="column">
    
             <div class="card">
                 <i class="fa fa-female" style="font-size:80px;color:red"></i>
                 <h1 style="color: black">Nurse</h1>
    
    
                <p style="color: black">Harvard University</p>
                <div style="margin: 24px 0;">
                <a href="#"><i class="fa fa-dribbble"></i></a> 
                <a href="#"><i class="fa fa-twitter"></i></a>  
                <a href="#"><i class="fa fa-linkedin"></i></a>  
               <a href="#"><i class="fa fa-facebook"></i></a> 
               </div>
               <table style="width: 100%; border-color: 3px solid black; ">
                     <tr>
                     <form method="post" name="frm" action="addnurse.jsp" ><th><button>Add Nurse</button> </th></form>
                     <form method="post" name="frm" action=".jsp" > <th><button>Delete Nurse</button> </th></form>
                     </tr>
                   </table>
                <form method="post" name="frm" action="Nurselist.jsp" ><p><button>View Nurse List</button></p></form>
          </div>
</div>

<div class="column">
 
        <div class="card">
 <i class="fa fa-hospital-o" style="font-size:80px;color:red"></i>
<br>
     <h1 style="color: black">Appointment</h1>
    
    
  <p style="color: black">Harvard University</p>
  <div style="margin: 24px 0;">
    <a href="#"><i class="fa fa-dribbble"></i></a> 
    <a href="#"><i class="fa fa-twitter"></i></a>  
    <a href="#"><i class="fa fa-linkedin"></i></a>  
    <a href="#"><i class="fa fa-facebook"></i></a> 
  </div>
  <table style="width: 100%; border-color: 3px solid black; ">
                     <tr>
                     <form method="post" name="frm" action="BookAppoint.jsp" ><th><button>Book Appointment</button> </th> </form>
                     <form method="post" name="frm" action=".jsp" ><th><button>Delete Appoint</button> </th></form>
                     </tr>
                   </table>
   <form method="post" name="frm" action="Appointmentlist.jsp" >  
  <p><button>Show Appointment</button></p> </form>
</div>
   
</div>

</div>

   </body>
</html>
