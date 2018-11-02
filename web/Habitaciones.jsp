<%-- 
    Document   : Habitaciones
    Created on : 10/10/2018, 03:22:14 PM
    Author     : CatherineV
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.servlet.Habitacion"%>
<%@page import="com.Modelo.HabitacionM"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <h1>Habitaciones</h1>
            </div>
            <table border="1" class="grid">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Tipo</th>
                        <th>Nivel</th>
                        <th>Comentario</th>
                        <th>Precio</th>
                        <th>Estado</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        Habitacion h = new Habitacion();
                        ArrayList habitaciones = h.fillHabitaciones();
                        for (int i = 0; i < habitaciones.size(); i++) {
                            HabitacionM habitacion = (HabitacionM) habitaciones.get(i);

                    %>
                    <tr>
                        <td>
                            <%= habitacion.getID()%>
                        </td>
                        <td>
                            <%= habitacion.getTipo()%>
                        </td>
                        <td>
                            <%= habitacion.getNivel()%>
                        </td>
                        <td>
                            <%= habitacion.getComentario()%>
                        </td>
                        <td>
                            Q. <%= habitacion.getPrecio()%>
                        </td>
                        <td>
                            <%= habitacion.getEstado()%>
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
