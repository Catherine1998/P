<%-- 
    Document   : DetallesFacturas
    Created on : Nov 3, 2018, 2:46:51 AM
    Author     : fc
--%>

<%@page import="com.Modelo.FacturarM"%>
<%@page import="java.util.ArrayList"%>
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
                <h1>Detalles de Factura</h1>
            </div>
            <form action="Factura" method="POST">
                <p>Facturas
                    <select id="factura" name="factura" >
                        <%
                            Factura h = new Factura();
                            ArrayList reserv = h.fill();
                            for (int i = 0; i < reserv.size(); i++) {
                                FacturarM factura = (FacturarM) reserv.get(i);

                        %>
                        <option value="<%= factura.getId_Transaccion()%>"><%= factura.getHuesped() + " / " + factura.getFecha()%></option>
                        <%
                            }
                        %>
                    </select>
                </p>
                <div class="btn">
                    <input type="submit" value="Detalle" name="detalle" >
                    <input type="submit" value="Cancelar" name="cancelar">
                </div>
            </form>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
