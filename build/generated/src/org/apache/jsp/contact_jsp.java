package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("<title>contact form</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  \n");
      out.write("<script type=\"text/javascript\" src=\"sc.js\"></script>\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"> \n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      * {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the header */\n");
      out.write("header {\n");
      out.write("  background-color:#f2f2f2;\n");
      out.write("  padding: 30px;\n");
      out.write("  text-align: left;\n");
      out.write("  font-size: 35px;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create two columns/boxes that floats next to each other */\n");
      out.write("nav {\n");
      out.write("  float: left;\n");
      out.write("  width: 30%;\n");
      out.write("  height: 300px; /* only for demonstration, should be removed */\n");
      out.write("  background: #ccc;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the list inside the menu */\n");
      out.write("nav ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("article {\n");
      out.write("  float: left;\n");
      out.write("  padding: 20px;\n");
      out.write("  width: 70%;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  height: 300px; /* only for demonstration, should be removed */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write("section:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the footer */\n");
      out.write("footer {\n");
      out.write("  background-color: #777;\n");
      out.write("  height: 300px;\n");
      out.write("  padding: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("  color: white;\n");
      out.write("  margin-top: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */\n");
      out.write("@media (max-width: 600px) {\n");
      out.write("  nav, article {\n");
      out.write("    width: 100%;\n");
      out.write("    height: auto;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/* nav bar */\n");
      out.write(".h ul{\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write(".h ul li{\n");
      out.write("\tfloat: left;\n");
      out.write("\tbackground-color: b;\n");
      out.write("\twidth: 144px;\n");
      out.write("\tborder: 0px solid white;\n");
      out.write("\tborder-radius: 0px;\n");
      out.write("\theight: 50px;\n");
      out.write("\tline-height: 50px;\n");
      out.write("\ttext-align: center;\n");
      out.write("    color: black;\n");
      out.write("    font-size: 20px;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write(".h ul li:hover{\n");
      out.write("background-color: cyan;\n");
      out.write("visibility: visible;\n");
      out.write("        z-index: 100;\n");
      out.write("}\n");
      out.write(".h ul ul{\n");
      out.write("\tdisplay: none;\n");
      out.write("}\n");
      out.write(".h ul li:hover  > ul{\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write(".h ul ul {\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\ttop: 48px;\n");
      out.write("position: absolute;\n");
      out.write("}\n");
      out.write(".h ul ul li{\n");
      out.write("\tborder: 1px solid black;\n");
      out.write("\twidth: 150px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("       visibility: visible;\n");
      out.write("        z-index: 100;\n");
      out.write("} \n");
      out.write(".h ul ul ul{\n");
      out.write("    margin-left: 150px;\n");
      out.write("    top: 0px;\n");
      out.write("    position: absolute;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* image slider code */\n");
      out.write(".carousel{\n");
      out.write("    background: #2f4357;\n");
      out.write("    margin-top: 0px;\n");
      out.write("}\n");
      out.write(".carousel-item{\n");
      out.write("    text-align: center;\n");
      out.write("    min-height: 280px; /* Prevent carousel from being distorted if for some reason image doesn't load */\n");
      out.write("    height: 410px;\n");
      out.write("  }\n");
      out.write(".bs-example{\n");
      out.write("  margin: 0px;\n");
      out.write("  width: 970px;\n");
      out.write("  margin-left: -30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*  text blinking */\n");
      out.write("\n");
      out.write("/*Be sure to look into browser prefixes for keyframes and annimations*/\n");
      out.write(".flash {\n");
      out.write("   animation-name: flash;\n");
      out.write("    animation-duration: 0.4s;\n");
      out.write("    animation-timing-function: linear;\n");
      out.write("    animation-iteration-count: infinite;\n");
      out.write("    animation-direction: alternate;\n");
      out.write("    animation-play-state: running;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes flash {\n");
      out.write("    from {color: red;}\n");
      out.write("    to {color: blue;}\n");
      out.write("\n");
      out.write("}\n");
      out.write(".s{\n");
      out.write("  height: 2px;\n");
      out.write(" background-color: gray;\n");
      out.write("  width: 400px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* News Slider Code */\n");
      out.write("#slider,  #slider .slide{\n");
      out.write("  width: 400px;\n");
      out.write("  height: 360px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#slider {\n");
      out.write("  overflow: hidden;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  font-size: 1.2em;\n");
      out.write("  background: white;\n");
      out.write("   border-bottom: 2px solid black;\n");
      out.write("}\n");
      out.write("#slider .container {\n");
      out.write("  position: relative;\n");
      out.write("  bottom: 0;\n");
      out.write("  right: 0;\n");
      out.write("  animation: slide-animation 20s infinite;\n");
      out.write("}\n");
      out.write("#slider .slide {\n");
      out.write("  position: relative;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* [ANIMATION] */\n");
      out.write("@keyframes slide-animation {\n");
      out.write("  0% { \n");
      out.write("    opacity: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("  }\n");
      out.write("  11% {\n");
      out.write("    opacity: 1;\n");
      out.write("    bottom: 0; \n");
      out.write("  }\n");
      out.write("  22% { bottom: 100%; }\n");
      out.write("  33% { bottom: 100%; }\n");
      out.write("  44% { bottom: 200%; }\n");
      out.write("  55% { bottom: 200%; }\n");
      out.write("  66% { bottom: 300%; }\n");
      out.write("  77% { bottom: 300%; }\n");
      out.write("  88% {\n");
      out.write("    opacity: 1;\n");
      out.write("    bottom: 400%; \n");
      out.write("  }\n");
      out.write("  100% {\n");
      out.write("    opacity: 0;\n");
      out.write("    bottom: 400%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* [DOES NOT MATTER] */\n");
      out.write("html, body {\n");
      out.write("  font-family: arial;\n");
      out.write("  background: white;\n");
      out.write("}\n");
      out.write("h1 {\n");
      out.write("  text-align: center;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  width: 50%;\n");
      out.write("  padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write(".c{\n");
      out.write("  width: 33.33%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("\t<div style*=\"width: 350px; color: black; margin-top: 0px;\"> <h2  style=\"margin-left: 80px;margin-top: -20px; color:red;  \"><strong style=\"font-size: 50px;\" > S S</strong> <br> Hospital</h2></div>\n");
      out.write("\t<div style=\"width: 850px; float: right; margin-top:0px\"> \n");
      out.write("    \n");
      out.write("     \t\t<h6 style=\"color: black; margin-top: -100px;font-size: 20px;font-weight: bold;margin-left: -70px\">Shiv Shakti Hospital Gohan Jalaun U.P-285123</h6>\n");
      out.write("     \t\t<h6 style=\"margin-top: 0px; color: black;font-size: 20px;font-weight: bold;margin-left: -70px\">शिव शक्ति अस्पताल गोहन जालौन,उत्तर प्रदेश-285123</h6>\n");
      out.write("     \t\t<div class=\"h\">\n");
      out.write("     \t\t \t<ul style=\"margin-top: 0px; margin-left:-200px\" >\n");
      out.write("                            <li><a href=\"index.jsp\">Home</a> </li>\n");
      out.write("     \t\t \t\t<li>Patient\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"Finddoctor.jsp\"> Find doctor </a></li>\n");
      out.write("                            <li><a href=\"Feedback.jsp\"> Feedback</a> </li>\n");
      out.write("                           <li>Rights</li>\n");
      out.write("                           <li>Photo Gallery</li>\n");
      out.write("                           <li>Appointment\n");
      out.write("                               <ul>\n");
      out.write("                                   <li><a href=\"BookAppoint.jsp\"> Book</a> </li>\n");
      out.write("                                   <li><a href=\"SearchAppoint.jsp\"> Check</a> </li>\n");
      out.write("                               </ul>\n");
      out.write("                           </li>\n");
      out.write("                        </ul>   \n");
      out.write("     \t\t \t\t</li>\n");
      out.write("                                <li><a href=\"Aboutus.html\"> About us </a> </li>\n");
      out.write("     \t\t \t\t<li>Facilities\n");
      out.write("                                <ul>\n");
      out.write("                                \t<li>Health CheckUp\n");
      out.write("                                                    <ul>\n");
      out.write("                                                    \t<li>Basic Package</li>\n");
      out.write("                                                    \t<li>Cardiac Package</li>\n");
      out.write("                                                    \t<li>Comprehensive</li>\n");
      out.write("                                                    \t<li>Super Package</li>\n");
      out.write("                                                    \t<li>Women Special</li>\n");
      out.write("                                                    </ul> \n");
      out.write("                                \t</li>\n");
      out.write("                                \t<li>Wards\n");
      out.write("                                             <ul>\n");
      out.write("                                             \t<li>General Ward</li>\n");
      out.write("                                             \t<li>ICU Ward</li>\n");
      out.write("                                              <li>OT</li>\n");
      out.write("                                             </ul>\n");
      out.write("                                \t</li>\n");
      out.write("                                \t<li>Diadnostic Wing\n");
      out.write("                                                    <ul>\n");
      out.write("                                                    \t<li>Pathology</li>\n");
      out.write("                                                        <li>Colposcopy</li> \n");
      out.write("                                                    \t <li>Radiology</li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                \t</li>\n");
      out.write("                                \t<li>TMT</li>\n");
      out.write("                                \t<li>EEG</li>\n");
      out.write("                                \t<li>Physiotheraphy & Rehab</li>\n");
      out.write("                                \t<li>Obesity & Pain clinic</li>\n");
      out.write("                                \t<li>Pharmacy</li>\n");
      out.write("                                \t<li>Ambulance</li>\n");
      out.write("                                </ul>\n");
      out.write("             \t\t</li>\n");
      out.write("     \t\t \t\t<li> Department\n");
      out.write("     \t\t \t\t\t<ul>\n");
      out.write("                                            <li> Medicine\n");
      out.write("                                                  <ul>\n");
      out.write("                                        \t          <li>Internal Medicine</li>\n");
      out.write("                                        \t          <li>Endocrinology / Diabetes</li>\n");
      out.write("                                        \t          <li>Gastroenterology</li>\n");
      out.write("                                        \t          <li>Oncology</li>\n");
      out.write("                                        \t          <li>Nephrology</li>\n");
      out.write("                                        \t          <li>Psychiatry</li>\n");
      out.write("                                        \t          <li>Cardiology</li>\n");
      out.write("                                        \t          <li>Neurology</li>\n");
      out.write("                                        \t          <li>Dermatology</li>\n");
      out.write("                                                   </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                           <li>Surgical\n");
      out.write("                                                    <ul>\n");
      out.write("                                          \t        <li>Plastic & Microvascular Surgery</li>\n");
      out.write("                                          \t        <li>General Surgery</li>\n");
      out.write("                                          \t         <li>Laparoscopic Surgery</li>\n");
      out.write("                                          \t         <li>Urosurgery</li>\n");
      out.write("                                          \t         <li>Onco Surgery</li>\n");
      out.write("                                          \t         <li>Dentistry</li>\n");
      out.write("                                          \t         <li>ENT</li>\n");
      out.write("                                          \t         <li>Ophthalmic</li>\n");
      out.write("                                          \t         <li>Orthopaedics</li>\n");
      out.write("                                          \t         <li>Pediatrics</li>\n");
      out.write("                                          \t         <li>Obstetrics & Gynecology</li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                           </li>\n");
      out.write("                                        </ul>   \n");
      out.write("     \t\t \t\t</li>\n");
      out.write("     \t\t \t\t<li> Contact us</li>\n");
      out.write("                                <li><a href=\"login.jsp\"> Log In</a> </li>\n");
      out.write("     \t\t \t</ul> \n");
      out.write("     \t\t </div>  \n");
      out.write("\t</div>\n");
      out.write("\t<div style=\"height: 2px; width: 105%; background-color: black; margin-left: -35px;margin-top: 40px\"></div>\n");
      out.write("\t<!-- code for 1st nav bar -->\n");
      out.write("                        <div class=\"onoffswitch3\" style=\"width: 105%; height: 20px;margin-left: -30px; margin-top: -10px\">\n");
      out.write("                                 \n");
      out.write("                                  <label class=\"onoffswitch3-label\" for=\"myonoffswitch3\">\n");
      out.write("                                   <span class=\"onoffswitch3-inner\">\n");
      out.write("                                  <span class=\"onoffswitch3-active\">\n");
      out.write("                                  <marquee class=\"scroll-text\" style=\"font-size: 20px;color: red; margin-top: 0px\"> <span class=\"flash\">Important:</span>   Infinity War's Iron Spider Suit May Use Bleeding Edge Tech  <span class=\"glyphicon glyphicon-forward\" style=\"color: blue\"></span> Russo brothers ask for fans not to spoil Important: Infinity War <span class=\"glyphicon glyphicon-forward\" style=\"color: blue\"></span>  Bucky's Arm Miraculously Regenerates On Important: Infinity War Poster</marquee>\n");
      out.write("                                  <!-- <span class=\"onoffswitch3-switch\"><span class=\"glyphicon glyphicon-remove\"></span></span> -->\n");
      out.write("                                 <!-- </span>\n");
      out.write("                                   <span class=\"onoffswitch3-inactive\"><span class=\"onoffswitch3-switch\"></span></span>\n");
      out.write("                                  </span>\n");
      out.write("                                 </label> -->\n");
      out.write("                        </div>\n");
      out.write("</header>\n");
      out.write("<section>\n");
      out.write("  <nav>\n");
      out.write("  \t<h3 style=\"margin-top: -10px; text-align: center;\">Follow On</h3>\n");
      out.write("<div id=\"slider\" style=\"margin-left: -20px\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"slide\">\n");
      out.write("          <h3>Facebook</h3>\n");
      out.write("         <span class=\"flash\">New</span> <p>\n");
      out.write("             <a href=\"https://www.facebook.com/profile.php?id=100006448387819\">facebook</a> \n");
      out.write("          </p><div class=\"s\"></div>\n");
      out.write("        <span class=\"flash\">New</span>  <p>All Classes and Examination shall Remain Suspended Till 31st March</p> <div class=\"s\"></div>\n");
      out.write("         <span class=\"flash\">New</span> <p>Notice Regarding Corona Virus (Covid-19)</p><div class=\"s\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"slide\">\n");
      out.write("          <h3>Twitter</h3>\n");
      out.write("         <span class=\"flash\">New</span> <p>\n");
      out.write("             COVID-19 Tracker | India\n");
      out.write("             <a href=\"https://www.covid19india.org/\">https://www.covid19india.org/ </a>\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"slide\">\n");
      out.write("          <h3>LinkedIn</h3>\n");
      out.write("        <p class=\"flash\">New</p>  <p>\n");
      out.write("            <a href=\"https://www.linkedin.com/in/arvind-kumar-041527194\">linkedin</a> \n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"slide\">\n");
      out.write("          <h3>Instagram</h3>\n");
      out.write("         <p class=\"flash\">New</p> <p>\n");
      out.write("             <a href=\"https://www.instagram.com/aarvindkushwaha95/\">Instagram</a>\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"slide\">\n");
      out.write("          <h3>Telegram</h3>\n");
      out.write("        <p class=\"flash\">New</p>  <p>\n");
      out.write("            The suspected book hums opposite the unacceptable urge. The warning goodbye searches the substitute. \n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </nav>\n");
      out.write("  \n");
      out.write("  <article>\n");
      out.write("      <form action=\"Feedbackconn.jsp\" method=\"get\" >\n");
      out.write("          <h3 style=\"text-align:center\">Contact Us</h3>\n");
      out.write("   <div class=\"row\">\n");
      out.write("<div class=\"column\">\n");
      out.write("  <form action=\"Appointconn.jsp\" method=\"get\">\n");
      out.write("    <label for=\"fname\">First Name</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"name\"  placeholder=\"Enter First Name\"><br><br>\n");
      out.write("        \n");
      out.write("    <label for=\"fname\">Last Name</label>\n");
      out.write("    <input type=\"text\"  name=\"lastname\" placeholder=\"Enter Last Name\"><br><br>\n");
      out.write("    \n");
      out.write("    <label for=\"fname\">Contact</label>\n");
      out.write("    <input type=\"text\"  name=\"mobile\" placeholder=\"Enter Mobile Number\"><br><br>\n");
      out.write("    \n");
      out.write("     <label for=\"fname\">Gmail Id</label>\n");
      out.write("    <input type=\"gmail\"  name=\"gmail\" placeholder=\"Enter Gmail id\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("<div class=\"column\">\n");
      out.write("    \n");
      out.write("    <label for=\"comment\">Comments</label>\n");
      out.write("    <textarea id=\"comment\" name=\"comment\" placeholder=\"Write something..\" style=\"height:200px\"></textarea>\n");
      out.write("    <input type=\"Submit\" style=\"width: 400px; margin-left: -150px;\">\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  </article>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("\t<div style=\"width: 1350px; margin-top: 100px; height: 250px\">\n");
      out.write("     <div class=\"row\">\n");
      out.write("     \t<div class=\"c\" style=\"width: 33.33%\">\n");
      out.write("     \t\t<ul> \n");
      out.write("     \t\t\t<h1 style=\"font-weight: bold;color: blue \">S S Hospital</h1>\n");
      out.write("     \t\t\t<p>Shiv Shakti Hospital</p>\n");
      out.write("     \t\t\t<p>Gohan ,jalaun,Uttar-pradesh-285123</p>\n");
      out.write("     \t\t\t<p>Contact No. 9098260397</p>\n");
      out.write("     \t\t\t<p>Arvindmca95@gmail.com</p>\n");
      out.write("     \t\t</ul>\n");
      out.write("     \t</div>\n");
      out.write("     \t<div class=\"c\" style=\"width: 33.33%\">\n");
      out.write("     \t\t<ul>\n");
      out.write("     \t\t\t<h3>About us</h3>\n");
      out.write("     \t\t\t<p>Gallery</p>\n");
      out.write("     \t\t\t<p>Library</p>\n");
      out.write("     \t\t\t<p>Department</p>\n");
      out.write("     \t\t\t<p>Event Calender</p>\n");
      out.write("     \t\t</ul>\n");
      out.write("     \t</div>\n");
      out.write("     \t<div class=\"c\" style=\"width: 33.33%\">\n");
      out.write("     \t\t<ul>\n");
      out.write("     \t\t\t<h3>Contact Us</h3>\n");
      out.write("     \t\t\t<p>Patient Corner</p>\n");
      out.write("     \t\t\t<p>Courses</p>\n");
      out.write("     \t\t\t<p>Fee Structure</p>\n");
      out.write("     \t\t</ul>\n");
      out.write("     \t</div>\n");
      out.write("     </div>\n");
      out.write(" </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<div style=\"background-color: black;height: 60px;width: 1350px;margin-top: -20px\">\n");
      out.write("\t<h3 style=\"color: white;text-align: center;\">Copyright@2020 | Developed by Arvind Kumar </h3>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
