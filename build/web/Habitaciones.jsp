<%-- 
    Document   : Habitaciones
    Created on : 10/10/2018, 03:22:14 PM
    Author     : CatherineV
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  <%@include file="Menu.jsp" %><br>
        <form action="" method="post">
            <center><h1>Habitaciones</h1></center>
            <table   style=" width:100%; border: 1px solid black;"  >

                <tr>
                    <td ><strong>Id </strong></td>
                    <td><strong>Tipo</strong></td>
                    <td><strong>Nivel</strong></td> 
                    <td><strong>Precio </strong></td>
                    <td><strong>Comentario</strong></td>
                    <td><strong>Estado</strong></td>

                </tr>
                <tr>
                    <td>1</td><td>VIP</td><td>3</td> <td>Q.1500.00</td><td>Servicio completo</td> <td>Ocupado</td>

                </tr>

            </table>
        </form>
    </body>
</html>
