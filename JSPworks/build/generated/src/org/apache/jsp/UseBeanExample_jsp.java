package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import JavaPrograms.JavaBeanClass;

public final class UseBeanExample_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>Details of Employee..</h1>\n");
      out.write("\t\n");
      out.write("\t");

	JavaBeanClass be = (JavaBeanClass)request.getAttribute("employee");
	
      out.write("\n");
      out.write("\tE ID : ");
      out.print( be.getEmpId() );
      out.write("<br/>\n");
      out.write("\tName : ");
      out.print( be.getEmpName() );
      out.write("<br/>\n");
      out.write("\tDept : ");
      out.print( be.getEmpDept() );
      out.write("<br/>\n");
      out.write("\tDeg : ");
      out.print( be.getEmpDeg() );
      out.write("<br/>    \n");
      out.write("        \n");
      out.write(" ----------------------------------------------------------------\n");
      out.write(" ");
      JavaPrograms.JavaBeanClass Employee = null;
      synchronized (request) {
        Employee = (JavaPrograms.JavaBeanClass) _jspx_page_context.getAttribute("Employee", PageContext.REQUEST_SCOPE);
        if (Employee == null){
          Employee = new JavaPrograms.JavaBeanClass();
          _jspx_page_context.setAttribute("Employee", Employee, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("     ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((JavaPrograms.JavaBeanClass)_jspx_page_context.findAttribute("Employee")).getEmpId())));
      out.write("\n");
      out.write("     ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((JavaPrograms.JavaBeanClass)_jspx_page_context.findAttribute("Employee")).getEmpName())));
      out.write("\n");
      out.write("     ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((JavaPrograms.JavaBeanClass)_jspx_page_context.findAttribute("Employee")).getEmpDept())));
      out.write("\n");
      out.write("     ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((JavaPrograms.JavaBeanClass)_jspx_page_context.findAttribute("Employee")).getEmpDeg())));
      out.write("\n");
      out.write(" \n");
      out.write(" ------------------------------------------------------------------\n");
      out.write(" Emp ID : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee . empId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write(" Emp Name : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee . empName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write(" Emp Dept : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee . empDept}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write(" Emp Deg : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Employee . empDeg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
