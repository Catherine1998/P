<%-- 
    Document   : EServicio
    Created on : Nov 2, 2018, 8:36:18 PM
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
                <h1>Editar servicio</h1>
            </div>
            <form action="Servicio" method="POST">
                <p>Servicio                   
                    <select id="servicio" name="servicio" >
                        <%
                            Servicio h = new Servicio();
                            ArrayList serviciosList = h.fillServicios();
                            for (int i = 0; i < serviciosList.size(); i++) {
                                ServicioM servicio = (ServicioM) serviciosList.get(i);

                        %>
                        <option value="<%= servicio.getId()%>"><%= servicio.getDescripcion()%></option>
                        <%
                            }
                        %>
                    </select>
                </p>
                <div class="btn">
                    <input type="submit" value="Editar" name="editarSeleccion" >
                    <input type="submit" value="Cancelar" name="cancelar">
                </div>
            </form>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
