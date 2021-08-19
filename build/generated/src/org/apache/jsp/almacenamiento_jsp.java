package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import listas.ListaSEAdulto;
import modelo.AdultoMayor;

public final class almacenamiento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" \n");
      out.write("              rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            #scroll{\n");
      out.write("\n");
      out.write("                height:600px;\n");
      out.write("                width:600px;\n");
      out.write("                overflow-y:scroll;\n");
      out.write("                overflow-x:hidden;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <title>Pacientes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        ");

            HttpSession sesion = request.getSession();
            
            ListaSEAdulto adultos = (ListaSEAdulto)sesion.getAttribute("miAdultos");
            if (adultos == null) {
                    sesion.setAttribute("misAdultos", adultos);
                    adultos = new ListaSEAdulto();
                }

            String identificacion = request.getParameter("identificacion");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String numero_habitacion = request.getParameter("numero_habitacion");
            String encargado = request.getParameter("encargado");
            String ficha_medica = request.getParameter("ficha_medica");

            if(identificacion != null){
                AdultoMayor adulto = new AdultoMayor(identificacion, nombre, apellidos, numero_habitacion,
                    encargado, ficha_medica, null, null);
                sesion.setAttribute("adultino", adulto);
                adultos.agregar(adulto);
            }

            
            
            //out.println(adulto);

      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-between\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <figure class=\"figure mt-4\">\n");
      out.write("                        <img src=\"images/LogoCompleto.png\" class=\"figure-img img-fluid rounded\" \n");
      out.write("                             alt=\"Logo Provejez\" width=\"375\">\n");
      out.write("                    </figure>\n");
      out.write("                    <div class=\"d-grid gap-1  mt-3\">\n");
      out.write("                        <button class=\"btn btn-primary\" type=\"button\">Agregar</button>\n");
      out.write("                        <button class=\"btn btn-primary\" type=\"button\">Volver</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <div class=\"accordion accordion-flush\" id=\"scroll\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"accordion-item\">\n");
      out.write("                            <h2 class=\"accordion-header\" id=\"flush-headingOne\">\n");
      out.write("                                <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapseOne\" aria-expanded=\"false\" aria-controls=\"flush-collapseOne\">\n");
      out.write("                                    <div class=\"justify-content-beetwen\">\n");
      out.write("                                        ");
      out.print(adultos.obtener(0).nombre  + " " + adultos.obtener(0).apellidos );
      out.write("\n");
      out.write("                                        Habitacion: ");
      out.print(adultos.obtener(0).getNumero_habitacion());
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </button>\n");
      out.write("                            </h2>\n");
      out.write("                            <div id=\"flush-collapseOne\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-headingOne\" data-bs-parent=\"#accordionFlushExample\">\n");
      out.write("                                <div class=\"accordion-body\">\n");
      out.write("                                    <button>\n");
      out.write("                                        Hector\n");
      out.write("                                        \n");
      out.write("                                    </button>\n");
      out.write("                                    <a href=\"formularioMedicamento.jsp\">Hijole</a>\n");
      out.write("                                        \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"accordion-item\">\n");
      out.write("                            <h2 class=\"accordion-header\" id=\"flush-headingTwo\">\n");
      out.write("                                <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapseTwo\" aria-expanded=\"false\" aria-controls=\"flush-collapseTwo\">\n");
      out.write("                                    Accordion Item #2\n");
      out.write("                                </button>\n");
      out.write("                            </h2>\n");
      out.write("                            <div id=\"flush-collapseTwo\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-headingTwo\" data-bs-parent=\"#accordionFlushExample\">\n");
      out.write("                                <div class=\"accordion-body\">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the second item's accordion body. Let's imagine this being filled with some actual content.</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"accordion-item\">\n");
      out.write("                            <h2 class=\"accordion-header\" id=\"flush-headingThree\">\n");
      out.write("                                <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapseThree\" aria-expanded=\"false\" aria-controls=\"flush-collapseThree\">\n");
      out.write("                                    Accordion Item #3\n");
      out.write("                                </button>\n");
      out.write("                            </h2>\n");
      out.write("                            <div id=\"flush-collapseThree\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-headingThree\" data-bs-parent=\"#accordionFlushExample\">\n");
      out.write("                                <div class=\"accordion-body\">Placeholder content for this accordion,\n");
      out.write("                                    which is intended to demonstrate the <code>.accordion-flush</code> \n");
      out.write("                                    class. This is the third item's accordion body. Nothing more exciting\n");
      out.write("                                    happening here in terms of content, but just filling up the space to make it look, at least at first glance, a bit more representative of how this would look in a real-world application.</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("    <script src=\"js/query.min.js\"></script>}\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
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
