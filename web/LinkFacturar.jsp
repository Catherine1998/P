<%-- 
    Document   : LinkFacturar
    Created on : Nov 2, 2018, 9:32:36 PM
    Author     : fc
--%>

<%@page import="com.Modelo.ReservacionM"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.servlet.Reservaciones"%>
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
                <h1>Reservación</h1>
            </div>
            <form action="Reservaciones" method="POST">
                <p>Reservación
                    <select id="reservaciones" name="reservaciones" >
                        <%
                            Reservaciones h = new Reservaciones();
                            ArrayList reserv = h.fillReservacionesSinfacturar();
                            for (int i = 0; i < reserv.size(); i++) {
                                ReservacionM reser = (ReservacionM) reserv.get(i);

                        %>  
                        <option value="<%= reser.getId()%>"><%= reser.getCliente() + " " + reser.getFecha_reservacion()%></option>
                        <%
                            }
                        %>
                    </select>
                </p>
                <div class="btn">
                    <input type="submit" value="Facturar" name="facturar" >
                    <input type="submit" value="Cancelar" name="cancelar">
                </div>
            </form>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
