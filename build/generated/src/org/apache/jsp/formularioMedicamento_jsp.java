package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.AdultoMayor;
import listas.ListaSEMedicamento;
import listas.ListaSEAdulto;
import modelo.Medicamento;

public final class formularioMedicamento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Medicamento</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul class=\"nav justify-content-center bg-primary\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <h2>MEDICAMENTO</h2>\n");
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
      out.write("            \n");
      out.write("            <div class = \"row justify-content-md-center\">\n");
      out.write("                <div hidden=\"\">\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                <div class = \"col-lg-6\">\n");
      out.write("                    <form action=\"formularioMedicamento.jsp\" method=\"post\">\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Nombre del medicamento</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"nombreMedi\" placeholder=\"nombre\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Dosis</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"dosisMedi\" placeholder=\"ejemplo: 50 mg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Hora</label>\n");
      out.write("                            <input type=\"time\" class=\"form-control\" name=\"horaMedi\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label>Día</label>\n");
      out.write("                            <select class=\"form-select\" name = \"diaMedi\">\n");
      out.write("                                <option selected>Seleccionar día de la actividad</option>\n");
      out.write("                                <option value=\"lunes\">Lunes</option>\n");
      out.write("                                <option value=\"martes\">Martes</option>\n");
      out.write("                                <option value=\"miercoles\">Miércoles</option>\n");
      out.write("                                <option value=\"jueves\">Jueves</option>\n");
      out.write("                                <option value=\"viernes\">Viernes</option>\n");
      out.write("                                <option value=\"sabado\">Sábado</option>\n");
      out.write("                                <option value=\"domingo\">Domingo</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-grid gap-2 d-md-flex justify-content-between\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary col-3\">Volver</button>\n");
      out.write("                            <button type=\"\" class=\"btn btn-primary col-3\">Enviar</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("            ");

                HttpSession sesion = request.getSession();
                ListaSEAdulto adultos = (ListaSEAdulto)sesion.getAttribute("misAdultos");
                AdultoMayor adultino = (AdultoMayor)sesion.getAttribute("adultino");
                
                String nombreMedi = request.getParameter("nombreMedi");
                String dosisMedi = request.getParameter("dosisMedi");
                String horaMedi = request.getParameter("horaMedi");
                String diaMedi = request.getParameter("diaMedi");
                
                Medicamento pastilla = new Medicamento(nombreMedi, dosisMedi, horaMedi, diaMedi);
                ListaSEMedicamento listaMedi = new ListaSEMedicamento();
                listaMedi.agregar(pastilla);
                
                //session.getAttribute("misAdultos");
                adultino.setMedicamentos(listaMedi);
               
                //adultos.obtener(0).setMedicamentos(listaMedi);
                //adulto.setMedicamentos(listaMedi);
                
                //out.println(adulto);
            
      out.write("\n");
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
