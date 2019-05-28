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


//@WebServlet(name = "CalculatorServlet", urlPatterns = {"/CalculatorServlet"})
public class CalculatorServlet extends HttpServlet {

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
         int a=0;
         String val1=request.getParameter("add");
         String val2=request.getParameter("sub");
         String val3=request.getParameter("mul");
         String val4=request.getParameter("div");
            response.setContentType("text/html");
         
         
         PrintWriter out=response.getWriter(); 
         if(val1!=null){
           a=Integer.parseInt(s)+Integer.parseInt(p);
         }
         else if(val2!=null){
             a=Integer.parseInt(s)-Integer.parseInt(p);
         }
         else if(val3!=null){
            a=Integer.parseInt(s)*Integer.parseInt(p) ;
         }
         else if(val4!=null){
            a= Integer.parseInt(s)/Integer.parseInt(p) ;
         }
          out.println("<html>");
         out.println("<head>");
       out.println("</head>");
       out.println("<body>");
       out.println("<H1>");
       out.println("<div>");
       out.println(" "+ a);
       out.println("</div>");
       out.println("</body>");
       out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
   

}
