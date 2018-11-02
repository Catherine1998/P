/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.Modelo.AsignacionM;
import com.Modelo.RegistroM;
import com.Modelo.ReservaI;
import com.Modelo.ReservacionM;
import com.conexion.conexionDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fc
 */
@WebServlet(name = "Reservaciones", urlPatterns = {"/Reservaciones"})
public class Reservaciones extends HttpServlet {

    conexionDB conexion = new conexionDB();
    Connection con = null;

    public ArrayList fillReservaciones() {
        try {
            con = conexion.getConexionSqlServer();

            String consulta = "SELECT \n"
                    + "r.Id_registro, \n"
                    + "r.Fecha_hora_reserva,\n"
                    + "r.Fecha_hora_iniregistro,\n"
                    + "r.Fecha_hora_finregistro,\n"
                    + "h.Nombre + ' ' + h.Apellido AS CLIENTE,\n"
                    + "r.Total_pago,\n"
                    + "tp.Descripcion AS TIPOH,\n"
                    + "HB.Nivel,\n"
                    + "hb.Id_habitacion "
                    + "FROM REGISTRO R\n"
                    + "INNER JOIN HUESPED H ON R.Id_huesped = H.Id_huesped \n"
                    + "INNER JOIN ASIGNACION ASIGN ON R.Id_registro = ASIGN.Id_registro \n"
                    + "INNER JOIN HABITACION HB ON ASIGN.Id_habitacion = HB.Id_habitacion \n"
                    + "INNER JOIN TIPO TP ON HB.Id_tipo = TP.Id_tipo";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();

            ArrayList reservaciones = new ArrayList();

            while (rs.next()) {
                ReservacionM reserv = new ReservacionM(
                        rs.getInt("Id_registro"),
                        rs.getDate("Fecha_hora_reserva"),
                        rs.getDate("Fecha_hora_iniregistro"),
                        rs.getDate("Fecha_hora_finregistro"),
                        rs.getString("CLIENTE"),
                        rs.getFloat("Total_pago"),
                        rs.getString("TIPOH"),
                        rs.getInt("Nivel"),
                        rs.getInt("Id_habitacion"));
                reservaciones.add(reserv);
            }
            return reservaciones;

        } catch (SQLException ex) {
            return null;
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if ("Guardar".equals(request.getParameter("guardar"))) {

            String fechaIngreso = request.getParameter("fechaIngreso");
            String fechaSalida = request.getParameter("fechaSalida");
            String tiempo = request.getParameter("tiempo");
            String cliente = request.getParameter("clientes");
            String habitacion = request.getParameter("habitacion");

            if (!cliente.equalsIgnoreCase("") && !fechaIngreso.equalsIgnoreCase("")) {
                int habitacionID = 0, clienteID = 0;
                float pago = 0;
                try {
                    pago = 2 * Float.parseFloat(tiempo);
                    habitacionID = Integer.parseInt(habitacion);
                    clienteID = Integer.parseInt(cliente);

                } catch (Exception ex1) {
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                    return;
                }

                RegistroM reserva = new RegistroM(
                        Integer.parseInt(cliente),
                        "",
                        fechaIngreso,
                        fechaSalida,
                        "",
                        pago);
                AsignacionM asignacion = new AsignacionM(
                        habitacionID,
                        clienteID);
                boolean sw = ReservaI.agregarAsignacion(asignacion, reserva);
                if (sw == true) {
                    request.getRequestDispatcher("exito.jsp").forward(request, response);
                } else {
                    PrintWriter out = response.getWriter();
                    out.println(" :( ");
                }
            }
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
