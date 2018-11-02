/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;
import com.conexion.conexionDB;

/**
 *
 * @author Jorge Escobar
 */
public class AsignacionM {
    
    private int Idasignacion;
    private int Idregistro;
    private int Idhabitacion;
    private int Idhuesped;
    conexionDB conect = new conexionDB(); 
    
    public AsignacionM(int Idasignacion, int Idregistro, int Idhabitacion, int Idhuesped)
    {
    this.Idasignacion=Idasignacion;
    this.Idregistro=Idregistro;
    this.Idhabitacion=Idhabitacion;
    this.Idhuesped=Idhuesped;
    }
        /**
     * @return the Idasignacion
     */
    public int getIdasignacion() {
        return Idasignacion;
    }

    /**
     * @param Idasignacion the Idasignacion to set
     */
    public void setIdasignacion(int Idasignacion) {
        this.Idasignacion = Idasignacion;
    }

    /**
     * @return the Idregistro
     */
    public int getIdregistro() {
        return Idregistro;
    }

    /**
     * @param Idregistro the Idregistro to set
     */
    public void setIdregistro(int Idregistro) {
        this.Idregistro = Idregistro;
    }

    /**
     * @return the Idhabitacion
     */
    public int getIdhabitacion() {
        return Idhabitacion;
    }

    /**
     * @param Idhabitacion the Idhabitacion to set
     */
    public void setIdhabitacion(int Idhabitacion) {
        this.Idhabitacion = Idhabitacion;
    }

    /**
     * @return the Idhuesped
     */
    public int getIdhuesped() {
        return Idhuesped;
    }

    /**
     * @param Idhuesped the Idhuesped to set
     */
    public void setIdhuesped(int Idhuesped) {
        this.Idhuesped = Idhuesped;
    }
}
