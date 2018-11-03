<%-- 
    Document   : detalleF
    Created on : Nov 3, 2018, 2:50:58 AM
    Author     : fc
--%>

<%@page import="com.Modelo.ServicioM"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.servlet.Servicio"%>
<%@page import="com.Modelo.HabitacionM"%>
<%@page import="com.Modelo.AsignacionM"%>
<%@page import="com.Modelo.RegistroM"%>
<%@page import="com.Modelo.FacturarM"%>
<%@page import="com.servlet.Factura"%>
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
                <h1>Detalle</h1>
            </div>
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
            <p>total Q.<%= totalservicios%> <input type="text" value="<%= totalservicios%>" name="total" hidden></p>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
