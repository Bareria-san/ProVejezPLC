<%-- 
    Document   : almacenamiento
    Created on : 18/08/2021, 12:04:37 a. m.
    Author     : alejo
--%>

<%@page import="listas.ListaSEAdulto"%>
<%@page import="modelo.AdultoMayor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
              crossorigin="anonymous">
        <style>
            #scroll{

                height:600px;
                width:600px;
                overflow-y:scroll;
                overflow-x:hidden;
            }
        </style>
        
        <title>Pacientes</title>
    </head>
    <body>
        <script>

        </script>

        <%
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
%>
        <div class="container">
            <div class="row justify-content-between">
                <div class="col-4">
                    <figure class="figure mt-4">
                        <img src="images/LogoCompleto.png" class="figure-img img-fluid rounded" 
                             alt="Logo Provejez" width="375">
                    </figure>
                    <div class="d-grid gap-1  mt-3">
                        <button class="btn btn-primary" type="button">Agregar</button>
                        <button class="btn btn-primary" type="button">Volver</button>
                    </div>
                </div>
                <div class="col-6">
                    <div class="accordion accordion-flush" id="scroll">
                        
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="flush-headingOne">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
                                    <div class="justify-content-beetwen">
                                        <%=adultos.obtener(0).nombre  + " " + adultos.obtener(0).apellidos %>
                                        Habitacion: <%=adultos.obtener(0).getNumero_habitacion()%>
                                    </div>
                                    
                                </button>
                            </h2>
                            <div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
                                <div class="accordion-body">
                                    <button>
                                        Hector
                                        
                                    </button>
                                    <a href="formularioMedicamento.jsp">Hijole</a>
                                        
                                </div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="flush-headingTwo">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
                                    Accordion Item #2
                                </button>
                            </h2>
                            <div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
                                <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the second item's accordion body. Let's imagine this being filled with some actual content.</div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="flush-headingThree">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
                                    Accordion Item #3
                                </button>
                            </h2>
                            <div id="flush-collapseThree" class="accordion-collapse collapse" aria-labelledby="flush-headingThree" data-bs-parent="#accordionFlushExample">
                                <div class="accordion-body">Placeholder content for this accordion,
                                    which is intended to demonstrate the <code>.accordion-flush</code> 
                                    class. This is the third item's accordion body. Nothing more exciting
                                    happening here in terms of content, but just filling up the space to make it look, at least at first glance, a bit more representative of how this would look in a real-world application.</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> 
    <script src="js/query.min.js"></script>}
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"></script>
    
    
</body>
</html>
