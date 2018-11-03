<%-- 
    Document   : Servicios
    Created on : 10/10/2018, 03:21:36 PM
    Author     : CatherineV
--%>

<%@page import="com.servlet.Servicio"%>
<%@page import="com.Modelo.ServicioM"%>
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
                <h1>Servicio</h1>
            </div>
            <%
                ServicioM servicio = null;
                if (request.getAttribute("id") != null) {
                    Servicio hsp = new Servicio();
                    servicio = hsp.getByID(request.getAttribute("id").toString());
                }
            %>

            <form action="Servicio" method="POST">
                <%
                    if (servicio != null) {
                %>
                <p hidden><input type="text" name="id" value="<%= servicio.getId()%>"></p>
                <p>Descripción: <textarea name="descripcion" rows="1" cols="50" placeholder="Ingrese los datos: " ><%= servicio.getDescripcion()%></textarea></p>
                <p>Precio: <input type="text" name="precio" value="<%= servicio.getPrecio()%>"></p>
                <div class="btn">
                    <input type="submit" value="Editar" name="editar" >

                    <%                    } else {
                    %>
                    <p>Descripción: <textarea name="descripcion" rows="1" cols="50" placeholder="Ingrese los datos: "></textarea></p>
                    <p>Precio: <input type="text" name="precio"></p>
                    <div class="btn">
                        <input type="submit" value="Guardar" name="guardar" >
                        <%
                            }
                        %>

                        <input type="submit" value="Cancelar" name="cancelar">
                    </div>    

            </form> 
        </section>

        <%@include file="Footer.jsp" %>
    </body>
</html>
