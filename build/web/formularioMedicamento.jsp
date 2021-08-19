<%-- 
    Document   : formularioMedicamento
    Created on : 14/08/2021, 9:29:05 p. m.
    Author     : alejo
--%>

<%@page import="modelo.AdultoMayor"%>
<%@page import="listas.ListaSEMedicamento"%>
<%@page import="listas.ListaSEAdulto"%>
<%@page import="modelo.Medicamento"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Medicamento</title>
    </head>
    <body>
        <ul class="nav justify-content-center bg-primary">
            <li class="nav-item">
                <h2>MEDICAMENTO</h2>
            </li>
            <li class="nav-item">
                <h2>-</h2>
            </li>
            <li class="nav-item">
                <h2>AÑADIR</h2>
            </li>

        </ul>
        <div class = "container mt-4">
            
            <div class = "row justify-content-md-center">
                <div hidden="">
                        
                </div>
                <div class = "col-lg-6">
                    <form action="formularioMedicamento.jsp" method="post">
                        <div class="mb-3">
                            <label>Nombre del medicamento</label>
                            <input type="text" class="form-control" name="nombreMedi" placeholder="nombre">
                        </div>
                        <div class="mb-3">
                            <label>Dosis</label>
                            <input type="text" class="form-control" name="dosisMedi" placeholder="ejemplo: 50 mg">
                        </div>
                        <div class="mb-3">
                            <label>Hora</label>
                            <input type="time" class="form-control" name="horaMedi"/>
                        </div>
                        <div class="mb-3">
                            <label>Día</label>
                            <select class="form-select" name = "diaMedi">
                                <option selected>Seleccionar día de la actividad</option>
                                <option value="lunes">Lunes</option>
                                <option value="martes">Martes</option>
                                <option value="miercoles">Miércoles</option>
                                <option value="jueves">Jueves</option>
                                <option value="viernes">Viernes</option>
                                <option value="sabado">Sábado</option>
                                <option value="domingo">Domingo</option>
                            </select>
                        </div>
                        <div class="d-grid gap-2 d-md-flex justify-content-between">
                            <button type="submit" class="btn btn-primary col-3">Volver</button>
                            <button type="" class="btn btn-primary col-3">Enviar</button>
                        </div>

                    </form>
                </div>
            </div>            
            <%
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
                
                out.println(adultino);
            %>
        </div>
    </body>
</html>
