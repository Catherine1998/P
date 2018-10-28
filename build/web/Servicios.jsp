<%-- 
    Document   : Servicios
    Created on : 10/10/2018, 03:21:36 PM
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
    <center>
        <h1>Servicio</h1>
    </center>


    <br>
    <br>
    Descripción:  <textarea rows="1" cols="50" placeholder="Ingrese los datos: ">
    </textarea>
    <br>
    <br>Precio: <input type="text"  name="">
    <br>
    <br>Habitacion:

    <select>
        <option value="">1</option>
        <option value="">2</option>
        <option value="">3</option>
        <option value="">4</option>
    </select>
    <br>

    <br><input type="submit" value="Guardar" ><input type="submit" value="Cancelar">



</body>
</html>
