
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
        <link rel="stylesheet" type="text/css" href="../css/estilos.css">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    </head>
    <body>
        <%@include file="Menu.jsp" %>    <section class="sec1">
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <form action="nhuesped.do" method="post">



                <center>
                    <h1>Nuevo Huesped</h1>
                    <br>
                    <br>
                    <br>
                    Nombre:  <input type="text" name="nombre" placeholder="Ingrese Nombre">
                    <br>
                    <br>Apellido: <input type="text"  name="apellido" placeholder="Ingrese el apellido">
                    <br>
                    <br>Direccion:<input type="text" name="direccion"  placeholder="Ingrese dirección" style=" top: 2px; ">
                    <br>
                    <br>
                    <br><input type="submit" value="Guardar" name="guardar" ><input type="submit" value="Cancelar">


                    </form> 
                </center>
        </section>

        <%@include file="Footer.jsp" %>
    </body>
</html>
