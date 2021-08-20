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
                height:550px;
                width:550px;
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
            ListaSEAdulto adultos = (ListaSEAdulto)sesion.getAttribute("misAdultos");
  
            String identificacion = request.getParameter("identificacion");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String numero_habitacion = request.getParameter("numero_habitacion");
            String encargado = request.getParameter("encargado");
            String ficha_medica = request.getParameter("ficha_medica");

            if(nombre != null){
                AdultoMayor adulto = new AdultoMayor(identificacion, nombre, apellidos, numero_habitacion,
                    encargado, ficha_medica, null, null);
                //sesion.setAttribute("adultino", adulto);
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
                        <a class="btn btn-primary" type="button" href="formularioAdultoMayor.jsp">                                
                            Agregar
                        </a>
                        <a class="btn btn-primary" type="button" href="formularioAdultoMayor.jsp">                                
                            Volver
                        </a>
                    </div>
                </div>
                <div class="col-6">
                    <div class="accordion accordion-flush mt-5 mr-5" id="scroll">
                        <%
                            if(adultos.esVacia() == true){                                
                                for(int i = 0; i < adultos.tamanio(); i++) {
                                    Integer indice = new Integer(i);
                                    sesion.setAttribute("indice", indice);
                        
                        %>
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="flush-heading<%=i%>">
                                <button class="accordion-button collapsed" type="button" 
                                        data-bs-toggle="collapse" data-bs-target="#flush-collapse<%=i%>" 
                                        aria-expanded="false" aria-controls="flush-collapse<%=i%>">
                                    <div class="justify-content-beetwen">
                                        <%=adultos.obtener(i).nombre  + " " + adultos.obtener(i).apellidos %>
                                        Habitacion: <%=adultos.obtener(i).getNumero_habitacion()%>
                                    </div>

                                </button>
                            </h2>
                            <div id="flush-collapse<%=i%>" class="accordion-collapse collapse" 
                                 aria-labelledby="flush-heading<%=i%>" data-bs-parent="#accordionFlushExample">
                                <div class="accordion-body justify-content-center">      

                                    <a class="btn btn-primary" href="#" role="button">Ver perfil</a>
                                    <a class="btn btn-primary" href="formularioMedicamento.jsp" role="button">Modificar</a>
                                    <a class="btn btn-primary" href="#" role="button">Eliminar</a>

                                </div>
                            </div>
                        </div>
                        <%   
                            }
                            } else {
                            out.println("No hay adultos");
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/query.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"></script>


    </body>
</html>
