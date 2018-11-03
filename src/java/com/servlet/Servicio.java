/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.Modelo.ServicioI;
import com.Modelo.ServicioM;
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
@WebServlet(name = "Servicio", urlPatterns = {"/Servicio"})
public class Servicio extends HttpServlet {

    conexionDB conexion = new conexionDB();
    Connection con = null;

    public ServicioM getByID(String id) {
        try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT * FROM SERVICIO WHERE Id_servicio = " + id;

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            ServicioM ser = null;
            while (rs.next()) {
                ser = new ServicioM(rs.getInt("Id_servicio"),
                        rs.getString("Descripcion"),
                        rs.getFloat("Precio"));
            }
            return ser;
        } catch (SQLException ex) {
            return null;
        }
    }

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

    public ArrayList getServiciosPorReservacion(int id) {
        try {

            con = conexion.getConexionSqlServer();

            String consulta = "SELECT SV.*\n"
                    + "FROM SERVICIO SV\n"
                    + "INNER JOIN TRANSACCION_DETALLE TRXD ON SV.Id_servicio = TRXD.Id_servicio\n"
                    + "WHERE TRXD.Id_transaccion = " + id;

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

        if (request.getParameter("cancelar") != null && "cancelar".equals(request.getParameter("cancelar").toLowerCase())) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        if (request.getParameter("guardar") != null && "guardar".equals(request.getParameter("guardar").toLowerCase())) {
            agregar(request, response);
        } else if (request.getParameter("editarSeleccion") != null && "editar".equals(request.getParameter("editarSeleccion").toLowerCase())) {
            editPage(request, response);
        } else if (request.getParameter("editar") != null && "editar".equals(request.getParameter("editar").toLowerCase())) {
            edit(request, response);
        } else if (request.getParameter("eliminar") != null && "eliminar".equals(request.getParameter("eliminar").toLowerCase())) {
            delete(request, response);
        }
    }

    private void agregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("descripcion");
        String precioString = request.getParameter("precio");
        try {

            float precio = Float.parseFloat(precioString);
            if (!nombre.equalsIgnoreCase("") && !precioString.equalsIgnoreCase("")) {

                ServicioM servicio = new ServicioM(nombre, precio);
                boolean sw = ServicioI.agregarServicio(servicio);

                if (sw == true) {
                    request.setAttribute("tipo", "agrego");
                    request.getRequestDispatcher("exito.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            }
        } catch (NumberFormatException ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (ServletException ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (IOException ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String nombre = request.getParameter("descripcion");
        String precioString = request.getParameter("precio");
        try {
            int idInt = Integer.parseInt(id);
            float precio = Float.parseFloat(precioString);
            if (!nombre.equalsIgnoreCase("") && !precioString.equalsIgnoreCase("")) {

                ServicioM servicio = new ServicioM(idInt, nombre, precio);
                boolean sw = ServicioI.editar(servicio);

                if (sw == true) {
                    request.setAttribute("tipo", "editado");
                    request.getRequestDispatcher("exito.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            }
        } catch (NumberFormatException ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (ServletException ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (IOException ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    private void editPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cliente = request.getParameter("servicio");

        try {
            request.setAttribute("id", cliente);

            request.getRequestDispatcher("Servicios.jsp").forward(request, response);

        } catch (NumberFormatException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (ServletException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (IOException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cliente = request.getParameter("servicio");

        try {
            int clienteID = Integer.parseInt(cliente);
            boolean sw = ServicioI.eliminar(clienteID);

            request.setAttribute("tipo", "eliminado");
            if (sw == true) {
                request.getRequestDispatcher("exito.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (NumberFormatException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (ServletException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (IOException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
