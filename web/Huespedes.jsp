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
        <title>BAROS</title>
        <link rel="stylesheet" type="text/css" href="../css/estilos.css">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    </head>
    <body>  
        <%@include file="Menu.jsp" %>

        <section class="sec1"><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            <center><h1>Huespedes</h1></center><br>
            <table width="100%" border="1">
                <thead>
                    <tr>
                        <th>Nombre </th>
                        <th>Apellido</th>
                        <th>Direccion</th> 

                    </tr>
                </thead>
                <tbody>
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
        </section>

        <H4 align="right"><a href="NHuesped.jsp">Ingresar nuevo Huesped</a> </H4>

        <%@include file="Footer.jsp" %>

    </body>
</html>
