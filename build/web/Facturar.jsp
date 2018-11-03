<%@page import="com.Modelo.HabitacionM"%>
<%@page import="com.Modelo.RegistroM"%>
<%@page import="com.Modelo.AsignacionM"%>
<%@page import="com.Modelo.FacturarM"%>
<%@page import="com.servlet.Factura"%>
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
                <h1>Facturar</h1>
            </div>
            <form action="Factura" method="POST">
                <%
                    if (request.getAttribute("id") == null) {
                        request.getRequestDispatcher("error.jsp").forward(request, response);
                    }

                    Factura facturar = new Factura();
                    FacturarM factura = facturar.getID(Integer.parseInt(request.getAttribute("id").toString()));
                    RegistroM registro = factura.getRegistro();
                    AsignacionM asignacion = factura.getAsignacion();
                    HabitacionM habitacion = asignacion.getHabitacion();

                    Servicio h = new Servicio();
                    ArrayList serviciosList = h.getServiciosPorReservacion(Integer.parseInt(request.getAttribute("id").toString()));
                    ServicioM servicio = new ServicioM();

                %>  
                <p>Huesped: <label><%= factura.getHuesped()%></label></p>
                <p>Fecha: <label><%= factura.getFecha()%></label></p>
                <p>Fecha de reservacion: <label><%= registro.getFhreserva()%></label></p>
                <p>Fecha de ingreso: <label><%= registro.getFhinregistro()%></label></p>
                <p>Fecha de fin de reservacion: <label><%= registro.getFhfiregistro()%></label></p>
                <p>Nivel de habitacion: <label><%= habitacion.getNivel()%></label></p>
                <p>Numero de habitacion: <label><%= habitacion.getID()%></label></p>
                <p>Tipo de habitacion: <label><%= habitacion.getTipo()%></label></p>
                <p>Precio de la habitacion: <label><%= habitacion.getPrecio()%></label></p>
                <p>Tipo de documento <label><%=factura.getTipo_documento()%></label></p>
                <table border="1" class="grid">
                    <thead>
                        <tr>
                            <th>Descripcion</th>
                            <th>Precio</th> 
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            float totalservicios = factura.getTotal();
                            for (int i = 0; i < serviciosList.size(); i++) {
                                servicio = (ServicioM) serviciosList.get(i);
                                totalservicios += servicio.getPrecio();
                        %>
                        <tr>
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

                <p><input type="text" value="<%= factura.getId_Transaccion()%>" name="id" hidden></p>
                <p><input type="text" value="<%= habitacion.getID()%>" name="idHabitacion" hidden></p>
                <p>total Q.<%= totalservicios%> <input type="text" value="<%= totalservicios%>" name="total" hidden></p>

                <div class="btn">
                    <input type="submit" value="Guardar" name="guardar" >
                    <input type="submit" value="Cancelar" name="cancelar">
                </div>
            </form>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
