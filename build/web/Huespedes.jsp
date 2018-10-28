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


    <table width="100%" border="1">
        <thead>
            <tr>
                <th>Nombre </th>
                <th>Apellido</th>
                <th>Direccion</th> 

            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Alexander</td><td>Hamilton </td><td>NY</td>
            </tr>
        <c:if test="${list}">

            <c:forEach items="${list}" var="record">
                <tr>
                    <td>${record.getNombre() }</td>
                    <td>${record.getApellido() }</td>
                    <td>${record.getDireccion() }</td>
                </tr>
            </c:forEach>
        </c:if>

    </tbody>
</table>

<br>      
<br>
<H4 align="right"><a href="NHuesped.jsp">Ingresar nuevo Huesped</a> </H4>
</body>
</html>
