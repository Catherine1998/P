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

                <td>
                    <form action="Huespedes" method="get">
                        <input type="submit" value="Huespedes" />
                    </form>
                    
                    <!--<a href="Huespedes.jsp"> Huespedes </a>-->
                </td>

                <td>
                    <a href="Servicio.jsp">Servicios</a>
                </td> 
                <td>
                    <a href="Habitaciones.jsp"> Habitaciones </a>
                    <!--<a href="Habitacion"> Habitaciones </a>-->
                </td>


            </tr>

        </table>
    </center>     
</body>
</html>
