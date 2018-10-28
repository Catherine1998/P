<%-- 
    Document   : Menu
    Created on : 10/10/2018, 03:07:33 PM
    Author     : CatherineV
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script type="text/javascript">
            var zero = 0;
            $(document).ready(function () {
                $(window).on('scroll', function () {
                    $('.navbar').toggleClass('hide', $(window).scrollTop()
                            > zero);
                    zero = $(window).scrollTop();
                });
            });
        </script>
    </head>
    <body>
        <div class="navbar">
            <a href="#" class="channel"></a>
            <ul>
                <li><a href="index.jsp" class="active">Inicio</a></li>
                <li><a href="Reservar.jsp">Reserva</a></li>
                <li><a href="Reservaciones.jsp">Reservaciones</a></li>
                <li><a href="Servicios.jsp">Servicios</a></li>
                <li><a href="NHuesped.jsp">Huesped</a></li>
                <li><a href="Huespedes.jsp">Huespedes</a></li>
                <li><a href="Facturar.jsp">Facturar</a></li>
                <li><a href="Facturas.jsp">Facturas</a></li>
                <li><a href="Habitaciones.jsp">Habitaciones</a></li>
            </ul>
        </div>
    </body>
</html>
