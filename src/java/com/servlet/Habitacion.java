/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.Modelo.HabitacionM;
import com.conexion.conexionDB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fc
 */
@WebServlet(name = "Habitacion", urlPatterns = {"/Habitacion"})
public class Habitacion extends HttpServlet {

    conexionDB conexion = new conexionDB();
    Connection con = null;

    public ArrayList fillHabitaciones() {
        try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT Id_habitacion,"
                                + " TP.Descripcion AS TIPO,"
                                + " Nivel,"
                                + " Comentario,"
                                + " Precio,"
                                + " Estado"
                                + " FROM HABITACION H "
                                + " INNER JOIN TIPO TP "
                                + " ON H.Id_tipo = TP.Id_tipo";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();

            ArrayList habitaciones = new ArrayList();

            while (rs.next()) {
                HabitacionM ha1 = new HabitacionM(rs.getInt("Id_habitacion"),
                        rs.getString("TIPO"),
                        Integer.parseInt(rs.getString("Nivel")),
                        rs.getFloat("Precio"),
                        rs.getString("Comentario"),
                        rs.getBoolean("Estado"));
                habitaciones.add(ha1);
            }
            return habitaciones;
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
