/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.Modelo.HuespedM;
import com.conexion.conexionDB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fc
 */
public class Huespedes extends HttpServlet {

    conexionDB conexion = new conexionDB();
    Connection con = null;

    public HuespedM getHuesped(String id) {
        try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT * FROM HUESPED WHERE Id_huesped = " + id;

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            HuespedM hueped = null;
            while (rs.next()) {
                hueped = new HuespedM(
                        rs.getInt("Id_huesped"),
                        rs.getString("Nombre"),
                        rs.getString("Apellido"),
                        rs.getString("Direccion"));
            }
            return hueped;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList fillHuespedes() {
        try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT * FROM HUESPED";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();

            ArrayList huespe = new ArrayList();

            while (rs.next()) {
                HuespedM ha1 = new HuespedM(
                        rs.getInt("Id_huesped"),
                        rs.getString("Nombre"),
                        rs.getString("Apellido"),
                        rs.getString("Direccion"));
                huespe.add(ha1);
            }
            return huespe;
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
