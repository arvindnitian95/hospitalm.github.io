
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          String _username=request.getParameter("A");
          String _password = request.getParameter("P");
          if(_username!=null && _password != null)
          {
            if(_username.equals("lokesh") && _password.equals("12345"))
            {
                HttpSession session=request.getSession();
                session.setAttribute("name",_username);
                response.sendRedirect("Admin.jsp");
            }
            else
            {
                out.println("Invalid Username or Password");
            }
          }
          else
          {
          out.println("Empty UserName or Password");
          }
        }
    }

    
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
