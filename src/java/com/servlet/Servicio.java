/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.Modelo.ServicioM;
import com.conexion.conexionDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "Servicio", urlPatterns = {"/Servicio"})
public class Servicio extends HttpServlet {

    conexionDB conexion = new conexionDB();
    Connection con = null;

    public ArrayList fillServicios() {
        try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT * FROM SERVICIO";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();

            ArrayList serviciosList = new ArrayList();

            while (rs.next()) {
                ServicioM serv = new ServicioM(rs.getInt("Id_servicio"),
                        rs.getString("Descripcion"),
                        rs.getFloat("Precio"));
                serviciosList.add(serv);
            }
            return serviciosList;
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
        List<ServicioM> list = new ArrayList<ServicioM>();
        try {
            con = conexion.getConexionSqlServer();

            String consulta = "SELECT * FROM SERVICIO";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                list.add(new ServicioM(rs.getInt("Id_servicio"),
                        rs.getString("Descripcion"),
                        rs.getInt("Precio")));
            }

            request.setAttribute("list", list);

            RequestDispatcher rd = request.getRequestDispatcher("Servicio.jsp");
            rd.forward(request, response);
        } catch (SQLException ex) {

        }
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
        processRequest(request, response);
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
