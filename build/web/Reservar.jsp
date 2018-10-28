<%-- 
    Document   : Reservar
    Created on : 10/10/2018, 03:20:38 PM
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
            <center>
                <h1>Reservación</h1>
                <br>
                <br>
                <br> Nombre Cliente:
                <input type="text" name="">
                <br>
                <br> Fecha Reservación:

                <input type="date" name=""> Fecha de ingreso:
                <input type="date" name=""> Fecha de salida:
                <input type="date" name=""> Fecha pago:
                <input type="date" name="">
                <br>
                <br>Total a pagar:
                <input type="text" name="">
                <br>
                <br>
                Tipo de habitación:
                <select>
                    <option value="">Simple</option>
                    <option value="">Doble</option>
                    <option value="">...</option>
                    <option value="">...</option>
                </select>
                <br>
                <br>
                Nivel de habitación:
                <select>
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                    <option value="">4</option>
                </select>
                <br>
                <br>
                Numero de habitación:
                <select>
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                    <option value="">4</option>
                    </h2>
                </select>
                <br>
                <br>
                <input type="submit" value="Guardar">
                <input type="submit" value="Cancelar">
            </center>
        </section>
        <%@include file="Footer.jsp" %>

    </body>
</html>
