<%-- 
    Document   : Reservar
    Created on : 10/10/2018, 03:20:38 PM
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
            <h1>Reservación</h1>
            <br>
        <br>
        <br> Nombre Cliente:   <input type="text" name="">
             <br>
        <br>
        <br> Fecha Reservación:   <input type="date" name="">
        Fecha de ingreso: <input type="date" name="">
        Fecha de salida:     <input type="date" name="">
        Fecha pago:   <input type="date" name="">
        <br>
        <br>
        <br>Total a pagar:  <input type="text"  name=""> 
        <br>
        <br>Tipo de habitación:
        <select>
  <option value="">Simple</option>
  <option value="">Doble</option>
  <option value="">...</option>
  <option value="">...</option>
</select>
        <br>
        <br>Nivel de habitación:
        <select>
  <option value="">1</option>
  <option value="">2</option>
  <option value="">3</option>
  <option value="">4</option>
        </select>
        <br>
        <br>Numero de habitación:
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
