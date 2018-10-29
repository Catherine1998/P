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
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
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
            <table border="1" class="grid">
                <thead>
                    <tr>
                        <th>Fecha Reservación</th>
                        <th>Ingreso</th>
                        <th>Salida</th>
                        <th>Cliente </th>
                        <th>Total</th>
                        <th>Tipo de habitacion</th>
                        <th>Nivel</th>
                        <th>Numero de habitacion</th>
                    </tr>
                <thead>                
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4 </td>
                        <td>5</td>
                        <td>6</td>
                        <td>7</td>
                        <td>8</td>
                    </tr>
                </tbody>
            </table>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
