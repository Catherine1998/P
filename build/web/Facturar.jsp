<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Facturar
    Created on : 10/10/2018, 03:21:07 PM
    Author     : CatherineV
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
    <body background="../img/fondo.jpg">
        <%@include file="Menu.jsp" %>
        <section class="sec1">
            <div class="title">
                <h1>Cargar servicio</h1>
            </div>
            <form action="Factura" method="POST">
                <%
                    Servicio h = new Servicio();
                    ArrayList serviciosList = h.fillServicios();
                    ServicioM servicio = new ServicioM();
                %>  
                <p>Huesped: <label>hamilton</label></p>
                <p>Habitaction: <label>501</label></p>
                <p>Nivel: <label>1</label></p>
                <p>Servicio:
                    <select >     
                        <option value="">--Escoje un servicio--</option>
                        <%
                            for (int i = 0; i < serviciosList.size(); i++) {
                                servicio = (ServicioM) serviciosList.get(i);
                        %>
                        <option value="<%= servicio.getId()%>"><%= servicio.getDescripcion() + " Q." + servicio.getPrecio()%></option>
                        <%
                            }
                        %>  
                    </select> 
                </p>

                <div class="btn">
                    <input type="submit" value="Guardar" name="guardar" >
                    <input type="submit" value="Cancelar">
                </div>
            </form>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
