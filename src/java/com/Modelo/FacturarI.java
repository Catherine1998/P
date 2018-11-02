/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

/**
 *
 * @author CatherineV
 */
public class FacturarI {
    
   private int Id_Transaccion;
    private int Id_Servicio;
    private int Id_TipoDocumento; 
     private int Cantidad;
     private int Total;

    public FacturarI(int Id_Transaccion, int Id_Servicio, int Id_TipoDocumento, int Cantidad, int Total) {
        this.Id_Transaccion = Id_Transaccion;
        this.Id_Servicio = Id_Servicio;
        this.Id_TipoDocumento = Id_TipoDocumento;
        this.Cantidad = Cantidad;
        this.Total = Total;
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
    public int getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(int Total) {
        this.Total = Total;
    }
     
}
