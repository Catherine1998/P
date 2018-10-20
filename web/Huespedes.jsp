<%-- 
    Document   : Huespedes
    Created on : 10/10/2018, 03:21:53 PM
    Author     : CatherineV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Huespedes</title>
    </head>
    <body>  <%@include file="Menu.jsp" %><br>
    <center><h1>Huespedes</h1></center>
    <table   style=" width:100%; border: 1px solid black;" >
        <tr>
            <td ><strong>Nombre </strong></td>
            <td><strong>Apellido</strong></td>
            <td><strong>Direccion</strong></td> 
           
        </tr>
        <tr>
            <td>Alexander</td><td>Hamilton</td><td>NY</td>

        </tr></table>

    <br>      
    <br>
    <H4 align="right"><a href="NHuesped.jsp">Ingresar nuevo Huesped</a> </H4>
</body>
</html>
