/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

import com.conexion.conexionDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author CatherineV
 */
public class FacturarI {

    public static boolean agregarServicio(TransaccionDetalleM transaccion) {
        boolean agregado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "INSERT INTO [dbo].[TRANSACCION_DETALLE]\n"
                        + "           ([Id_transaccion]\n"
                        + "           ,[Id_servicio]\n"
                        + "           ,[Id_tipo_docuemnto]\n"
                        + "           ,[Cantidad]\n"
                        + "           ,[Total])\n"
                        + "     VALUES\n"
                        + "           (" + transaccion.getIdTransaccion() + "\n"
                        + "           ," + transaccion.getIdServicio() + "\n"
                        + "           ," + transaccion.getIdDocumento() + "\n"
                        + "           ," + transaccion.getCantidad() + "\n"
                        + "           ," + transaccion.getTotal() + ")";
                Statement st = con.createStatement();
                st.executeUpdate(consulta);
                agregado = true;
            }
        } catch (SQLException e) {
            agregado = false;
        }
        return agregado;

    }

    public static boolean agregar_total(TransaccionDetalleM transaccion, int idHabitacion) {
        boolean agregado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "UPDATE [dbo].[TRANSACCION]\n"
                        + "   SET [Total] = " + transaccion.getTotal() + " \n"
                        + " WHERE Id_transaccion = " + transaccion.getId() + " \n"
                        + " \n"
                        + "UPDATE HABITACION SET Estado = 0 WHERE Id_habitacion = " + idHabitacion;
                Statement st = con.createStatement();
                st.executeUpdate(consulta);
                agregado = true;
            }
        } catch (SQLException e) {
            agregado = false;
        }
        return agregado;

    }
}
