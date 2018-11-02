<%-- 
    Document   : Servicios
    Created on : 10/10/2018, 03:21:36 PM
    Author     : CatherineV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BAROS</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    </head>
    <body>
        <%@include file="Menu.jsp" %>
        <section class="sec1">
            <div class="title">
                <h1>Servicio</h1>
            </div>
            <form action="Servicio" method="POST">
                <p>Descripción: <textarea rows="1" cols="50" placeholder="Ingrese los datos: "></textarea></p>
                <p>Precio: <input type="text" name=""></p>
                <div class="btn">
                    <input type="submit" value="Guardar" name="guardar" >
                    <input type="submit" value="Cancelar">
                </div>
            </form>
        </section>

        <%@include file="Footer.jsp" %>
    </body>
</html>
