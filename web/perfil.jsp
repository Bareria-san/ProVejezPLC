<%-- 
    Document   : perfil
    Created on : 27/08/2021, 1:55:21 a. m.
    Author     : alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ProVejez</title>
        <link rel="stylesheet" type="text/css" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
        <link rel="stylesheet" href="estilos/style_perfil.css">
    </head>

    <body>

        <section class="seccion-perfil-usuario">
            <div class="perfil-usuario-header">
                <div class="perfil-usuario-portada">
                    <div class="logo"><img src="images/LetraLogo.png" alt="img-avatar"></div>
                    <div class="perfil-usuario-avatar">
                        <img src="images/logoprovejez .png" alt="img-avatar" height="190">
                    </div>
                </div>
            </div>
            <div class="perfil-usuario-body">
                <div class="perfil-usuario-bio">
                    <h3 class="titulo">Gilberto Antonio Villa</h3>
                    <div class="veen2">
                        <div class="submit">
                            <button class="dark">Modificar Usuario</button>
                        </div>
                    </div>
                    <div class="veen3">
                        <div class="submit">
                            <button class="dark">Eliminar Usuario</button>
                        </div>
                    </div>
                </div>
                <div class="perfil-usuario-footer">
                    <ul class="lista-datos">
                        <li><i class="icono fas fa-user-check"></i> Nombres: </li>
                        <li><i class="icono fas fa-user-check"></i> Apellidos: </li>   
                        <li><i class="icono fas fa-address-card"></i> Identificación: </li>
                        <h1> </h1>
                        <h3><i class="icono fas fa-file-pdf"></i> Descargar pdf del perfil: </h3>

                        <div class="veen">
                            <div class="submit">
                                <button class="dark">Agregar Actividades</button>
                            </div>
                        </div>
                    </ul>
                    <ul class="lista-datos">
                        <li><i class="icono fas fa-map-marker-alt"></i> Nro de Habitación:</li>
                        <li><i class="icono fas fa-briefcase"></i>Encargado: </li>
                        <li><i class="icono fas fa-file-prescription"></i> Ficha Médica: </li>
                        <h1> </h1>
                        <h3>link</h3>

                        <div class="veen">
                            <div class="submit">
                                <button class="dark">Agregar Medicamento</button>
                            </div>
                        </div>
                    </ul>
                    <div class="veen1">
                        <div class="submit">
                            <button class="dark">Volver</button>
                        </div>
                    </div>
                </div>
            </div>
        </section>

    </body>

</html>