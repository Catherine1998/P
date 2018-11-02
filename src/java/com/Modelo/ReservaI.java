/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.Modelo.AsignacionM;
import com.Modelo.RegistroM;
import com.conexion.conexionDB;
import java.sql.PreparedStatement;

public class ReservaI {

    public static boolean agregarAsignacion(AsignacionM asignacion1) {
        boolean agregado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "INSERT INTO ASIGNACION VALUES ('" + asignacion1.getIdasignacion() + "','" + asignacion1.getIdregistro() + "','" + asignacion1.getIdhabitacion() +"','" + asignacion1.getIdhuesped() +"')";

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
    public static boolean agregarregistro(RegistroM registro1) {
        boolean agregado = false;
        try {
            conexionDB c = new conexionDB();
            Connection con = c.getConexionSqlServer();
            if (con != null) {
                String consulta = "INSERT INTO REGISTRO VALUES ('" + registro1.getIdregistro() + "','" + registro1.getIdhuesped() + "','" + registro1.getFhreserva()  + "','" + registro1.getFhinregistro()+ "','" + registro1.getFhfiregistro() + "','" + registro1.getFhpago()+ "','" + registro1.getTotal()+"')";

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