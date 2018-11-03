<%-- 
    Document   : EHuesped
    Created on : Nov 2, 2018, 6:15:04 PM
    Author     : fc
--%>

<%@page import="com.Modelo.HuespedM"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.servlet.Huespedes"%>
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
                <h1>Editar Huesped</h1>
            </div>


            <form action="nhuesped.do" method="POST">
                <p>Nombre Huesped                     
                    <select id="clientes" name="clientes" >
                        <%
                            Huespedes hsp = new Huespedes();
                            ArrayList huespedes = hsp.fillHuespedes();
                            for (int i = 0; i < huespedes.size(); i++) {
                                HuespedM huesped = (HuespedM) huespedes.get(i);

                        %>
                        <option value="<%= huesped.getId()%>"><%= huesped.getNombre() + " " + huesped.getApellido()%></option>
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
