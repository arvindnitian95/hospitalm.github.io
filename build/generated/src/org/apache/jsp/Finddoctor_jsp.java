package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Finddoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<title>Find Doctor</title>\n");
      out.write("  <!-- code for search panel box -->\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    .login-box {\n");
      out.write("  width: 400px;\n");
      out.write("  height: 500px;\n");
      out.write("  position: absolute;\n");
      out.write("  overflow: hidden;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-120%,-30%);\n");
      out.write("  color: white;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  background: rgba(0,0,0,0.5);\n");
      out.write("  padding: 40px;\n");
      out.write("}\n");
      out.write(" h2 {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0 0 20px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: #ffffff;\n");
      out.write("/*  float: left;\n");
      out.write("  font-size: 40px;\n");
      out.write("  border-bottom: 6px solid #4caf50;\n");
      out.write("  margin-bottom: 50px;\n");
      out.write("  padding: 13px 0; */\n");
      out.write("}\n");
      out.write(".login-box p{\n");
      out.write("  margin: 20;\n");
      out.write("  padding: 20;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: #ffffff;\n");
      out.write("  /*  width: 100%;\n");
      out.write("  overflow: hidden;\n");
      out.write("  font-size: 20px;\n");
      out.write("  padding: 8px 0;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border-bottom: 1px solid #4caf50;  */\n");
      out.write("}\n");
      out.write(".login-box input,select{\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  width: 100%;\n");
      out.write("  /*\n");
      out.write("  width: 26px;\n");
      out.write("  float: left;\n");
      out.write("  text-align: center; */\n");
      out.write("}\n");
      out.write(".login-box input[type=text],\n");
      out.write(".login-box input[type=password]\n");
      out.write("{\n");
      out.write("  border: none;\n");
      out.write("  border-bottom: 1px solid #ffffff;\n");
      out.write("  background-color: transparent;\n");
      out.write("  outline: none;\n");
      out.write("  height: 40px;\n");
      out.write("  color: #ffffff;\n");
      out.write("  display: 16px;\n");
      out.write("}\n");
      out.write("::placeholder{\n");
      out.write("  color: #ffffff;\n");
      out.write("}\n");
      out.write(".login-box select\n");
      out.write("{\n");
      out.write("  margin-top: 20px;\n");
      out.write("  padding:  10px 0;\n");
      out.write("}\n");
      out.write(".login-box input[type=submit]\n");
      out.write("{\n");
      out.write("  border: none;\n");
      out.write("  height:  40px;\n");
      out.write("  outline: none;\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 15px;\n");
      out.write("  background-color: tomato;\n");
      out.write("  cursor: pointer;\n");
      out.write("  border-radius: 20px;\n");
      out.write("}\n");
      out.write(".login-box input[type=submit]:hover{\n");
      out.write("  background-color: cyan;\n");
      out.write("  color: #ffffff;\n");
      out.write("} \n");
      out.write(".login-box a\n");
      out.write("{\n");
      out.write("  color: #ffffff;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 14px;\n");
      out.write("    font-weight: bold;\n");
      out.write("\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write(" <!-- style for Card -->\n");
      out.write("  <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  font-size:  18px;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
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
      out.write("  width: 50%;\n");
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
      out.write("</style> \n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url(2.jpg); background-size: cover;\">\n");
      out.write("\t  <div id=\"container\" style=\"margin-top: 0px;\">\n");
      out.write("             \t<ul>\n");
      out.write("                <li>Home</li>\n");
      out.write("             \t\t<li>About us \n");
      out.write("                          <ul>\n");
      out.write("                          \t<li>Introduction</li>\n");
      out.write("                          \t<li>The Founder</li>\n");
      out.write("                          \t<li>Mission & Vission</li>\n");
      out.write("                          </ul>\n");
      out.write("             \t\t</li>\n");
      out.write("             \t\t\n");
      out.write("             \t\t<li>Appointments\n");
      out.write("                                 <ul>\n");
      out.write("                                 \t<li><a href=\"BookAppointment.html\"> Book Appointment</a></li>\n");
      out.write("                                 \t<li><a href=\"\"> Check ur Appoint</a></li>\n");
      out.write("                                 </ul>\n");
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
      out.write("             \t\t<li>Contact Us</li>\n");
      out.write("             \t\t<li><a href=\"Login.html\"> LogIn</a></li>\n");
      out.write("             \t</ul>\n");
      out.write("             </div>\n");
      out.write(" <!--body -->\n");
      out.write("<br><br><br><br>\n");
      out.write(" <div>\n");
      out.write("   <h2  style=\"text-align: center; color: whilte; font-size: 50px;\">FIND THE RIGHT DOCTOR</h2>\n");
      out.write(" </div>\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"column\">\n");
      out.write("       <div class=\"login-box\">\n");
      out.write("        <h2 style=\"font-size: 30px;\">Search Doctor's</h2>\n");
      out.write("\n");
      out.write("           <form action=\"\">\n");
      out.write("             <p>Specialisation</p>\n");
      out.write("                <select id=\"Specialisation\" name=\"Specialisation\">\n");
      out.write("                <option value=\"australia\">Andrology</option>\n");
      out.write("                <option value=\"australia\">Audiology and Speech Theorapy</option>\n");
      out.write("                <option value=\"canada\">Blood bank</option>\n");
      out.write("                <option value=\"usa\">Cardiology</option>\n");
      out.write("                 <option value=\"australia\">Cosmetology</option>\n");
      out.write("                <option value=\"australia\">Dermatology</option>\n");
      out.write("                <option value=\"canada\">ENT Surgery</option>\n");
      out.write("                <option value=\"usa\">Gynaecology</option>\n");
      out.write("                </select>\n");
      out.write("             <p>Doctor's Name</p>\n");
      out.write("               <select id=\"DoctorName\" name=\"Doctor\">\n");
      out.write("                <option value=\"australia\">Dr. Avasthi</option>\n");
      out.write("                <option value=\"australia\">Dr. Sri Ram</option>\n");
      out.write("                <option value=\"canada\">Dr. Abhimanyu</option>\n");
      out.write("                <option value=\"usa\">Dr. Keshav</option>\n");
      out.write("                <option value=\"australia\">Dr. Shyam Babu</option>\n");
      out.write("                <option value=\"australia\">Dr. Raja Ram</option>\n");
      out.write("                <option value=\"canada\">Dr. Akhilesh</option>\n");
      out.write("                <option value=\"usa\">Dr. Krishna</option>\n");
      out.write("                </select>\n");
      out.write("               <br><br><br><br>\n");
      out.write("             <input type=\"submit\" value=\"Search\" name=\"\">\n");
      out.write("           </form>\n");
      out.write("              \n");
      out.write("     </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("  <img src=\"Arvind.jpg\" alt=\"John\" style=\"width:100%; height: 300px;\">\n");
      out.write("     <h1 style=\"color: cyan\">OPD SCHEDULE</h1>\n");
      out.write("  <table style=\"width: 100%;color: white\">\n");
      out.write("    <tr\">\n");
      out.write("      <th style=\"color: red\">Day</th>\n");
      out.write("      <th style=\"color: red\">Time</th>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Monday</td>\n");
      out.write("      <td>2 PM - 4 PM</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Tuesday</td>\n");
      out.write("      <td>2 PM - 4 PM</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Wednesday</td>\n");
      out.write("      <td>2 PM - 4 PM</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Thursday</td>\n");
      out.write("      <td>2 PM - 4 PM</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Friday</td>\n");
      out.write("      <td>2 PM - 4 PM</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Saturday</td>\n");
      out.write("      <td>2 PM - 4 PM</td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("   <div class=\"Profile\">\n");
      out.write("     <h3 style=\"color: cyan;\">PROFILE</h3>\n");
      out.write("     <p style=\"color: white\">Dr. Gaiwal is associated with Lilavati Hospital since 2006 with more than 15 years of experience as an anaesthsiologist</p>\n");
      out.write("     <br><br>\n");
      out.write("     <p style=\"color: white\">She is a certified faculty for American Heart Association's CPCR</p>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"interest\">\n");
      out.write("    <h3 style=\"color: cyan\">INTEREST</h3>\n");
      out.write("    <ul style=\"color: white\">\n");
      out.write("      <li>paediatric Anaesthesia </li>\n");
      out.write("       <li>Acute Pain management</li>\n");
      out.write("    </ul>\n");
      out.write("  <p style=\"color: cyan\">Harvard University</p>\n");
      out.write("  <div style=\"margin: 24px 0;\">\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("  </div>\n");
      out.write("  <p><button>Contact</button></p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   \n");
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
