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

    public static boolean agregar(FacturarM factura) {
        boolean agregado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                //String consulta = "INSERT INTO HUESPED VALUES ('" + huesped1.getNombre() + "','" + huesped1.getApellido() + "','" + huesped1.getDireccion() + "')";
                String consulta = "";
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
