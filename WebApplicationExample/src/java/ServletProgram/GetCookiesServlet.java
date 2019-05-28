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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "GetCookiesServlet", urlPatterns = {"/GetCookiesServlet"})
public class GetCookiesServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         String s=request.getParameter("name");
         Cookie cookie[]=request.getCookies();
         
         String cookieValue="HELLO";
         for(Cookie c:cookie){
             if(c.getName() .equals(s));
             {
                 cookieValue=c.getValue();
                 break;
             }
         }
        
          response.setContentType("text/html");
    
         PrintWriter out=response.getWriter(); 
          
          out.println("<html>");
         out.println("<head>");
       out.println("</head>");
       out.println("<body>");
       out.println("<H1>");
       out.println("<div>");
       out.println("cookie value  "+cookieValue);
       out.println("</div>");
       out.println("</body>");
       out.println("</html>");
        
        
        
    }

   
}
