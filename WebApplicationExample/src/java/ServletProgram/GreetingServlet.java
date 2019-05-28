
package ServletProgram;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("GreetingServlet")
public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String s=request.getParameter("user");
       response.setContentType("text/html");
       
       PrintWriter out=response.getWriter();              
       
       out.println("<html>");
       out.println("<head>");
       out.println("</head>");
       out.println("<body>");
       out.println("<div>");
       out.println("WELCOME"+"    "+s);
       out.println("</div>");
       out.println("</body>");
       out.println("</html>");
       
       
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    

}
