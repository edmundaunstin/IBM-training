/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletProgram;

import JavaPrograms.JavaBeanClass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
@WebServlet(name = "UseBeamExample_Servlet", urlPatterns = {"/UseBeamExample_Servlet"})
public class UseBeamExample_Servlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        JavaBeanClass  be = new JavaBeanClass("38","jan","ibm","designer");
		
		request.setAttribute("employee", be);
		
		      RequestDispatcher rd = request.getRequestDispatcher("UseBeanExample.jsp");
		
		rd.forward(request, response);
    }

   

}
