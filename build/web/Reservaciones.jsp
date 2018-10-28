<%-- 
    Document   : Reservaciones
    Created on : 10/10/2018, 03:20:55 PM
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
            <h1>Reservaciones Generadas</h1>
            <br>
            <table style=" width:100%; border: 1px solid white;">
                <tr>
                    <td>
                        <strong>Fecha Reservación </strong>
                    </td>
                    <td>
                        <strong>Ingreso</strong>
                    </td>
                    <td>
                        <strong>Salida</strong>
                    </td>
                    <td>
                        <strong>Cliente </strong>
                    </td>
                    <td>
                        <strong>Total</strong>
                    </td>
                    <td>
                        <strong>Tipo de habitacion</strong>
                    </td>
                    <td>
                        <strong>Nivel</strong>
                    </td>
                    <td>
                        <strong>Numero de habitacion</strong>
                    </td>

                </tr>
                <tr>
                    <td>1</td>
                    <td>2</td>
                    <td>3</td>
                    <td>4 </td>
                    <td>5</td>
                    <td>6</td>

                </tr>

            </table>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
