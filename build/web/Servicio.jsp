<%-- 
    Document   : Servicio
    Created on : Oct 17, 2018, 8:14:41 PM
    Author     : fc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servicios</title>
    </head>
    <body>
        <%@include file="Menu.jsp" %>
        <br>
    <center><h1>Servicios</h1></center>
    <table style=" width:100%; border: 1px solid black;">
        <tr>
            <td ><strong>ID</strong></td>
            <td><strong>Descripcion</strong></td>
            <td><strong>Precio</strong></td> 
        </tr>
        <c:forEach items="${list}" var="record">
            <tr>
                <td>${record.getId() }</td>
                <td>${record.getDescripcion() }</td>
                <td>${record.getPrecio() }</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
