package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.AdultoMayor;
import modelo.Funcionalidad;
import listas.ListaSEAdulto;
import listas.ListaSEMedicamento;

public final class formularioAdultoMayor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Adulto Mayor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul class=\"nav justify-content-center bg-primary\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <h2>ADULTO MAYOR</h2>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <h2>-</h2>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <h2>AÑADIR</h2>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <div class = \"container mt-4\">\n");
      out.write("            <div class = \"row justify-content-md-center\">\n");
      out.write("                <div class = \"col-lg-6\">\n");
      out.write("                    <form action=\"almacenamiento.jsp\" method=\"post\">\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Número de identificación</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"identificacion\" placeholder=\"identificacion\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Nombre paciente</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"nombre\" placeholder=\"nombre\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Apellidos paciente</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"apellidos\" placeholder=\"apellidos\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Número de habitación</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"numero_habitacion\" placeholder=\"habitación\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Encargado/Responsable del paciente</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"encargado\" placeholder=\"nombre responsable\">\n");
      out.write("                        </div>\n");
      out.write("                        <label>Ficha médica</label>\n");
      out.write("                        <div class=\"input-group mb-4\">                            \n");
      out.write("                            <input class=\"form-control\" type=\"file\" name = \"ficha_medica\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-grid gap-2 d-md-flex justify-content-between\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary col-3\">Volver</button>\n");
      out.write("                            <button type=\"\" class=\"btn btn-primary col-3\">Enviar</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
