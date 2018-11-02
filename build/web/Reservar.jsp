<%-- 
    Document   : Reservar
    Created on : 10/10/2018, 03:20:38 PM
    Author     : CatherineV
--%>

<%@page import="com.Modelo.HabitacionM"%>
<%@page import="com.servlet.Habitacion"%>
<%@page import="com.Modelo.HuespedM"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.servlet.Huespedes"%>
<%@page import="java.time.LocalDateTime"%>
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
                <h1>Reservación</h1>
            </div>

            <form action="Reservaciones" method="POST">
                <p>Nombre Cliente:                     
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
                <p>Fecha de ingreso: <input type="date" name="fechaIngreso"></p>
                <p>Fecha de salida: <input type="date" name="fechaSalida"></p>
                <p>Tiempo :
                    <select id="tiempo" name="tiempo" >
                        <option value="0.5">Noche</option>
                        <option value="1">Día completo</option>
                    </select>
                </p>
                <p>Numero de habitación:
                    <select id="habitacion" name="habitacion" >
                        <option value="">--- Seleccione una habitacion ---</option>

                        <%
                            Habitacion habit = new Habitacion();
                            ArrayList habitaciones = habit.fillHabitacionesVacias();
                            for (int i = 0; i < habitaciones.size(); i++) {
                                HabitacionM habitacion = (HabitacionM) habitaciones.get(i);
                        %>
                       <!--- <option value="<%= habitacion.getID() + "," + habitacion.getPrecio()%>" >Nivel <%= habitacion.getNivel() + " / NO." + habitacion.getNivel()%></option>-->
                        <option value="<%= habitacion.getID()%>" >Nivel <%= habitacion.getNivel() + " / NO." + habitacion.getNivel()%></option>
                        <%
                            }
                        %> 
                    </select>

                </p>
                <p>Pago: <input type="checkbox" name="pago" value="Bike"></p>
                <p>Total a pagar: </p>
                <div class="btn">
                    <input type="submit" value="Guardar" name="guardar" >
                    <input type="submit" value="Cancelar">
                </div>
            </form>
        </section>

        <%@include file="Footer.jsp" %>

    </body>
</html>
