package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("   <!-- link and style for News sliding -->\n");
      out.write("\n");
      out.write("  <!-- code for  All   -->\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"jquery-latest.pack.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"jcarousellite_1.0.1c4.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("  <!-- image slider -->\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("    <link rel=\"stylesheet\"  href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"  href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>y\n");
      out.write("\t<title>About Us</title>\n");
      out.write("    <!-- style for Card -->\n");
      out.write("  <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  font-size:  18px;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 4px solid #ccccc;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin-top: 6px;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: #4d94ff;\n");
      out.write("  color: red;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: white;\n");
      out.write("  color: white;\n");
      out.write("\n");
      out.write("}\n");
      out.write("::placeholder{\n");
      out.write("  color: red;\n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: red;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write(".column {\n");
      out.write("  margin-top: 20px;\n");
      out.write("  float: left;\n");
      out.write("  width: 25%;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url(d9.jpg); background-size: cover;\">  \n");
      out.write("                       <!-- code for 1st nav bar -->\n");
      out.write("                        <div class=\"onoffswitch3\" style=\"background-color:  #33ffd6; width: 100%; height: 40px;\">\n");
      out.write("                                 \n");
      out.write("                                  <label class=\"onoffswitch3-label\" for=\"myonoffswitch3\">\n");
      out.write("                                   <span class=\"onoffswitch3-inner\">\n");
      out.write("                                  <span class=\"onoffswitch3-active\">\n");
      out.write("                                  <marquee class=\"scroll-text\" style=\"font-size: 20px\">Avengers: Infinity War's Iron Spider Suit May Use Bleeding Edge Tech  <span class=\"glyphicon glyphicon-forward\" style=\"color: red\"></span> Russo brothers ask for fans not to spoil Avengers: Infinity War <span class=\"glyphicon glyphicon-forward\" style=\"color: red\"></span>  Bucky's Arm Miraculously Regenerates On Avengers: Infinity War Poster</marquee>\n");
      out.write("                                  \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write(" <!-- code for 2nd Nav bar -->                       \n");
      out.write("             <div id=\"container\" style=\"margin-top: -10px;\">\n");
      out.write("             \t<ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a> </li>\n");
      out.write("             \t\t<li>About us \n");
      out.write("                          <ul>\n");
      out.write("                              <li><a href=\"#Introduction\"> Introduction</a> </li>\n");
      out.write("                                <li><a href=\"#mission\">Mission & Vission</a> </li>\n");
      out.write("                                <li><a href=\"#message\">Message</a></li>\n");
      out.write("                                <li><a href=\"#Board\"> Board of Trustees</a> </li>\n");
      out.write("                                <li><a href=\"#OurGallery\">Gallery</a> </li>\n");
      out.write("                                <li><a href=\"#Award\"> Awards & Accreditations</a> </li>\n");
      out.write("                          </ul>\n");
      out.write("             \t\t</li>\n");
      out.write("             \t\t<li>Facilities\n");
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
      out.write("             \t\t<li>Pateint\n");
      out.write("                               <ul>\n");
      out.write("                                   <li><a href=\"Finddoctor.jsp\"> Find Doctor</a></li>\n");
      out.write("                                   <li><a href=\"Feedback.jsp\"> Feedback</a> </li>\n");
      out.write("                               \t    <li>Rights </li>\n");
      out.write("                               </ul>\n");
      out.write("             \t\t</li>\n");
      out.write("             \t\t<li>Appointments\n");
      out.write("                                 <ul>\n");
      out.write("                                   <li><a href=\"BookAppoint.jsp\"> Book</a> </li>\n");
      out.write("                                   <li><a href=\"SearchAppoint.jsp\"> Check</a> </li>\n");
      out.write("                               </ul>\n");
      out.write("                    </li>\n");
      out.write("             \t\t<li>Department\n");
      out.write("                                <ul>\n");
      out.write("                                \t<li>Medicine\n");
      out.write("                                        <ul>\n");
      out.write("                                        \t<li>Internal Medicine</li>\n");
      out.write("                                        \t<li>Endocrinology / Diabetes</li>\n");
      out.write("                                        \t<li>Gastroenterology</li>\n");
      out.write("                                        \t<li>Oncology</li>\n");
      out.write("                                        \t<li>Nephrology</li>\n");
      out.write("                                        \t<li>Psychiatry</li>\n");
      out.write("                                        \t<li>Cardiology</li>\n");
      out.write("                                        \t<li>Neurology</li>\n");
      out.write("                                        \t<li>Dermatology</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                \t</li>\n");
      out.write("                                \t<li>Surgical\n");
      out.write("                                          <ul>\n");
      out.write("                                          \t<li>Plastic & Microvascular Surgery</li>\n");
      out.write("                                          \t<li>General Surgery</li>\n");
      out.write("                                          \t<li>Laparoscopic Surgery</li>\n");
      out.write("                                          \t<li>Urosurgery</li>\n");
      out.write("                                          \t<li>Onco Surgery</li>\n");
      out.write("                                          \t<li>Dentistry</li>\n");
      out.write("                                          \t<li>ENT</li>\n");
      out.write("                                          \t<li>Ophthalmic</li>\n");
      out.write("                                          \t<li>Orthopaedics</li>\n");
      out.write("                                          \t<li>Pediatrics</li>\n");
      out.write("                                          \t<li>Obstetrics & Gynecology</li>\n");
      out.write("                                          </ul>\n");
      out.write("                                \t</li>\n");
      out.write("                                </ul>\n");
      out.write("             \t\t</li>\n");
      out.write("                        <li><a href=\"contactus.jsp\"> Contact Us</a> </li>\n");
      out.write("                        <li><a href=\"login.jsp\"> LogIn</a> </li>\n");
      out.write("             \t</ul>\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("<!-- About us page  -->\n");
      out.write("<br><br><br><br>\n");
      out.write("<div> <a name=\"introduction\"></a>\n");
      out.write("      <img src=\"ER.jpg\" style=\"width: 40%;height: 500px;\">\n");
      out.write("          <div style=\"float: left; width: 60%;\">\n");
      out.write("            <h1 style=\"color: red; font-weight: bold;\">About Us</h1>\n");
      out.write("              <p style=\"color: white; font-size: 20px;\">Bansal Hospital, Bhopal, is a 300 bedded Super Specialty Hospital is born of a dream. A dream that the people of Bhopal and Central India get the best healthcare at affordable prices. A dream that the best infrastructure and technology be provided to doctors so that they can serve patients to best of their capability. A dream that our people need not flee to metros for medical needs. This conviction inspired us to make a world class hospital in the heart of the country where the \n");
      out.write("              best infrastructure meets the best doctors to deliver cutting edge technology with care.</p><br><br><br>\n");
      out.write("              <p style=\"color: white; font-size: 20px;\">Bansal Hospital is built on a sprawling lake view location. Bansal Hospital is designed with international accredited hospital infrastructure norms. It is a centrally air conditioned hospital to ensure optimum comfort with infection control. It's central sterilization unit designed & equipped by Getinge – Switzerland, has Fire alarm system from Schrack Belgium and Central Oxygen Supply Unit from Greece.</p>\n");
      out.write("            </div>  \n");
      out.write("    </div>    \n");
      out.write("<br>\n");
      out.write("<!-- PHOTO Gallery -->\n");
      out.write("<h1 style=\"text-align: center;color: red;\">OUR GALLERY</h1><a name=\"OurGallery\"></a>\n");
      out.write("<div class=\"bs-example\">\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-interval=\"2000\" data-ride=\"carousel\">\n");
      out.write("        <!-- Carousel indicators -->\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("        </ol>\n");
      out.write("        <!-- Wrapper for carousel items -->\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("                 \n");
      out.write("            <div class=\"carousel-item active\">\n");
      out.write("                <img src=\"d9.jpg\" alt=\"First Slide\">\n");
      out.write("                <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                    <h5>First slide label</h5>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img src=\"2.jpg\" alt=\"Second Slide\">\n");
      out.write("                <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                    <h5>Second slide label</h5>\n");
      out.write("                    <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("               \n");
      out.write("                <img src=\"d10.jpg\" alt=\"Third Slide\">\n");
      out.write("                <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                    <h5>First slide label</h5>\n");
      out.write("                    <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Carousel controls -->\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("            <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("            <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Chairman Message -->\n");
      out.write("<div style=\"width: 100%; height: 600px; background-color:  #ac7339\" ><a name=\"message\"></a>\n");
      out.write("  <br><br>\n");
      out.write("  <img src=\"Arvind.jpg\" style=\"margin-left: 600px; width: 200px; height: 150px;\">\n");
      out.write("  <h3 style=\"text-align: center; color: red; font-weight: bold;\">Chairman Message</h3>\n");
      out.write("  <br><br>\n");
      out.write("  <p style=\"text-align: center; color: white; margin-left:150px; margin-right: 150px; font-size: 20px;\">“City of Bhopal, situated in the heart of India has been facing the lack of a modern Healthcare Infrastructure. The healthcare giants have also ignored the city of Bhopal for inexplicable reasons. In fact, Bhopal can cater to the healthcare needs of entire Central India due to its unique geographical location and excellent connectivity by rail, road & air. With this background Bansal Group has taken up the initiative of creating world class institution that matches the highest standards of healthcare delivery anywhere in the world at a very affordable cost and by observing highest level of ethical values. Bansal Hospital brings together a state-of-the-art infrastructure, modern technology and a very dedicated human staff to provide treatment in a compassionate environment.”</p>\n");
      out.write("  <p style=\"float: right; margin-right: 40px; \">ARVIND KUMAR (Chairman)<br>\n");
      out.write("Bansal Hospital  </p>\n");
      out.write("</div> \n");
      out.write("<!--Here is a Next Level -->\n");
      out.write("<footer>\n");
      out.write("<div style=\"width: 100%; height: 600px; background-image: url('img.jpg'); background-repeat: no-repeat; background-size: 100%; \">\n");
      out.write("    <h2>Hello Bansal</h2>\n");
      out.write("\n");
      out.write("    <div class=\"row\"><a name=\"mission\"></a>\n");
      out.write(" <div class=\"column\">\n");
      out.write("  <div class=\"card\">\n");
      out.write("     <h1 style=\"color: red\">MISSION</h1>\n");
      out.write("   <div class=\"Profile\">\n");
      out.write("     <p style=\"color: black\">We are committed to serving diverse needs of young & old, rich & poor & those living in urban & rural communities.</p>\n");
      out.write("     <br>\n");
      out.write("     <p style=\"color: black\">Provision of excellent medical services by eminent, highly qualified doctors.</p><br>\n");
      out.write("     <p style=\"color: black\">Provision of services by qualified and dedicated nurses and paramedical staff.</p><br>\n");
      out.write("     <p style=\"color: black\">Maintaining highest ethical standards in patient care.</p>\n");
      out.write("   </div>\n");
      out.write("      \n");
      out.write("  <p style=\"color: cyan\">Harvard University</p>\n");
      out.write("  <div style=\"margin: 24px 0;\">\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("  </div>\n");
      out.write("  <p><button>Contact</button></p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("  <div class=\"card\">\n");
      out.write("     <h1 style=\"color: red\">VISSION</h1>\n");
      out.write("   <div class=\"Profile\">\n");
      out.write("     <p style=\"color: black\">We are committed to serving diverse needs of young & old, rich & poor & those living in urban & rural communities.</p>\n");
      out.write("     <br>\n");
      out.write("     <p style=\"color: black\">Provision of excellent medical services by eminent, highly qualified doctors.</p><br>\n");
      out.write("     <p style=\"color: black\">Provision of services by qualified and dedicated nurses and paramedical staff.</p><br>\n");
      out.write("     <p style=\"color: black\">Maintaining highest ethical standards in patient care.</p>\n");
      out.write("   </div>\n");
      out.write("      \n");
      out.write("  <p style=\"color: cyan\">Harvard University</p>\n");
      out.write("  <div style=\"margin: 24px 0;\">\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("  </div>\n");
      out.write("  <p><button>Contact</button></p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("  <div class=\"card\">\n");
      out.write("     <h1 style=\"color: red\">Core Values</h1>\n");
      out.write("   <div class=\"Profile\">\n");
      out.write("     <p style=\"color: black\">We are committed to serving diverse needs of young & old, rich & poor & those living in urban & rural communities.</p>\n");
      out.write("     <br>\n");
      out.write("     <p style=\"color: black\">Provision of excellent medical services by eminent, highly qualified doctors.</p><br>\n");
      out.write("     <p style=\"color: black\">Provision of services by qualified and dedicated nurses and paramedical staff.</p><br>\n");
      out.write("     <p style=\"color: black\">Maintaining highest ethical standards in patient care.</p>\n");
      out.write("   </div>\n");
      out.write("      \n");
      out.write("  <p style=\"color: cyan\">Harvard University</p>\n");
      out.write("  <div style=\"margin: 24px 0;\">\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("  </div>\n");
      out.write("  <p><button>Contact</button></p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("  <div class=\"card\">\n");
      out.write("     <h1 style=\"color: red\">Hospital For All</h1>\n");
      out.write("   <div class=\"Profile\">\n");
      out.write("     <p style=\"color: black\">We are committed to serving diverse needs of young & old, rich & poor & those living in urban & rural communities.</p>\n");
      out.write("     <br>\n");
      out.write("     <p style=\"color: black\">Provision of excellent medical services by eminent, highly qualified doctors.</p><br>\n");
      out.write("     <p style=\"color: black\">Provision of services by qualified and dedicated nurses and paramedical staff.</p><br>\n");
      out.write("     <p style=\"color: black\">Maintaining highest ethical standards in patient care.</p>\n");
      out.write("   </div>\n");
      out.write("      \n");
      out.write("  <p style=\"color: cyan\">Harvard University</p>\n");
      out.write("  <div style=\"margin: 24px 0;\">\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("  </div>\n");
      out.write("  <p><button>Contact</button></p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</footer> \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Our Board Member -->\n");
      out.write("<div style=\"height:600px;\"><a name=\"Board\" ></a>\n");
      out.write("          <h2 style=\"color: red; text-align: center; font-weight: bold;\">Our Board Member</h2>     \n");
      out.write("  <div class=\"row\">\n");
      out.write("<div class=\"column\">\n");
      out.write("             <div class=\"card\"  style=\"background-color: grey\">\n");
      out.write("                    <img src=\"Recep.jpg\" alt=\"John\" style=\"width:100%; height: 80px;\">\n");
      out.write("                      <br>\n");
      out.write("                 <h3 style=\"color: black\">Dr. Kaushal Singh </h3>\n");
      out.write("                 <p>AIIMS Delhi -(M.D , MBBS) </p>\n");
      out.write("                 <p>Contact - 7800344564</p>\n");
      out.write("                  \n");
      out.write("                <div style=\"margin: 24px 0;\">\n");
      out.write("                   <p>Follow on</p>\n");
      out.write("               <a href=\"#\"  style=\"color: black\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("                  <a href=\"#\"  style=\"color: red\"><i class=\"fa fa-instagram\"></i></a> \n");
      out.write("                <a href=\"#\"  style=\"color: green\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("                <a href=\"#\" ><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("               <a href=\"#\"  style=\"color: blue\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("               </div>\n");
      out.write("                \n");
      out.write("          </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<div class=\"column\">\n");
      out.write("             <div class=\"card\"  style=\"background-color: grey\">\n");
      out.write("                            <img src=\"Recep.jpg\" alt=\"John\" style=\"width:100%; height: 80px;\">\n");
      out.write("                            <br>\n");
      out.write("                 <h3 style=\"color: black\">Dr. Ashustosh Dixit</h3>\n");
      out.write("                 <p>AIIMS Bhopal -(M.D , MBBS) </p>\n");
      out.write("                 <p>Contact - 8009645625</p>\n");
      out.write("    \n");
      out.write("                <div style=\"margin: 24px 0;\">\n");
      out.write("                  <p>Follow on</p>\n");
      out.write("               <a href=\"#\"  style=\"color: black\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("                  <a href=\"#\"  style=\"color: red\"><i class=\"fa fa-instagram\"></i></a> \n");
      out.write("                <a href=\"#\"  style=\"color: green\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("                <a href=\"#\" ><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("               <a href=\"#\"  style=\"color: blue\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("               </div>\n");
      out.write("          </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("             <div class=\"card\"  style=\"background-color: grey\">\n");
      out.write("                 <img src=\"Recep.jpg\" alt=\"John\" style=\"width:100%; height: 80px;\">\n");
      out.write("                 <h3 style=\"color: black\">Dr. Abhinav yadav</h3>\n");
      out.write("                  <p>AIIMS Kanpur -(M.D , MBBS) </p>\n");
      out.write("                  <p>Contact - 9085678254</p>\n");
      out.write("                <div style=\"margin: 24px 0;\">\n");
      out.write("                   <p>Follow on</p>\n");
      out.write("                <a href=\"#\"  style=\"color: black\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("                  <a href=\"#\"  style=\"color: red\"><i class=\"fa fa-instagram\"></i></a> \n");
      out.write("                <a href=\"#\"  style=\"color: green\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("                <a href=\"#\" ><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("               <a href=\"#\"  style=\"color: blue\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("               </div>\n");
      out.write("          </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("             <div class=\"card\" style=\"background-color: grey\">\n");
      out.write("                 <img src=\"Recep.jpg\" alt=\"John\" style=\"width:100%; height: 80px;\">\n");
      out.write("                 <h3 style=\"color: black\">Dr. Archana Madhani</h3>\n");
      out.write("                  <p>AIIMS Banglore -( MBBS) </p>\n");
      out.write("                  <p>Contact - 7864653254</p>\n");
      out.write("                <div style=\"margin: 24px 0;\">\n");
      out.write("                   <p>Follow on</p>\n");
      out.write("                <a href=\"#\" style=\"color: black\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("                <a href=\"#\"  style=\"color: red\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                <a href=\"#\" style=\"color: green\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("                <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("               <a href=\"#\" style=\"color: blue\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("          </div>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("<!-- Here Award Coding -->\n");
      out.write("<div class=\"row\"><a name=\"Award\"></a> \n");
      out.write("    <h1 style=\"color:red; text-align: center\">Awards</h1>\n");
      out.write("    <div class=\"column\" style=\"width:33.33%; padding: -20px;\">\n");
      out.write("        <img src=\"111.jpg\" style=\"width:100%; height: 400px;\">   \n");
      out.write("        <p style=\"text-align:center; color: white\"> Award ceremony 2015 </p>\n");
      out.write("        <p style=\"text-align:center; color: white\">  Bulandshahar </p>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"column\" style=\"width:33.33%;padding: -20px; \">\n");
      out.write("         <img src=\"112.jpg\" style=\"width:100%; height: 400px;\">  \n");
      out.write("         <p style=\"text-align:center; color: white\"> Award ceremony 2017 </p>\n");
      out.write("        <p style=\"text-align:center; color: white\"> Bhuvneshwar </p>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"column\" style=\"width:33.33%; padding: -20px;\">\n");
      out.write("         <img src=\"113.jpg\" style=\"width: 100%; height: 400px;\"> \n");
      out.write("         <p style=\"text-align:center; color: white\"> Award ceremony 2019 </p>\n");
      out.write("        <p style=\"text-align:center; color: white\">  Lucknow </p>\n");
      out.write("    </div>\n");
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
