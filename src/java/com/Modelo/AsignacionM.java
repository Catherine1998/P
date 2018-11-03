/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

/**
 *
 * @author Jorge Escobar
 */
public class AsignacionM {

    private int Idasignacion;
    private int Idregistro;
    private int Idhabitacion;
    private int Idhuesped;
    private String huesped;
    private HabitacionM habitacion;

    public AsignacionM(String huesped) {
        this.huesped = huesped;
    }

    public AsignacionM(int Idhabitacion, int Idhuesped) {
        this.Idhabitacion = Idhabitacion;
        this.Idhuesped = Idhuesped;
    }

    public AsignacionM(int Idasignacion, int Idregistro, int Idhabitacion, int Idhuesped) {
        this.Idasignacion = Idasignacion;
        this.Idregistro = Idregistro;
        this.Idhabitacion = Idhabitacion;
        this.Idhuesped = Idhuesped;
    }

    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }

    public HabitacionM getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(HabitacionM habitacion) {
        this.habitacion = habitacion;
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
