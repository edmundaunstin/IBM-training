/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletProgram;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet(name = "CookiesServlet", urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         String s=request.getParameter("name");
         String p=request.getParameter("value");
          Cookie cookie=new Cookie(s,p);
           cookie.setMaxAge(24*60);
         response.setContentType("text/html");
    
         PrintWriter out=response.getWriter(); 
          
          out.println("<html>");
         out.println("<head>");
       out.println("</head>");
       out.println("<body>");
       out.println("<H1>");
       out.println("<div>");
       out.println("cookie value"+cookie.getName());
       out.println("</div>");
       out.println("</body>");
       out.println("</html>");
        
    }

  
   
}
