/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.Modelo.ServicioM;
import com.conexion.conexionDB;
import java.sql.PreparedStatement;

/**
 *
 * @author Jorge Escobar
 */
public class ServicioI {

    public static boolean agregarServicio(ServicioM servicio1) {
        boolean agregado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "INSERT INTO SERVICIO (Descripcion, Precio) VALUES ('" + servicio1.getDescripcion() + "','" + servicio1.getPrecio() + "')";

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

    public static boolean eliminar(int id) {
        boolean eliminado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "DELETE SERVICIO WHERE ID_SERVICIO = " + id;
                Statement st = con.createStatement();
                st.executeUpdate(consulta);
                eliminado = true;
            }
        } catch (SQLException e) {
            eliminado = false;
        }
        return eliminado;
    }

    public static boolean editar(ServicioM huesped) {
        boolean editar = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "UPDATE [dbo].[SERVICIO]\n"
                        + "   SET [Descripcion] = '" + huesped.getDescripcion() + "'\n"
                        + "      ,[Precio] = '" + huesped.getPrecio() + "'\n"
                        + " WHERE Id_servicio = " + huesped.getId();
                Statement st = con.createStatement();
                st.executeUpdate(consulta);
                editar = true;
            }
        } catch (SQLException e) {
            editar = false;
        }
        return editar;
    }
}
