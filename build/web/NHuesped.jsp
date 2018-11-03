
<%@page import="com.Modelo.HuespedM"%>
<%@page import="com.servlet.Huespedes"%>
<%-- 
    Document   : NHuesped
    Created on : 10/10/2018, 05:55:23 PM
    Author     : CatherineV
--%>

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
            <div   class="title">
                <h1>Huesped</h1>
            </div>
            <%
                HuespedM huesped = null;
                if (request.getAttribute("idCliente") != null) {
                    Huespedes hsp = new Huespedes();
                    huesped = hsp.getHuesped(request.getAttribute("idCliente").toString());
                }
            %>


            <form action="nhuesped.do" method="post">
                <%
                    if (huesped != null) {
                %>
                <p hidden><input type="text" name="id" value="<%= huesped.getId()%>"></p>
                <p>Nombre:  <input type="text" name="nombre" placeholder="Ingrese Nombre" value="<%= huesped.getNombre()%>"></p>
                <p>Apellido: <input type="text"  name="apellido" placeholder="Ingrese el apellido" value="<%= huesped.getApellido()%>"></p>
                <p> Direccion:<input type="text" name="direccion"  placeholder="Ingrese dirección" style=" top: 2px; " value="<%= huesped.getDireccion()%>"></p>
                
                
                <div class="btn">
                    <input type="submit" value="Editar" name="editar" >

                    <%
                    } else {
                    %>

                    <p>Nombre:  <input type="text" name="nombre" placeholder="Ingrese Nombre" ></p>
                    <p>Apellido: <input type="text"  name="apellido" placeholder="Ingrese el apellido"></p>
                    <p> Direccion:<input type="text" name="direccion"  placeholder="Ingrese dirección" style=" top: 2px; "></p>
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
