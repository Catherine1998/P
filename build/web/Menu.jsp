<%-- 
    Document   : Menu
    Created on : 10/10/2018, 03:07:33 PM
    Author     : CatherineV
--%>


<!DOCTYPE html>
<html>

    <body>
    <center>

        <table  style=" width:100%; border: 1px solid black;
                border-collapse: collapse; font-size: 20px;" >
            <tr>

                <td><a href="index.jsp"> Inicio </a> </td>
                <td><a href="Reservar.jsp"> Reservar </a></td>
                <td><a href="Reservaciones.jsp"> Reservaciones </a></td>
                <td><a href="Facturar.jsp"> Facturar </a></td>
                <td><a href="Facturas.jsp"> Facturas </a></td>
                <td><a href="Servicios.jsp"> Servicio </a></td>
                <td><a href="Huespedes.jsp"> Huespedes </a></td>

                <td>
                    <form action="Servicio">
                        <input type="submit" value="Servicio" method="get" name="submit"/>
                    </form>
                </td> 
                <td>
                    <a href="Habitaciones.jsp"> Habitaciones </a>
                </td>
                <!--<td><a href="Habitacion"> Habitaciones </a></td>-->

            </tr>

        </table>
    </center>     
</body>
</html>
