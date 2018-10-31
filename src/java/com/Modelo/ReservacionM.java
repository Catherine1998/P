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
public class ReservacionM {

    private int id;
    private Date fecha_reservacion;
    private Date ingreso;
    private Date salida;
    private String cliente;
    private float total;
    private String tipo_de_habitacion;
    private int Nivel;
    private int numero_habitacion;

    public ReservacionM(int id, Date fecha_reservacion, Date ingreso, Date salida, String cliente, float total, String tipo_de_habitacion, int Nivel, int numero_habitacion) {
        this.id = id;
        this.fecha_reservacion = fecha_reservacion;
        this.ingreso = ingreso;
        this.salida = salida;
        this.cliente = cliente;
        this.total = total;
        this.tipo_de_habitacion = tipo_de_habitacion;
        this.Nivel = Nivel;
        this.numero_habitacion = numero_habitacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Date getFecha_reservacion() {
        return fecha_reservacion;
    }

    public void setFecha_reservacion(Date fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getTipo_de_habitacion() {
        return tipo_de_habitacion;
    }

    public void setTipo_de_habitacion(String tipo_de_habitacion) {
        this.tipo_de_habitacion = tipo_de_habitacion;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(int numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

}
