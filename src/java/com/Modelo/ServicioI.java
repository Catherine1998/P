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
                String consulta = "INSERT INTO SERVICIO VALUES ('" + servicio1.getId() + "','" + servicio1.getDescripcion() + "','" + servicio1.getPrecio() + "')";

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
