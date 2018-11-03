/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.Modelo.AsignacionM;
import com.Modelo.FacturarI;
import com.Modelo.FacturarM;
import com.Modelo.HabitacionM;
import com.Modelo.RegistroM;
import com.Modelo.TransaccionDetalleM;
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
                    + "h.Id_huesped AS NIT, \n"
                    + "H.Nombre + ' ' +  H.Apellido AS HUESPED,\n"
                    + "T.Fecha,\n"
                    + "TDC.Descripcion,\n"
                    + "T.Total,\n"
                    + "(SELECT COUNT(1) FROM TRANSACCION TRX WHERE ASIGN.Id_registro = TRX.Id_asignacion AND TRX.Total > 0) AS [FACTURADO]\n"
                    + "FROM TRANSACCION T\n"
                    + "INNER JOIN TIPO_DOCUMENTO TDC ON T.Id_tipo_documento = TDC.Id_tipo_documento\n"
                    + "INNER JOIN HUESPED H ON T.Id_huesped = H.Id_huesped\n"
                    + "INNER JOIN ASIGNACION ASIGN ON T.Id_asignacion = ASIGN.Id_asignacion\n"
                    + "WHERE (SELECT COUNT(1) FROM TRANSACCION TRX WHERE ASIGN.Id_registro = TRX.Id_asignacion AND TRX.Total > 0) > 0 ";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();

            ArrayList reservaciones = new ArrayList();

            while (rs.next()) {
                FacturarM reserv = new FacturarM(
                        rs.getInt("Id_transaccion"),
                        rs.getFloat("Total"),
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

    public FacturarM getID(int idtransaccion) {
        try {
            con = conexion.getConexionSqlServer();

            String consulta = "SELECT \n"
                    + "TRXN.Id_transaccion, \n"
                    + "TRXN.fecha, \n"
                    + "r.Total_pago, \n"
                    + "r.Fecha_hora_reserva,\n"
                    + "r.Fecha_hora_iniregistro,\n"
                    + "r.Fecha_hora_finregistro,\n"
                    + "h.Nombre + ' ' + h.Apellido AS CLIENTE,\n"
                    + "tp.Descripcion AS TIPOH,\n"
                    + "HB.Nivel,\n"
                    + "hb.Id_habitacion,\n"
                    + "hb.Precio AS HPRECIO ,\n"
                    + "TD.Descripcion \n"
                    + "FROM REGISTRO R\n"
                    + "INNER JOIN HUESPED H ON R.Id_huesped = H.Id_huesped \n"
                    + "INNER JOIN ASIGNACION ASIGN ON R.Id_registro = ASIGN.Id_registro \n"
                    + "INNER JOIN HABITACION HB ON ASIGN.Id_habitacion = HB.Id_habitacion \n"
                    + "INNER JOIN TIPO TP ON HB.Id_tipo = TP.Id_tipo\n"
                    + "INNER JOIN TRANSACCION TRXN ON ASIGN.Id_asignacion = TRXN.Id_asignacion\n"
                    + "INNER JOIN TIPO_DOCUMENTO TD ON TRXN.Id_tipo_documento = TD.Id_tipo_documento\n"
                    + "where TRXN.Id_transaccion = " + idtransaccion;

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();

            FacturarM reserv = null;
            while (rs.next()) {
                AsignacionM asignacion = new AsignacionM(rs.getString("CLIENTE"));
                asignacion.setHabitacion(new HabitacionM(
                        rs.getInt("Id_habitacion"),
                        rs.getString("TIPOH"),
                        rs.getInt("Nivel"),
                        rs.getFloat("HPRECIO")));

                RegistroM registro = new RegistroM(
                        rs.getString("Fecha_hora_reserva"),
                        rs.getString("Fecha_hora_iniregistro"),
                        rs.getString("Fecha_hora_finregistro"));

                reserv = new FacturarM(
                        rs.getInt("Id_transaccion"),
                        rs.getFloat("Total_pago"),
                        rs.getString("Descripcion"),
                        rs.getString("CLIENTE"),
                        rs.getDate("fecha"));

                reserv.setAsignacion(asignacion);
                reserv.setRegistro(registro);
            }
            return reserv;

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

        if (request.getParameter("cancelar") != null && "cancelar".equals(request.getParameter("cancelar").toLowerCase())) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        if (request.getParameter("agregarServicio") != null && "guardar".equals(request.getParameter("agregarServicio").toLowerCase())) {
            agregarServicio(request, response);
        } else if (request.getParameter("guardar") != null && "guardar".equals(request.getParameter("guardar").toLowerCase())) {
            facturar(request, response);

        } else if (request.getParameter("detalle") != null && "detalle".equals(request.getParameter("detalle").toLowerCase())) {
            detalle(request, response);
        }
    }

    private void facturar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idReservacion = request.getParameter("id");
        String totalS = request.getParameter("total");
        String habitacionID = request.getParameter("idHabitacion");
        try {
            float total = Float.parseFloat(totalS);
            int idR = Integer.parseInt(idReservacion);
            int idHabitacion = Integer.parseInt(habitacionID);

            if (!idReservacion.equalsIgnoreCase("") && !totalS.equalsIgnoreCase("")) {

                boolean sw = FacturarI.agregar_total(new TransaccionDetalleM(idR, idR, idR, idR, idR, total), idHabitacion);

                if (sw == true) {
                    request.setAttribute("tipo", "facturado");
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

    private void agregarServicio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idReservacion = request.getParameter("reservaciones");
        String idServicio = request.getParameter("servicio");
        String cantidad = request.getParameter("cantidad");
        String idDocumento = request.getParameter("documento");
        try {
            String[] parts = idServicio.split("/");
            String id = parts[0]; // id
            String precio = parts[1]; // precio

            float total = Float.parseFloat(cantidad) * Float.parseFloat(precio);
            int idR = Integer.parseInt(idReservacion),
                    idS = Integer.parseInt(id),
                    idD = Integer.parseInt(idDocumento);

            if (!idReservacion.equalsIgnoreCase("") && !cantidad.equalsIgnoreCase("")) {

                TransaccionDetalleM detalle = new TransaccionDetalleM(
                        idR,
                        idS,
                        idD,
                        Integer.parseInt(cantidad),
                        total);
                boolean sw = FacturarI.agregarServicio(detalle);

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

    private void detalle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idReservacion = request.getParameter("factura");

        try {
            request.setAttribute("id", idReservacion);

            request.getRequestDispatcher("detalleF.jsp").forward(request, response);

        } catch (NumberFormatException ex) {
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
