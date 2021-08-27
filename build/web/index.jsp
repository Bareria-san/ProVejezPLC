<%-- 
    Document   : index
    Created on : 14/08/2021, 7:09:00 p. m.
    Author     : alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@page import="listas.ListaSEAdulto" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="estilos/style_carga.css">

        <title>ProVejez</title>
    </head>
    <body class="body">
        <%
            HttpSession sesion = request.getSession();
            ListaSEAdulto adultos = new ListaSEAdulto();
            sesion.setAttribute("misAdultos", adultos);    
        %>
        <header>
            <center><video class="video" src="video/Comp1.mp4" autoplay muted loop width="840" height="480"></video></center>      
            <div><image class="logo" src="images/LetraLogo.png" autoplay muted loop width="340" height="100"></image></div>
        </header>
        <div class="centrado">
            <div class="lds-roller">
                <div></div>
                <div></div>
                <div></div>
                <div></div>
                <div></div>
                <div></div>
                <div></div>
                <div></div>
            </div>
    </body>
</html>
