/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

import java.sql.Date;

/**
 *
 * @author fc
 */
public class FacturarM {

    private int Id_Transaccion;
    private int Id_Servicio;
    private int Id_TipoDocumento;
    private int Cantidad;
    private float Total;
    private String tipo_documento;
    private String huesped;
    private Date fecha;
    private AsignacionM asignacion;
    private RegistroM registro;

    public FacturarM(int Id_Transaccion, float Total, String tipo_documento, String huesped, Date fecha) {
        this.Id_Transaccion = Id_Transaccion;
        this.Total = Total;
        this.tipo_documento = tipo_documento;
        this.huesped = huesped;
        this.fecha = fecha;
    }

    public FacturarM(int Id_Transaccion, int Id_Servicio, int Id_TipoDocumento, int Cantidad, float Total) {
        this.Id_Transaccion = Id_Transaccion;
        this.Id_Servicio = Id_Servicio;
        this.Id_TipoDocumento = Id_TipoDocumento;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public AsignacionM getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(AsignacionM asignacion) {
        this.asignacion = asignacion;
    }

    public RegistroM getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroM registro) {
        this.registro = registro;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the Id_Transaccion
     */
    public int getId_Transaccion() {
        return Id_Transaccion;
    }

    /**
     * @param Id_Transaccion the Id_Transaccion to set
     */
    public void setId_Transaccion(int Id_Transaccion) {
        this.Id_Transaccion = Id_Transaccion;
    }

    /**
     * @return the Id_Servicio
     */
    public int getId_Servicio() {
        return Id_Servicio;
    }

    /**
     * @param Id_Servicio the Id_Servicio to set
     */
    public void setId_Servicio(int Id_Servicio) {
        this.Id_Servicio = Id_Servicio;
    }

    /**
     * @return the Id_TipoDocumento
     */
    public int getId_TipoDocumento() {
        return Id_TipoDocumento;
    }

    /**
     * @param Id_TipoDocumento the Id_TipoDocumento to set
     */
    public void setId_TipoDocumento(int Id_TipoDocumento) {
        this.Id_TipoDocumento = Id_TipoDocumento;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the Total
     */
    public float getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(float Total) {
        this.Total = Total;
    }
}
