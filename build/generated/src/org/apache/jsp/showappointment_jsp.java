package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class showappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    \n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
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
      out.write("\t<title>Show Appointment</title>\n");
      out.write("        <style>\n");
      out.write("table, td, th {\n");
      out.write("  border: 1px solid black;\n");
      out.write("}\n");
      out.write("#table2 {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url(.jpg); background-size: cover;\">  \n");
      out.write("                       <!-- code for 1st nav bar -->\n");
      out.write("                        <div class=\"onoffswitch3\" style=\"background-color:  #33ffd6; width: 100%; height: 40px;\">\n");
      out.write("                                 \n");
      out.write("                                  <label class=\"onoffswitch3-label\" for=\"myonoffswitch3\">\n");
      out.write("                                   <span class=\"onoffswitch3-inner\">\n");
      out.write("                                  <span class=\"onoffswitch3-active\">\n");
      out.write("                                  <marquee class=\"scroll-text\" style=\"font-size: 20px\">Avengers: Infinity War's Iron Spider Suit May Use Bleeding Edge Tech  <span class=\"glyphicon glyphicon-forward\" style=\"color: red\"></span> Russo brothers ask for fans not to spoil Avengers: Infinity War <span class=\"glyphicon glyphicon-forward\" style=\"color: red\"></span>  Bucky's Arm Miraculously Regenerates On Avengers: Infinity War Poster</marquee>\n");
      out.write("                                  <!-- <span class=\"onoffswitch3-switch\"><span class=\"glyphicon glyphicon-remove\"></span></span> -->\n");
      out.write("                                 <!-- </span>\n");
      out.write("                                   <span class=\"onoffswitch3-inactive\"><span class=\"onoffswitch3-switch\"></span></span>\n");
      out.write("                                  </span>\n");
      out.write("                                 </label> -->\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write(" <!-- code for 2nd Nav bar -->                       \n");
      out.write("             <div id=\"container\" style=\"margin-top: -10px;\">\n");
      out.write("             \t<ul>\n");
      out.write("             \t\t<li>About us \n");
      out.write("                          <ul>\n");
      out.write("                          \t<li>Introduction</li>\n");
      out.write("                          \t<li>The Founder</li>\n");
      out.write("                          \t<li>Mission & Vission</li>\n");
      out.write("                          \t<li>Charity Work</li>\n");
      out.write("                          \t<li>Board of Trustees</li>\n");
      out.write("                          \t<li>Management</li>\n");
      out.write("                          \t<li>Awards & Accreditations</li>\n");
      out.write("                          \t<li>Media/Press</li>\n");
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
      out.write("                               \t    <li>Accommodation</li>\n");
      out.write("                               \t    <li>Find Doctor</li>\n");
      out.write("                               \t    <li>Inpatients</li>\n");
      out.write("                               \t    <li>Patient Edu. Broucher</li>\n");
      out.write("                               \t    <li>Empanelled Corporates</li>\n");
      out.write("                               \t    <li>Feedback</li>\n");
      out.write("                               \t    <li>Rights </li>\n");
      out.write("                               </ul>\n");
      out.write("             \t\t</li>\n");
      out.write("             \t\t<li>Appointments\n");
      out.write("                                 <ul>\n");
      out.write("                                 \t<li><a href=\"BookAppointment.html\"> Book Appointment</a></li>\n");
      out.write("                                 \t<li><a href=\"\"> Check Appoint</a></li>\n");
      out.write("                                 </ul>\n");
      out.write("                    </li>\n");
      out.write("             \t\t<li>Academics\n");
      out.write("                                <ul>\n");
      out.write("                                   <li>Careers</li>\n");
      out.write("                                   <li>CME</li>\n");
      out.write("                                   <li>DNB</li>\n");
      out.write("                                   <li>LHMT</li>\n");
      out.write("                                   <li>MUHS Fellowship</li>\n");
      out.write("                                   <li>Nurses</li>\n");
      out.write("                                   <li>Research</li>\n");
      out.write("                                </ul>\n");
      out.write("             \t\t</li>\n");
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
      out.write("                        <li><a href=\"login.jsp\"> LogIn</a></li>\n");
      out.write("             \t</ul>\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("<!-- Here code News Slider  -->\n");
      out.write("<br><br><br><br>\n");
      out.write("<table  id=\"table2\" width=\"98%\" align=\"center\" style=\"border:2px solid #000000;\">\n");
      out.write("<tr>\n");
      out.write("<td colspan=13 align=\"center\"\n");
      out.write("style=\"background-color:ffeeff\">\n");
      out.write("<h1 style=\"color:blue; text-align: center;font-weight:bold; \">Appointment Record</h1></td>\n");
      out.write("</tr>\n");
      out.write("<tr style=\"background-color:efefef;\" border: 2px; >\n");
      out.write("<td><b>Patient Id</b></td>\n");
      out.write("<td><b>Patient Name</b></td>\n");
      out.write("<td><b>Last name</b></td>\n");
      out.write("<td><b>FatherName</b></td>\n");
      out.write("<td><b>Mobile</b></td>\n");
      out.write("<td><b>Gender</b></td>\n");
      out.write("<td><b>Doctor Name</b></td>\n");
      out.write("<td><b>City</b></td>\n");
      out.write("<td><b>District</b></td>\n");
      out.write("<td><b>State</b></td>\n");
      out.write("<td><b>Country</b></td>\n");
      out.write("<td><b>Date</b></td>\n");
      out.write("<td><b>Subject</b></td>\n");
      out.write("\n");
      out.write("</tr>\n");

int count=0;
String color = "#F9EBB3";


if(request.getAttribute("empList")!=null)
{
ArrayList al = (ArrayList)request.getAttribute("empList");
Iterator itr = al.iterator();


while(itr.hasNext()){

if((count%2)==0){
color = "#eeffee";
}
else{
color = "#F9EBB3";
}
count++;
ArrayList empList = (ArrayList)itr.next();

      out.write("\n");
      out.write("<tr style=\"background-color:");
      out.print(color);
      out.write(";\">\n");
      out.write("<td>");
      out.print(empList.get(0));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(1));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(2));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(3));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(4));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(5));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(6));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(7));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(8));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(9));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(10));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(11));
      out.write("</td>\n");
      out.write("<td>");
      out.print(empList.get(12));
      out.write("</td>\n");
      out.write("</tr>\n");

}
}

      out.write('\n');

if(count==0){

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td colspan=8 align=\"center\"\n");
      out.write("style=\"background-color:eeffee\"><b>No Record</b></td>\n");
      out.write("</tr>\n");

}

      out.write("\n");
      out.write("</table>\n");
      out.write("     \n");
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
