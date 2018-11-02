<%-- 
    Document   : Reservar
    Created on : 10/10/2018, 03:20:38 PM
    Author     : CatherineV
--%>

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
            <p>Nombre Cliente: <input type="text" name=""></p>
            <p>Fecha Reservación: <input type="date" name="" ></p> 
            <p>Fecha de ingreso: <input type="date" name=""></p>
            <p>Fecha de salida: <input type="date" name=""></p>
            <p>Fecha pago: <input type="date" name=""></p>
            <p>Total a pagar: <input type="text" name=""></p>
            <p>Tipo de habitación:
                <select>
                    <option value="">Simple</option>
                    <option value="">Doble</option>
                </select>
            </p>
            <p>Nivel de habitación:
                <select>
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                    <option value="">4</option>
                </select>
            </p>
            <p>Numero de habitación:
                <select>
                    <option value="">1</option>
                    <option value="">2</option>
                    <option value="">3</option>
                    <option value="">4</option>
                </select>

            </p>
            <div class="btn">
                <input type="submit" value="Guardar" name="guardar" >
                <input type="submit" value="Cancelar">
            </div>
        </section>
        <%@include file="Footer.jsp" %>

    </body>
</html>
