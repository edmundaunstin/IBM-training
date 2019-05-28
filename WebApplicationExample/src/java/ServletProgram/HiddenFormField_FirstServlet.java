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

@WebServlet(name = "HiddenFormField_FirstServlet", urlPatterns = {"/HiddenFormField_FirstServlet"})
public class HiddenFormField_FirstServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String s=request.getParameter("val1");
         String p=request.getParameter("val2");
        
         response.setContentType("text/html");   
         PrintWriter out=response.getWriter(); 
         
         String url="http://localhost:8090/WebApplicationExample/URLRewrittingSecondServlet?"+"val1=" + s + "&val2="+ p;
                 
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<H1>");
            out.println("<div>");
            out.println( "<h2>value 1:" +s);
            out.println("<br>");
            out.println( "<h2>value 2:" +p);
            out.println("</div>");
             out.println("<form action=\"HiddenFormField_SecondServlet\">");
              out.println("<input type =\"hidden\" name =\"val1\" value="+s +">");
              out.println("<input type =\"hidden\" name =\"val2\" value="+p +">");
             out.println("<input type =\"submit\" name =\"sub\" value=\"SUBMIT\">");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");

    }
}