package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addReceptionist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("  \t<meta charset=\"utf-8\">\n");
      out.write("\t<title>AddReceptionist</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("*{\n");
      out.write("  margin: 0px;\n");
      out.write("  padding: 0px;\n");
      out.write("}\n");
      out.write("#container ul{\n");
      out.write("  list-style: none;\n");
      out.write("\n");
      out.write("}   \n");
      out.write("#container ul li{\n");
      out.write("  background-color: #a6a6a6;\n");
      out.write("  width: 149px;\n");
      out.write("  border: 1px solid white;\n");
      out.write("  height: 50px;\n");
      out.write("  line-height: 50px;\n");
      out.write("  text-align: center;\n");
      out.write("  float: left;\n");
      out.write("    color: black;\n");
      out.write("    font-size: 20px;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("#container ul li:hover{\n");
      out.write("  background-color: green;\n");
      out.write("}\n");
      out.write("#container ul ul {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("#container ul li:hover > ul{\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("#container ul ul ul{\n");
      out.write("  margin-left: 150px;\n");
      out.write("  top: 0px;\n");
      out.write("position: absolute;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 15px;\n");
      out.write("  padding: 10px;\n");
      out.write("  border: 2px solid #ccccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin-top: 6px;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: cyan;\n");
      out.write("  color: red;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color:  cyan;\n");
      out.write("}\n");
      out.write("::placeholder{\n");
      out.write("  color: black;\n");
      out.write("  border: 5px;\n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: black;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
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
      out.write("\n");
      out.write("</style>\n");
      out.write("  </head>\n");
      out.write("    <body style=\"background-image: url(Bil.jpeg); background-size: cover;\">\n");
      out.write("    \t      <div id=\"container\" style=\"margin-top: 0px;\">\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"index.html\"> HOME</a></li>\n");
      out.write("                <li><a href=\"\"> About us</a>\n");
      out.write("                          <ul>\n");
      out.write("                            <li>Introduction</li>\n");
      out.write("                            <li>The Founder</li>\n");
      out.write("                            <li>Mission & Vission</li>\n");
      out.write("                            <li>Charity Work</li>\n");
      out.write("                            <li>Board of Trustees</li>\n");
      out.write("                            <li>Management</li>\n");
      out.write("                            <li>Awards & Accreditations</li>\n");
      out.write("                            <li>Media/Press</li>\n");
      out.write("                          </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>Facilities\n");
      out.write("                                <ul>\n");
      out.write("                                  <li>Health CheckUp\n");
      out.write("                                                    <ul>\n");
      out.write("                                                      <li>Basic Package</li>\n");
      out.write("                                                      <li>Cardiac Package</li>\n");
      out.write("                                                      <li>Comprehensive</li>\n");
      out.write("                                                      <li>Super Package</li>\n");
      out.write("                                                      <li>Women Special</li>\n");
      out.write("                                                    </ul> \n");
      out.write("                                  </li>\n");
      out.write("                                  <li>Intensive Care\n");
      out.write("                                                    <ul>\n");
      out.write("                                                      <li>ICCU</li>\n");
      out.write("                                                      <li>ICU</li>\n");
      out.write("                                                      <li>Neonatal ICU</li>\n");
      out.write("                                                      <li>Paediatric ICU</li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                  </li>\n");
      out.write("                                  <li>OT Comlexes</li>\n");
      out.write("                                  <li>Wards\n");
      out.write("                                             <ul>\n");
      out.write("                                              <li>General Ward</li>\n");
      out.write("                                              <li>Semi Private Ward</li>\n");
      out.write("                                              <li>Private Ward</li>\n");
      out.write("                                              <li>Deluxe Room</li>\n");
      out.write("                                              <li>Super Delux</li>\n");
      out.write("                                             </ul>\n");
      out.write("                                  </li>\n");
      out.write("                                  <li>Diadnostic Wing\n");
      out.write("                                                    <ul>\n");
      out.write("                                                      <li>Pathology</li>\n");
      out.write("                                                        <li>Colposcopy</li> \n");
      out.write("                                                       <li>Radiology</li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                  </li>\n");
      out.write("                                  <li>EEG</li>\n");
      out.write("                                  <li>Obesity & Pain clinic</li>\n");
      out.write("                                  <li>Pharmacy</li>\n");
      out.write("                                  <li>Ambulance</li>\n");
      out.write("                                </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>Pateint\n");
      out.write("                               <ul>\n");
      out.write("                                    <li>Accommodation</li>\n");
      out.write("                                    <li>Empannelled Insurance</li>\n");
      out.write("                                    <li>Find Doctor</li>\n");
      out.write("                                    <li>Inpatients</li>\n");
      out.write("                                    <li>Patient Edu. Broucher</li>\n");
      out.write("                                    <li>Tarrif</li>\n");
      out.write("                                    <li>Empanelled Corporates</li>\n");
      out.write("                                    <li>Feedback</li>\n");
      out.write("                                    <li>Floor Directory</li>\n");
      out.write("                                    <li>Rights & Responsibility</li>\n");
      out.write("                               </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>Appointments\n");
      out.write("                                 <ul>\n");
      out.write("                                  <li><a href=\"BookAppointment.html\">Book Appointment</a></li>\n");
      out.write("                                  <li>Check ur Appoint</li>\n");
      out.write("                                 </ul>\n");
      out.write("                    </li>\n");
      out.write("                <li>Academics\n");
      out.write("                                <ul>\n");
      out.write("                                   <li>Careers</li>\n");
      out.write("                                   <li>CME</li>\n");
      out.write("                                   <li>DNB</li>\n");
      out.write("                                   <li>LHMT</li>\n");
      out.write("                                   <li>MUHS Fellowship</li>\n");
      out.write("                                   <li>Nurses</li>\n");
      out.write("                                   <li>Research</li>\n");
      out.write("                                </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>Department\n");
      out.write("                                <ul>\n");
      out.write("                                  <li>Medicine\n");
      out.write("                                        <ul>\n");
      out.write("                                          <li>Internal Medicine</li>\n");
      out.write("                                          <li>Endocrinology / Diabetes</li>\n");
      out.write("                                          <li>Gastroenterology</li>\n");
      out.write("                                          <li>Oncology</li>\n");
      out.write("                                          <li>Nephrology</li>\n");
      out.write("                                          <li>Psychiatry</li>\n");
      out.write("                                          <li>Cardiology</li>\n");
      out.write("                                          <li>Neurology</li>\n");
      out.write("                                          <li>Dermatology</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                  </li>\n");
      out.write("                                  <li>Surgical\n");
      out.write("                                          <ul>\n");
      out.write("                                            <li>Plastic & Microvascular Surgery</li>\n");
      out.write("                                            <li>General Surgery</li>\n");
      out.write("                                            <li>Laparoscopic Surgery</li>\n");
      out.write("                                            <li>Urosurgery</li>\n");
      out.write("                                            <li>Onco Surgery</li>\n");
      out.write("                                            <li>Dentistry</li>\n");
      out.write("                                            <li>ENT</li>\n");
      out.write("                                            <li>Ophthalmic</li>\n");
      out.write("                                            <li>Orthopaedics</li>\n");
      out.write("                                            <li>Pediatrics</li>\n");
      out.write("                                            <li>Obstetrics & Gynecology</li>\n");
      out.write("                                          </ul>\n");
      out.write("                                  </li>\n");
      out.write("                                </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>Contact Us</li>\n");
      out.write("                <li><a href=\"LogIn.html\">LogIn</a></li>\n");
      out.write("              </ul>\n");
      out.write("             </div>\n");
      out.write("  <!-- form Created -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<h3 style=\"text-align: center;color: #ff0000; font-size: 40px;\">Add Receptionist</h3>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <form action=\"Receptionistconn.jsp\" method=\"get\">\n");
      out.write("<div class=\"column\">\n");
      out.write("  \n");
      out.write("    <label for=\"fname\">First Name</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"firstname\"  placeholder=\"First Name\">\n");
      out.write("     <label for=\"lname\">Last Name</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"lastname\" placeholder=\"Last Name\">\n");
      out.write("\n");
      out.write("    <label for=\"mobile\">Mobile Number</label>\n");
      out.write("    <input type=\"text\" id=\"mobile\" name=\"mobile\" placeholder=\"Mobile Number\">\n");
      out.write("\n");
      out.write("    <label for=\"gender\">Gender</label>\n");
      out.write("    <select  name=\"gender\">\n");
      out.write("      <option name=\"gender\">Male</option>\n");
      out.write("      <option name=\"gender\">Female</option>\n");
      out.write("    </select><br><br>\n");
      out.write("    <label for=\"gmail\">Gmail ID</label>\n");
      out.write("    <input type=\"Gmail\" id=\"Mobile\" name=\"gmail\" placeholder=\"Enter Gmail id\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("    <label for=\"lname\">City</label>\n");
      out.write("    <input type=\"text\" id=\"city\" name=\"city\"  placeholder=\"City\">\n");
      out.write("     <label for=\"district\">District</label>\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"district\" placeholder=\"District\">\n");
      out.write("    <label for=\"lname\">State</label>\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"state\" placeholder=\"State\">\n");
      out.write("    <label for=\"country\">Country</label>\n");
      out.write("    <select  name=\"country\">\n");
      out.write("      <option name=\"country\">India</option>\n");
      out.write("      <option name=\"country\">Australia</option>\n");
      out.write("      <option name=\"country\">Canada</option>\n");
      out.write("      <option name=\"country\">USA</option>\n");
      out.write("    </select><br><br>\n");
      out.write("    <label for=\"dob\">Date of Birth</label>\n");
      out.write("    <input type=\"Date\" id=\"DOB\" name=\"dob\" placeholder=\"Enter date of Birth\">\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("        <input type=\"submit\" style=\"width: 400px; margin-left: 33.33%;\">\n");
      out.write(" </form>\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("   </body>\n");
      out.write("</html>\n");
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
