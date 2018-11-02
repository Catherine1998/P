<%-- 
    Document   : Reservaciones
    Created on : 10/10/2018, 03:20:55 PM
    Author     : CatherineV
--%>

<%@page import="com.servlet.Reservaciones"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Modelo.ReservacionM"%>
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
                    <%
                        Reservaciones h = new Reservaciones();
                        ArrayList reserv = h.fillReservaciones();
                        for (int i = 0; i < reserv.size(); i++) {
                            ReservacionM reser = (ReservacionM) reserv.get(i);

                    %>                    
                    <tr>
                        <td>
                            <%= reser.getFecha_reservacion()%>
                        </td>
                        <td>
                            <%= reser.getIngreso()%>
                        </td>
                        <td>
                            <%= reser.getSalida()%>
                        </td>
                        <td>
                            <%= reser.getCliente()%>
                        </td>
                        <td>
                            Q. <%= reser.getTotal()%>
                        </td>
                        <td>
                             <%= reser.getTipo_de_habitacion()%>
                        </td>
                        <td>
                             <%= reser.getNivel()%>
                        </td>
                        <td>
                             <%= reser.getNumero_habitacion()%>
                        </td>
                    </tr>
                    <%
                        }
                    %>   
                </tbody>
            </table>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
