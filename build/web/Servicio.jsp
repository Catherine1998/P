<%-- 
    Document   : Servicio
    Created on : Oct 17, 2018, 8:14:41 PM
    Author     : fc
--%>

<%@page import="com.Modelo.ServicioM"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.servlet.Servicio"%>
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
                <h1>Servicios</h1>
            </div> 
            <table border="1" class="grid">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Descripcion</th>
                        <th>Precio</th> 
                    </tr>
                </thead>
                <tbody>
                    <%
                        Servicio h = new Servicio();
                        ArrayList serviciosList = h.fillServicios();
                        for (int i = 0; i < serviciosList.size(); i++) {
                            ServicioM servicio = (ServicioM) serviciosList.get(i);
                    %>
                    <tr>
                        <td>
                            <%= servicio.getId()%>
                        </td>
                        <td>
                            <%= servicio.getDescripcion()%>
                        </td>
                        <td>
                            Q. <%= servicio.getPrecio()%>
                        </td>

                    </tr>
                    <%
                        }
                    %> 
                </tbody>

            </table>

            <div class="putDelete">
                <H4 align="right"><a href="EServicio.jsp">Editar Servicio</a> </H4>
                <H4 align="right"><a href="DServicio.jsp">Eliminar Servicio</a> </H4>
            </div>
        </section>

        <%@include file="Footer.jsp" %>

    </body>
</html>
