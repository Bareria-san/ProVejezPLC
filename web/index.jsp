<%-- 
    Document   : index
    Created on : 14/08/2021, 7:09:00 p. m.
    Author     : alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Ensayito</title>
    </head>
    <body>
        <div class = "container mt-5">
            <div class = "row">
                <div class = "col-sm">
                    <form action="index.jsp" method="post">
                        <div class="mb-3">
                            <label>Joven, su numero</label>
                            <input type="text" class="form-control" name="nombree" placeholder="nombremmgvo">
                        </div>
                        <div class="mb-3">
                            <label>Joven, su celular</label>
                            <input type="text" class="form-control" name="celular" placeholder="contesta hprra">
                        </div>
                        <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>
                </div>
            </div>
            <div class = "row">
                <div class = "col-sm">
                    <div class="alert alert-primary" role="alert">
                        <%
                            String nombre = request.getParameter("nombree");
                            String celuco = request.getParameter("celular");
                            if (nombre != null && celuco != null) {
                                  String saludo = "sumerce es " + nombre + " con celcho: " + celuco;
                                    out.println(saludo);  
                                } else {
                                out.println("grandes mentes, grandes cacas");
                            }
                            
                            %>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
