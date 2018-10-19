package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mx.edu.ipn.cecyt9.edusite.model.Info;
import java.util.ArrayList;
import java.sql.*;

public final class Consulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    Info in = new Info();
    ArrayList<Info> inf = new ArrayList();
    if (request.getAttribute("in") != null) {
        inf = (ArrayList<Info>) request.getAttribute("regs");
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Iniciar Sesi&oacute;n</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h1>Iniciar Sesi&oacute;n</h1>\n");
      out.write("        \n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>A. Paterno</th>\n");
      out.write("                    <th>A. Materno</th>\n");
      out.write("                    <th>Materia</th>\n");
      out.write("                    <th>Escuela</th>\n");
      out.write("                    <th>Deporte</th>\n");
      out.write("                </tr>\n");
      out.write("            ");

                for (int i = 0; i < inf.size(); i++){
                Info regi = inf.get(i);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <p>Nombre: ");
      out.print(regi.getNombre());
      out.write("</p>\n");
      out.write("                </td>    \n");
      out.write("                <td>    \n");
      out.write("                    <p>Paterno:");
      out.print(regi.getApePater());
      out.write("</p>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <p>Materno");
      out.print(regi.getApeMater());
      out.write("</p>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <p>Materia:");
      out.print(regi.getMatFav());
      out.write("</p>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <p>escuela:");
      out.print(regi.getEscuela());
      out.write("</p>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <p>Deporte:");
      out.print(regi.getDepFav());
      out.write("</p>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
  }
            
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
