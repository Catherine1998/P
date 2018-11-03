/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

/**
 *
 * @author fc
 */
public class TransaccionDetalleM {

    private int id;
    private int idTransaccion;
    private int idServicio;
    private int idDocumento;
    private int cantidad;
    private float total;
    private String servicio;
    private String documento;

    public TransaccionDetalleM(int idTransaccion, int idServicio, int idDocumento, int cantidad, float total) {
        this.idTransaccion = idTransaccion;
        this.idServicio = idServicio;
        this.idDocumento = idDocumento;
        this.cantidad = cantidad;
        this.total = total;
    }

    public TransaccionDetalleM(int id, int idTransaccion, int idServicio, int idDocumento, int cantidad, float total) {
        this.id = id;
        this.idTransaccion = idTransaccion;
        this.idServicio = idServicio;
        this.idDocumento = idDocumento;
        this.cantidad = cantidad;
        this.total = total;
    }

    public TransaccionDetalleM(int id, int idTransaccion, int idServicio, int idDocumento, int cantidad, float total, String servicio, String documento) {
        this.id = id;
        this.idTransaccion = idTransaccion;
        this.idServicio = idServicio;
        this.idDocumento = idDocumento;
        this.cantidad = cantidad;
        this.total = total;
        this.servicio = servicio;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

}
