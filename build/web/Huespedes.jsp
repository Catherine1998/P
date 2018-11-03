<%-- 
    Document   : Huespedes
    Created on : 10/10/2018, 03:21:53 PM
    Author     : CatherineV
--%>

<%@page import="com.Modelo.HuespedM"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.servlet.Huespedes"%>
<%@page import="com.servlet.Habitacion"%>
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
                <h1>Huespedes</h1>
            </div>

            <table border="1" class="grid">
                <thead>
                    <tr>
                        <th>Nombre </th>
                        <th>Apellido</th>
                        <th>Direccion</th> 
                    </tr>
                </thead>
                <tbody>
                    <%
                        Huespedes h = new Huespedes();
                        ArrayList huespedes = h.fillHuespedes();
                        for (int i = 0; i < huespedes.size(); i++) {
                            HuespedM huesped = (HuespedM) huespedes.get(i);

                    %>
                    <tr>
                        <td name="nombre"><%= huesped.getNombre()%></td>
                        <td><%= huesped.getApellido()%></td>
                        <td><%= huesped.getDireccion()%></td>
                    </tr>
                    <%
                        }
                    %>                   

                </tbody>
            </table>

            <div class="putDelete">
                <H4 align="right"><a href="EHuesped.jsp">Editar Huesped</a></H4>
                <H4 align="right"><a href="DHuesped.jsp">Eliminar Huesped</a></H4>
            </div>
        </section>

        <%@include file="Footer.jsp" %>

    </body>
</html>
