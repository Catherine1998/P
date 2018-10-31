<%-- 
    Document   : Facturar
    Created on : 10/10/2018, 03:21:07 PM
    Author     : CatherineV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>BAROS</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>

    </head>
    <body background="../img/fondo.jpg">
        <%@include file="Menu.jsp" %>


        <section class="sec1"><br><br><br><br><br><br><br><br><br><br>


            <center>  
                <h1>Facturación</h1>

                <br>
                <br>
                <br>
                <br>

                Nit:  <input type="text" name="nitt">

                Nombre: <input type="text" name="nombre">
                <br>
                <br>
                Fecha: <input type="date" name="Fecha">
                <br>
                <br>
                Noches: <input type="text" name="noches">  
                Tipo de Habitacion: <select>
                    <option value="">Simple</option>
                    <option value="">Doble</option>

                </select> 
                <br>
                <br>

                <input type="submit" value="Calcular" name="Calcular" >
            </center>
        </section>
        <%@include file="Footer.jsp" %>
    </body>
</html>
