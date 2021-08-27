<%-- 
    Document   : inicio
    Created on : 27/08/2021, 1:51:01 a. m.
    Author     : alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="estilos/style_inicio.css">

        <title>ProVejez</title>
    </head>

    <body class="body">
        <div>

            <div class="veen">
                <div class="rgstr-btn splits2">
                    <button id="mover"> .</button>
                </div>
                <div class="submit">
                    <p>¿No tienes una cuenta?</p>
                    <button class="dark">Registrarse</button>
                </div>
                <div class="wrapper">
                    <image class="logo" src="images/logoprovejez.png" width="150" height="180"></image>
                    <form id="login" tabindex="500">
                        <h3>Iniciar sesión</h3>
                        <div class="mail">
                            <input type="mail" name="">
                            <label>Usuario</label>
                        </div>
                        <div class="passwd">
                            <input type="password" name="">
                            <label>Contraseña</label>
                        </div>
                        <div class="submit">
                            <button class="dark">Iniciar sesión</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>

</html>
