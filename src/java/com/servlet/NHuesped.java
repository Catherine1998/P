/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Modelo.HuespedM;
import com.Modelo.HuespedI;

/**
 *
 * @author CatherineV
 */
public class NHuesped extends HttpServlet {

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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");

        if (!nombre.equalsIgnoreCase("") && !apellido.equalsIgnoreCase("") && !direccion.equalsIgnoreCase("")) {
            request.setAttribute("tipo", "agregado");

            HuespedM huespeddd = new HuespedM(nombre, apellido, direccion);
            boolean sw = HuespedI.agregarHuesped(huespeddd);

            if (sw == true) {
                request.getRequestDispatcher("exito.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        try {

            int idInt = Integer.parseInt(id);

            if (!nombre.equalsIgnoreCase("") && !apellido.equalsIgnoreCase("") && !direccion.equalsIgnoreCase("")) {
                request.setAttribute("tipo", "editado");

                HuespedM huespeddd = new HuespedM(idInt, nombre, apellido, direccion);
                boolean sw = HuespedI.editarhuesped(huespeddd);

                if (sw == true) {
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
        String cliente = request.getParameter("clientes");

        try {
            request.setAttribute("idCliente", cliente);

            request.getRequestDispatcher("NHuesped.jsp").forward(request, response);

        } catch (NumberFormatException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (ServletException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (IOException ex1) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cliente = request.getParameter("clientes");

        try {
            int clienteID = Integer.parseInt(cliente);
            boolean sw = HuespedI.eliminarhuesped(clienteID);

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

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
