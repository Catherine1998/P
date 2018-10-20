package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NHuesped_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Menu.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("\r\n");
      out.write("        <table  style=\" width:100%; border: 1px solid black;\r\n");
      out.write("                border-collapse: collapse; font-size: 20px;\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("\r\n");
      out.write("                <td><a href=\"index.jsp\"> Inicio </a> </td>\r\n");
      out.write("                <td><a href=\"Reservar.jsp\"> Reservar </a></td>\r\n");
      out.write("                <td><a href=\"Reservaciones.jsp\"> Reservaciones </a></td>\r\n");
      out.write("                <td><a href=\"Facturar.jsp\"> Facturar </a></td>\r\n");
      out.write("                <td><a href=\"Facturas.jsp\"> Facturas </a></td>\r\n");
      out.write("                <td><a href=\"Servicios.jsp\"> Servicios </a></td>\r\n");
      out.write("                <td><a href=\"Huespedes.jsp\"> Huespedes </a></td>\r\n");
      out.write("                \r\n");
      out.write("                <!-- <td><a href=\"Habitaciones.jsp\"> Habitaciones </a></td> -->\r\n");
      out.write("                <td><a href=\"Habitacion\"> Habitaciones </a></td>\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </center>     \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<br>\r\n");
      out.write("        <form action=\"nhueped.do\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <center>\r\n");
      out.write("                <h2>Nuevo Huesped</h2>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                Nombre:  <input type=\"text\" name=\"nombre\" placeholder=\"Ingrese Nombre\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>Apellido: <input type=\"text\"  name=\"apellido\" placeholder=\"Ingrese el apellido\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>Direccion:<input type=\"text\" name=\"direccion\"  placeholder=\"Ingrese dirección\" style=\" top: 2px; \">\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br><input type=\"submit\" value=\"Guardar\" name=\"guardar\" ><input type=\"submit\" value=\"Cancelar\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </form> \r\n");
      out.write("            </center>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
