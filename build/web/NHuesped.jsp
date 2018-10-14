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
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Menu.jsp" %><br>
        <form action="" method="post">


            <center>
                <h2>Nuevo Huesped</h2>
                <br>
                <br>
                <br>
                Nombre:  <input type="text" name="nombre" placeholder="Ingrese Nombre">
                <br>
                <br>Apellidos: <input type="text"  name="Apellidos" placeholder="Ingrese los Apellidos">
                <br>
                <br>Direccion:<input type="text" name="direccion"  placeholder="Ingrese direccion" style=" top: 2px; ">
                <br>
                <br>Telefono: <input type="text" name="telefono" placeholder="Ingrese direccion">
                <br>
                <br>
                <br><input type="submit" value="Guardar" ><input type="submit" value="Cancelar">


                </form> 
            </center>
    </body>
</html>
