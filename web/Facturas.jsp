<%-- 
    Document   : Facturas
    Created on : 10/10/2018, 03:21:20 PM
    Author     : CatherineV
--%>

<%@page import="com.Modelo.FacturarM"%>
<%@page import="com.servlet.Factura"%>
<%@page import="java.util.ArrayList"%>
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
                <h1>Facturas Generadas</h1>
            </div>
            <table border="1" class="grid">
                <thead>
                    <tr>
                        <th>Id </th>
                        <th>Nit</th>
                        <th>Nombre del Cliente</th>
                        <th>Fecha</th>
                        <th>Descrición</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        Factura h = new Factura();
                        ArrayList reserv = h.fill();
                        for (int i = 0; i < reserv.size(); i++) {
                            FacturarM factura = (FacturarM) reserv.get(i);

                    %>                    
                    <tr>
                        <td>
                            <%= factura.getId_Transaccion()%>
                        </td>
                        <td>
                            <%= factura.getId_Transaccion()%>
                        </td>
                        <td>
                            <%= factura.getHuesped()%>
                        </td>
                        <td>
                            <%= factura.getFecha()%>
                        </td>
                        <td>
                            <%= factura.getTipo_documento()%>
                        </td>
                        <td>
                            Q. <%= factura.getTotal()%>
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
