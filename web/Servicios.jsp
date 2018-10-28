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
        <link rel="stylesheet" type="text/css" href="../css/estilos.css">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    </head>
    <body>
        <%@include file="Menu.jsp" %>
        <section class="sec1">
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <center>

                <h1>Servicio</h1>
                <br>
                <br>
                <h2>Descripción:</h2>
                <textarea rows="1" cols="50" placeholder="Ingrese los datos: ">
                </textarea>
                <br>
                <br>
                <h2>Precio:</h2>
                <input type="text" name="">
                <br>
                <br>
                <h2>Habitacion:</h2>

                <select>
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                    <option value="">4</option>
                </select>
                <br>

                <br>
                <input type="submit" value="Guardar">
                <input type="submit" value="Cancelar">
            </center>
        </section>

        <br><input type="submit" value="Guardar" ><input type="submit" value="Cancelar">

        <%@include file="Footer.jsp" %>


    </body>
</html>
