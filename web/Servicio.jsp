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
        <title>Servicios</title>
    </head>
    <body>
        <%@include file="Menu.jsp" %>
        <br>
    <center><h1>Servicios</h1></center>
    <table width="100%" border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Descripcion</th>
                <th>Precio  ${list}</th> 
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
</body>
</html>
