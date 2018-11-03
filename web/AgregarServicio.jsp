<%-- 
    Document   : AgregarServicio
    Created on : Nov 2, 2018, 10:31:43 PM
    Author     : fc
--%>

<%@page import="com.Modelo.TipoDocumentoM"%>
<%@page import="com.servlet.TipoDocumento"%>
<%@page import="com.Modelo.ReservacionM"%>
<%@page import="com.servlet.Reservaciones"%>
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
                <h1>Agregar servicio</h1>
            </div>
            <form action="Factura" method="POST">
                <p>Reservación
                    <select id="reservaciones" name="reservaciones" >
                        <%
                            Reservaciones r = new Reservaciones();
                            ArrayList reserv = r.fillReservacionesSinfacturar();
                            for (int i = 0; i < reserv.size(); i++) {
                                ReservacionM reser = (ReservacionM) reserv.get(i);

                        %>  
                        <option value="<%= reser.getId()%>"><%= reser.getCliente() + " " + reser.getFecha_reservacion()%></option>
                        <%
                            }
                        %>
                    </select>
                </p>

                <p>Servicio                   
                    <select id="servicio" name="servicio" >
                        <%
                            Servicio h = new Servicio();
                            ArrayList serviciosList = h.fillServicios();
                            for (int i = 0; i < serviciosList.size(); i++) {
                                ServicioM servicio = (ServicioM) serviciosList.get(i);

                        %>
                        <option value="<%= servicio.getId() + "/" + servicio.getPrecio() %>" ><%= servicio.getDescripcion()%></option>
                        <%
                            }
                        %>
                    </select>
                </p>

                <p>Cantidad <input type="text" name="cantidad"></p>


                <p>Tipo de documento                   
                    <select id="documento" name="documento" >
                        <%
                            TipoDocumento tdp = new TipoDocumento();
                            ArrayList tipoDocuento = tdp.getTiposDeDocumentos();
                            for (int i = 0; i < tipoDocuento.size(); i++) {
                                TipoDocumentoM td = (TipoDocumentoM) tipoDocuento.get(i);

                        %>
                        <option value="<%= td.getId()%>"><%= td.getDescripcion()%></option>
                        <%
                            }
                        %>
                    </select>
                </p>

                <div class="btn">
                    <input type="submit" value="Guardar" name="agregarServicio" >
                    <input type="submit" value="Cancelar" name="cancelar">
                </div>
            </form>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
