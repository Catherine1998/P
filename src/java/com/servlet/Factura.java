/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.Modelo.FacturarM;
import com.conexion.conexionDB;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Factura", urlPatterns = {"/Factura"})
public class Factura extends HttpServlet {

    conexionDB conexion = new conexionDB();
    Connection con = null;

    public ArrayList fill() {
        try {
            con = conexion.getConexionSqlServer();

            String consulta = "SELECT \n"
                    + "T.Id_transaccion, \n"
                    + "'' AS NIT, \n"
                    + "H.Nombre + ' ' +  H.Apellido AS HUESPED,\n"
                    + "T.Fecha,\n"
                    + "TDC.Descripcion,\n"
                    + "T.Total \n"
                    + "FROM TRANSACCION T\n"
                    + "INNER JOIN TRANSACCION_DETALLE TD ON T.Id_transaccion = TD.Id_transaccion\n"
                    + "INNER JOIN TIPO_DOCUMENTO TDC ON T.Id_tipo_documento = TDC.Id_tipo_documento\n"
                    + "INNER JOIN HUESPED H ON T.Id_huesped = H.Id_huesped";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();

            ArrayList reservaciones = new ArrayList();

            while (rs.next()) {
                FacturarM reserv = new FacturarM(
                        rs.getInt("Id_transaccion"),
                        rs.getInt("Total"),
                        rs.getString("Descripcion"),
                        rs.getString("HUESPED"),
                        rs.getDate("Fecha"));
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
        PrintWriter out = response.getWriter();

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
        processRequest(request, response);
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

        //String nombre = request.getParameter("nombre");
        //String fecha = request.getParameter("Fecha");
//        String noches = request.getParameter("noches");
//        String Tipo_habitacion = request.getParameter("noches");
        if ("Guardar".equals(request.getParameter("guardar"))) {
            //if (!nombre.equalsIgnoreCase("") && !fecha.equalsIgnoreCase("") && !noches.equalsIgnoreCase("")) {

            //FacturarM factura = new FacturarM(1, 1, 1, 1, 1);
            //boolean sw = FacturarI.agregar(factura);
            //if (sw == true) {
            request.getRequestDispatcher("exito.jsp").forward(request, response);
            //} else {
            //    PrintWriter out = response.getWriter();
            //    out.println(" :( ");
            //}
            //}
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
