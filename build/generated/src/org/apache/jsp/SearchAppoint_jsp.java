package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchAppoint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("  \t<meta charset=\"utf-8\">\n");
      out.write("\t<title>Search Appointment</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("    <body style=\"background-image: url(d1.jpg); background-size: cover;\">\n");
      out.write("<!-- code for 1st nav bar -->\n");
      out.write("                        <div class=\"onoffswitch3\" style=\"background-color:  #33ffd6; width: 100%; height: 40px;\">\n");
      out.write("                                 \n");
      out.write("                                  <label class=\"onoffswitch3-label\" for=\"myonoffswitch3\">\n");
      out.write("                                   <span class=\"onoffswitch3-inner\">\n");
      out.write("                                  <span class=\"onoffswitch3-active\">\n");
      out.write("                                  <marquee class=\"scroll-text\" style=\"font-size: 20px\" >Avengers: Infinity War's Iron Spider Suit May Use Bleeding Edge Tech  <span class=\"glyphicon glyphicon-forward\" style=\"color: red\"></span> Russo brothers ask for fans not to spoil Avengers: Infinity War <span class=\"glyphicon glyphicon-forward\" style=\"color: red\" ></span>  Bucky's Arm Miraculously Regenerates On Avengers: Infinity War Poster</marquee>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("<!-- Code for 2nd Nav Bar -->\n");
      out.write("            <div id=\"container\" style=\"margin-top: -10px;\">\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"index.html\"> HOME</a></li>\n");
      out.write("                <li><a href=\"Aboutus.html\"> About us</a></li>\n");
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
      out.write("                                     <li><a href=\"BookAppoint.jsp\">Book Appointment</a></li>\n");
      out.write("                                     <li><a href=\"SearchAppoint.jsp\"> Search Appoint</a> </li>\n");
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
      out.write(" <div class=\"login-box\" style=\"margin-top: 60px\">\n");
      out.write("        <h2>Search Appointment</h2>\n");
      out.write("\n");
      out.write("           <form method=\"post\" name=\"frm\" action=\"Appointregister\">\n");
      out.write("             <p>Appointment Id</p>\n");
      out.write("             <input type=\"text\"  name=\"id\" placeholder=\"Appointment Id\">\n");
      out.write("             <p>Mobile Number</p>\n");
      out.write("             <input type=\"Password\"  name=\"mob\" placeholder=\"Mobile Number\">\n");
      out.write("             <br></br>\n");
      out.write("             <br>\n");
      out.write("             <input type=\"submit\" value=\"Search\" name=\"\">\n");
      out.write("             <br>\n");
      out.write("             <p><a href=\"#\"> Forgot Appointment Id</a></p>\n");
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
