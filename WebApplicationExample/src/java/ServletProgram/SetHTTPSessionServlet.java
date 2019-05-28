
package ServletProgram;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SetHTTPSessionServlet", urlPatterns = {"/SetHTTPSessionServlet"})
public class SetHTTPSessionServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         String s=request.getParameter("name");
         HttpSession session=request.getSession();
         session.setAttribute("UserData", s);
          
         response.setContentType("text/html");
    
         PrintWriter out=response.getWriter(); 
          
          out.println("<html>");
         out.println("<head>");
       out.println("</head>");
       out.println("<body>");
       out.println("<H1>");
       out.println("<div>");
       out.println("VALUE STORED "+ s);
       out.println("</div>");
       out.println("</body>");
       out.println("</html>");
    }

   

}
