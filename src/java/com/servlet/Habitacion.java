/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.Modelo.HabitacionM;
import com.conexion.conexionDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
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

    public ArrayList fillHabitaciones(){
    try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT * FROM HABITACION";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            ArrayList habitaciones = new ArrayList();

            while (rs.next()) {
                HabitacionM ha1 = new HabitacionM(rs.getInt("Id_habitacion"),
                        rs.getString("Id_tipo"),
                        Integer.parseInt(rs.getString("Nivel")),
                        rs.getFloat("Precio"),
                        rs.getString("Comentario"),
                        rs.getString("Comentario"));
                habitaciones.add(ha1);
            }
            return habitaciones;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT * FROM HABITACION";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            ArrayList habitaciones = new ArrayList();

            while (rs.next()) {
                HabitacionM ha1 = new HabitacionM(rs.getInt("Id_habitacion"),
                        rs.getString("Id_tipo"),
                        Integer.parseInt(rs.getString("Nivel")),
                        rs.getFloat("Precio"),
                        rs.getString("Comentario"),
                        rs.getString("Comentario"));
                habitaciones.add(ha1);
            }
            request.setAttribute("habitacionFill", habitaciones);

            RequestDispatcher view = request.getRequestDispatcher("Habitaciones.jsp");
            view.forward(request, response);

            String str = "<table><tr><th>Nivel</th><th>Comentario</th></tr>";
            for (int i = 0; i < habitaciones.size(); i++) {
                HabitacionM habitacion = (HabitacionM) habitaciones.get(i);

                str += "<tr><td>" + habitacion.getTipo() + "</td><td>" + habitacion.getComentario() + "</td></tr>";

            }

            str += "</table>";
            out.println(str);

        } catch (SQLException ex) {
            out.println(ex.toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT * FROM HABITACION";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            ArrayList habitaciones = new ArrayList();

            while (rs.next()) {
                HabitacionM ha1 = new HabitacionM(rs.getInt("Id_habitacion"),
                        rs.getString("Id_tipo"),
                        Integer.parseInt(rs.getString("Nivel")),
                        rs.getFloat("Precio"),
                        rs.getString("Comentario"),
                        rs.getString("Comentario"));
                habitaciones.add(ha1);
            }
            request.setAttribute("habitacionFill", habitaciones);

            RequestDispatcher view = request.getRequestDispatcher("Habitaciones.jsp");
            view.forward(request, response);

            String str = "<table><tr><th>Nivel</th><th>Comentario</th></tr>";
            for (int i = 0; i < habitaciones.size(); i++) {
                HabitacionM habitacion = (HabitacionM) habitaciones.get(i);

                str += "<tr><td>" + habitacion.getTipo() + "</td><td>" + habitacion.getComentario() + "</td></tr>";

            }

            str += "</table>";
            out.println(str);

        } catch (SQLException ex) {
            out.println(ex.toString());
        }
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
