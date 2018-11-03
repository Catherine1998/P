/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.conexion.conexionDB;

public class ReservaI {

    public static boolean agregarAsignacion(AsignacionM asignacion1, RegistroM registro1) {
        boolean agregado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "INSERT INTO REGISTRO VALUES ('" + registro1.getIdhuesped() + "', GETDATE(),'" + registro1.getFhinregistro() + "','" + registro1.getFhfiregistro() + "', GETDATE(),'" + registro1.getTotal() + "')";
                consulta += " \n INSERT INTO ASIGNACION VALUES ((SELECT TOP 1 Id_registro FROM REGISTRO ORDER BY Id_registro DESC),'" + asignacion1.getIdhabitacion() + "','" + asignacion1.getIdhuesped() + "')";
                consulta += " \n INSERT INTO [dbo].[TRANSACCION]\n"
                        + "           ([Id_asignacion]\n"
                        + "           ,[Id_huesped]\n"
                        + "           ,[Id_habitacion]\n"
                        + "           ,[Id_tipo_documento]\n"
                        + "           ,[Fecha]\n"
                        + "           ,[Total])\n"
                        + "     VALUES \n"
                        + "           ((SELECT TOP 1 Id_asignacion FROM ASIGNACION ORDER BY Id_asignacion DESC)\n"
                        + "           , " + registro1.getIdhuesped() + " \n"
                        + "           , " + asignacion1.getIdhabitacion() + "\n"
                        + "           ,1 \n"
                        + "           ,GETDATE()\n"
                        + "           ,0)"
                        + " UPDATE HABITACION SET Estado = 1 WHERE Id_habitacion = " + asignacion1.getIdhabitacion();
                Statement st = con.createStatement();
                st.executeUpdate(consulta);
                agregado = true;
            }
        } catch (SQLException e) {
            agregado = false;
            e.printStackTrace();
        }
        return agregado;
    }
}
