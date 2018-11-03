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

/**
 *
 * @author CatherineV
 */
public class HuespedI {

    public static boolean agregarHuesped(HuespedM huesped1) {
        boolean agregado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "INSERT INTO HUESPED VALUES ('" + huesped1.getNombre() + "','" + huesped1.getApellido() + "','" + huesped1.getDireccion() + "')";
                Statement st = con.createStatement();
                st.executeUpdate(consulta);
                agregado = true;
            }
        } catch (SQLException e) {
            agregado = false;
        }
        return agregado;

    }

    public static boolean eliminarhuesped(int IDHuesped) {
        boolean eliminado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "delete HUESPED where Id_huesped = " + IDHuesped;
                Statement st = con.createStatement();
                st.executeUpdate(consulta);
                eliminado = true;
            }
        } catch (SQLException e) {
            eliminado = false;
        }
        return eliminado;
    }

    public static boolean editarhuesped(HuespedM huesped) {
        boolean editar = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "UPDATE HUESPED SET Apellido = '" + huesped.getApellido() + "', Direccion = '" + huesped.getDireccion() + "', Nombre = '" + huesped.getNombre() + "' WHERE Id_huesped = " + huesped.getId();
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
