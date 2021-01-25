package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registeruser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("  \t<meta charset=\"utf-8\">\n");
      out.write("\t<title>Registration Form</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("*{\n");
      out.write("  margin: 0px;\n");
      out.write("  padding: 0px;\n");
      out.write("}\n");
      out.write("#container ul{\n");
      out.write("  list-style: none;\n");
      out.write("\n");
      out.write("}   \n");
      out.write("#container ul li{\n");
      out.write("  background-color:#a6a6a6;\n");
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
      out.write("  background-color: cyan;\n");
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
      out.write("  </head>\n");
      out.write("    <body class=\"bd\">\n");
      out.write("    \t    <!--  Body -->\n");
      out.write("            <div id=\"container\" style=\"margin-top: 0px;\">\n");
      out.write("              <ul>\n");
      out.write("                <li>HOME</li>\n");
      out.write("                <li>About us\n");
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
      out.write("                                  <li>Book Appointment</li>\n");
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
      out.write("                <li>LogIn</li>\n");
      out.write("              </ul>\n");
      out.write("             </div>\n");
      out.write("                    \n");
      out.write("          \n");
      out.write("<!--  Log In Form  -->\n");
      out.write("      <div class=\"login-box\" style=\"margin-top: 40px;\">\n");
      out.write("      \t<h2>Registeration Form</h2>\n");
      out.write("\n");
      out.write("        <form action=\"Registrationconn.jsp\" method=\"get\">\n");
      out.write("             <p>UserName</p>\n");
      out.write("             <input type=\"text\" id=\"\" name=\"name\" placeholder=\"enter your Email\">\n");
      out.write("             <p>Password</p>\n");
      out.write("             <input type=\"Password\" id=\"\" name=\"pass\" placeholder=\"enter your Password\">\n");
      out.write("             <p>Gmail id</p>\n");
      out.write("             <input type=\"text\" id=\"\" name=\"gmail\" placeholder=\"enter your Gmail id\">\n");
      out.write("             <p>User Type</p>\n");
      out.write("             <select name=\"usertype\">\n");
      out.write("             <option name=\"usertype\">Admin</option> \n");
      out.write("             <option name=\"usertype\">Receptionist</option>\n");
      out.write("              </select>\n");
      out.write("          \n");
      out.write("             <input type=\"submit\" value=\"Register\" name=\"\">\n");
      out.write("             <a href=\"#\">Forgot Password</a>\n");
      out.write("           </form>\n");
      out.write("              \n");
      out.write("     </div>\n");
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
