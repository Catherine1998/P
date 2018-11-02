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
public class RegistroM {

    private int Idregistro;
    private int Idhuesped;
    private String fhreserva;
    private String fhinregistro;
    private String fhfiregistro;
    private String fhpago;
    private float total;

    public RegistroM(int idhuesped, String fhreserva, String fhinresgistro, 
                        String fhfiregistro, String fhpago, float pago) {
        this.Idhuesped = idhuesped;
        this.fhreserva = fhreserva;
        this.fhinregistro = fhinresgistro;
        this.fhfiregistro = fhfiregistro;
    }

    public RegistroM(int idregistro, int idhuesped, String fhreserva, String fhinresgistro, String fhfiregistro, String fhpago, float pago) {
        this.Idregistro = idregistro;
        this.Idhuesped = idhuesped;
        this.fhreserva = fhreserva;
        this.fhinregistro = fhinresgistro;
        this.fhfiregistro = fhfiregistro;

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

    /**
     * @return the fhreserva
     */
    public String getFhreserva() {
        return fhreserva;
    }

    /**
     * @param fhreserva the fhreserva to set
     */
    public void setFhreserva(String fhreserva) {
        this.fhreserva = fhreserva;
    }

    /**
     * @return the fhinregistro
     */
    public String getFhinregistro() {
        return fhinregistro;
    }

    /**
     * @param fhinregistro the fhinregistro to set
     */
    public void setFhinregistro(String fhinregistro) {
        this.fhinregistro = fhinregistro;
    }

    /**
     * @return the fhfiregistro
     */
    public String getFhfiregistro() {
        return fhfiregistro;
    }

    /**
     * @param fhfiregistro the fhfiregistro to set
     */
    public void setFhfiregistro(String fhfiregistro) {
        this.fhfiregistro = fhfiregistro;
    }

    /**
     * @return the fhpago
     */
    public String getFhpago() {
        return fhpago;
    }

    /**
     * @param fhpago the fhpago to set
     */
    public void setFhpago(String fhpago) {
        this.fhpago = fhpago;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }
}
