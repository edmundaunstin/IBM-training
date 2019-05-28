
package ServletProgram;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet(name = "GetHTTPSessionServlet", urlPatterns = {"/GetHTTPSessionServlet"})
public class GetHTTPSessionServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        HttpSession session=request.getSession();
        
         String s=(String)session.getAttribute("UserData");
    
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
    
    session.invalidate();
            }
}
